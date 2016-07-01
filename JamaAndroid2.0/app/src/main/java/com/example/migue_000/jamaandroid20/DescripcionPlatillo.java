package com.example.migue_000.jamaandroid20;

import android.animation.Animator;
import android.content.Context;
import android.os.Build;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
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
        LinearLayout linearLayout= (LinearLayout) findViewById(R.id.descripcion);
        platillo= (Platillo) getIntent().getSerializableExtra("platillo");
        texto1.setText(platillo.getNombre().toString());
        texto2.setText(platillo.getDesc().toString());
        Picasso.with(context).load(platillo.getImagen()).into(imagen);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
