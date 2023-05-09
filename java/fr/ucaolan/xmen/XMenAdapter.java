package fr.ucaolan.xmen;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import fr.ucaolan.xmen.databinding.XMenBinding;

public class XMenAdapter extends RecyclerView.Adapter<XMenViewHolder> {

    private List<XMen> liste;
    public XMenAdapter (List<XMen> liste ){
        this.liste=liste;
    }
    @NonNull
    @Override
    public XMenViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            XMenBinding ui = XMenBinding.inflate(
                    LayoutInflater.from(parent.getContext()),
                    parent,
                    false);
            return new XMenViewHolder(ui);

    }

    @Override
    public void onBindViewHolder(@NonNull XMenViewHolder holder, int position) {

        holder.setXMen(liste.get(position));

    }

    @Override
    public int getItemCount() {
        return liste.size();
    }
}
