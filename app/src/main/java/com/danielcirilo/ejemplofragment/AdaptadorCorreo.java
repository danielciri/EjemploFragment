package com.danielcirilo.ejemplofragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AdaptadorCorreo extends ArrayAdapter<Correo> {
    private Context context;
    private Correo[] datos;
    public AdaptadorCorreo(Fragment context, Correo[] datos) {
        super(context.getActivity(), R.layout.listitem_correo, datos);
        this.datos = datos;
        this.context = context.getActivity();
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View item = inflater.inflate(R.layout.listitem_correo, null);
        TextView tvDe =item.findViewById(R.id.tvDe);
        tvDe.setText(datos[position].getDe());
        TextView tvAsunto = (TextView)item.findViewById(R.id.tvAsunto);
        tvAsunto.setText(datos[position].getAsunto());
        return item;
    }
}