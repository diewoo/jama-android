package com.example.migue_000.jamaandroid20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Login extends AppCompatActivity {
    private boolean userlog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
      //  if(userlog==true){

      //  }
    }
    public void ejecutar(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        EditText edit = (EditText) findViewById(R.id.txtuser);
        String user = edit.getText().toString();
        EditText edit2 = (EditText) findViewById(R.id.txtpass);
        String pass = edit2.getText().toString();
        if(in(user) && pass.equalsIgnoreCase("12345") ){
            userlog=true;
            intent.putExtra("usuario", user);
            startActivity(intent);
        }else{
            Toast mensaje = Toast.makeText(this, "Datos incorrectos", Toast.LENGTH_LONG);
            mensaje.show();
            userlog=false;
        }
    }
    public boolean in(String user){
        List<String> usuarios= new ArrayList<>();
        usuarios.add("miguel");
        usuarios.add("diego");
        usuarios.add("christian");
        usuarios.add("oscar");
        usuarios.add("marco");
        usuarios.add("jordi");
        usuarios.add("sebastian");
        usuarios.add("steve");
        boolean is = false;
        for ( String rec: usuarios){
            if(user.equalsIgnoreCase(rec)){
                is = true;
            }
        }
        return is;
    }
}
