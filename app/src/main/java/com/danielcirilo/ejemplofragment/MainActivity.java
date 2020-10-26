package com.danielcirilo.ejemplofragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ICorreosListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentListado fragmentListado = (FragmentListado) getSupportFragmentManager().findFragmentById(R.id.FrgListado);
        fragmentListado.setListener(this);

    }

    @Override
    public void oncorreoSeleccionado(Correo c) {
        boolean hayDetalle = (getFragmentManager().findFragmentById(R.id.FrgDetalle) != null);
        if(hayDetalle) {
            ((FragmentDetalle)getSupportFragmentManager().findFragmentById(R.id.FrgDetalle)).mostrarDetalle(c.getTexto());
        } else {
            Intent i = new Intent(this, DetalleActivity.class);
            i.putExtra(DetalleActivity.EXTRA_TEXTO, c.getTexto());
            startActivity(i);
        }
    }
}

