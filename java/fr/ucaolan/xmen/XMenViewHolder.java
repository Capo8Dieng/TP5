package fr.ucaolan.xmen;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import fr.ucaolan.xmen.databinding.XMenBinding;

public class XMenViewHolder extends RecyclerView.ViewHolder
{
    private final XMenBinding ui;
    public XMenViewHolder(@NonNull XMenBinding ui)
    {
        super(ui.getRoot());
        this.ui = ui;
    }
    public void setXMen(XMen xmen)
    {
        ui.nom.setText(xmen.getNom());
        ui.alias.setText(xmen.getAlias());
        ui.description.setText(xmen.getDescription());
        ui.pouvoirs.setText(xmen.getPouvoirs());
        ui.image.setImageResource(xmen.getIdImage());
    }

}