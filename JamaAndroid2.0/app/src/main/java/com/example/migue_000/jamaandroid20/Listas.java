package com.example.migue_000.jamaandroid20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.Serializable;
import java.util.List;

public class Listas extends AppCompatActivity {
    ArrayAdapter<String> adapter;
    private ListView listView;
    //   private String[]pasta = {"Pizza" , "Lasagna"};
    private List<Platillo> array;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Intent intent1 = new Intent(this, DescripcionPlatillo.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listas);
        listView = (ListView) findViewById(R.id.lista1);
        final String[]list= (String[]) getIntent().getSerializableExtra("lista");
        array = (List<Platillo>) getIntent().getSerializableExtra("array");
        // List<Platillo>lista=
        //    TextView textView = (TextView) findViewById(R.id.txthola);
        //    textView.setText(lista.get(1).getNombre());
        adapter = new ArrayAdapter<String>
                (this,android.R.layout.simple_expandable_list_item_1,list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String platillo =  list[+ position];
                intent1.putExtra("platillo",(Serializable) obtenerPlatillos(platillo));
                startActivity(intent1);
            }
        });
    }
    public Platillo obtenerPlatillos(String platillo){
        Platillo lista= null;
        for (Platillo pl: array){
            if(pl.getNombre().equalsIgnoreCase(platillo)){
                lista = pl;
            }
        }
        return lista;
    }
}
