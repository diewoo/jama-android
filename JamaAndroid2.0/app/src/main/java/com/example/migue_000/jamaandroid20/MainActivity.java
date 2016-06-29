package com.example.migue_000.jamaandroid20;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private LinearLayout linearLayout;
    private LinearLayout linearLayout2;
    private boolean userlog;
    Context context = this;
    private String userlogeado;
    String arreglo;
    private String[]list1;
    private Platillo platillo;
    private List<Platillo> listaPlat= (new AgregarPlatillo()).getPlatillo();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        TextView textView = (TextView) findViewById(R.id.txtlog);
        Bundle bundle = getIntent().getExtras();
        String user = bundle.getString("usuario");
        textView.setText("Bienvenido " + user);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_login) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
*/
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        Intent intent2 = new Intent(this, Login.class);
        int id = item.getItemId();
        String nombre = item.getTitle().toString();
            //if( id == R.id.nav_logout){
              //  startActivity(intent2);
                //userlog = false;
           // }
            Intent intent = new Intent(this, Listas.class);
            List<Platillo> array = obtenerPlatillos(nombre);
            intent.putExtra("array", (Serializable) array);
            intent.putExtra("lista", (Serializable) llenarListView(list1, array));
            startActivity(intent);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public String[] llenarListView(String[]lista, List<Platillo> array) {
        int cont = 0;
        lista = new String[array.size()];
        for (Platillo pl : array) {
            lista[cont]=array.get(cont).getNombre();
            cont++;
        }
        return lista;
    }
    public List<Platillo> obtenerPlatillos(String tag){
        List<Platillo>lista= new ArrayList<>();
        for(Platillo pl : listaPlat){
            if(pl.getTag().equalsIgnoreCase(tag)){
                lista.add(pl);
            }
        }
        return lista;
    }
}
