package com.danielcirilo.ejemplofragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentDetalle extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup
            container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detalle, container, false);
    }
    public void mostrarDetalle(String texto) {
        TextView tvDetalle = getView().findViewById(R.id.tvDetalle);
        tvDetalle.setText(texto);
    }
}