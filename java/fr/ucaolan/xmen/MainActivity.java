package fr.ucaolan.xmen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

import fr.ucaolan.xmen.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding ui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());
        // obtenir la liste
        XMenApplication application = (XMenApplication) getApplication();
        List<XMen> liste = application.getListe();
        // créer l'adaptateur
        XMenAdapter adapter = new XMenAdapter(liste);
        // fournir l'adaptateur au recycler
        ui.recycler.setAdapter(adapter);
        // dimensions constantes
        ui.recycler.setHasFixedSize(true);
        // layout manager
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        ui.recycler.setLayoutManager(lm);
        // séparateur
        DividerItemDecoration dividerItemDecoration =
                new DividerItemDecoration(
                        this, DividerItemDecoration.VERTICAL);
        ui.recycler.addItemDecoration(dividerItemDecoration);

    }
}