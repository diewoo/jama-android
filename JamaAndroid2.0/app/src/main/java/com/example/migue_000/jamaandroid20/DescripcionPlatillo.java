package com.example.migue_000.jamaandroid20;

import android.animation.Animator;
import android.content.Context;
import android.os.Build;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

public class DescripcionPlatillo extends AppCompatActivity {
    private Platillo platillo= null;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion_platillo);
        TextView texto1 = (TextView) findViewById(R.id.txttitulo);
        TextView texto2 = (TextView) findViewById(R.id.desc);
        ImageView imagen = (ImageView) findViewById(R.id.imagen);
        platillo= (Platillo) getIntent().getSerializableExtra("platillo");
        texto1.setText(platillo.getNombre().toString());
        texto2.setText(platillo.getDesc().toString());
        Picasso.with(context).load(platillo.getImagen()).into(imagen);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        assert fab != null;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, (CharSequence) createLoginDialogo(), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public AlertDialog createLoginDialogo(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View v = inflater.inflate(R.layout.activity_comprar, null);
        builder.setView(v);
        Button comprar = (Button) v.findViewById(R.id.butComprar);
        final EditText editText = (EditText) v.findViewById(R.id.edtcantidad);
        final int cant = Integer.parseInt(editText.toString());
        comprar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int monto = obtenerMonto(platillo.getPrecio(), cant);
                    }
                }
        );
        TextView textView = (TextView) findViewById(R.id.txtmonto);
        textView.setText("El monto a pagar es " + obtenerMonto(platillo.getPrecio(),cant) );
        return builder.create();
    }
    public int obtenerMonto(int precio, int cant){
        int monto=0;
        monto = precio * cant;
        return monto;
    }
}
