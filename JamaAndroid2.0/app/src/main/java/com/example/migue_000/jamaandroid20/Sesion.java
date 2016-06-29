package com.example.migue_000.jamaandroid20;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by migue_000 on 29/06/2016.
 */
public class Sesion {
    private Usuario user;
    private boolean log;
    private List<Usuario> listUsers=new ArrayList<>();

    public Sesion(Usuario user,boolean log,  List<Usuario> listUsers) {
        this.user = user;
        this.log = log;
        this.listUsers = listUsers;
    }
    public List<Usuario> llenarLista(){
        List<Usuario> lista = new ArrayList<>();
        //    int idregistrousuario, String usuario, String pass, String nombre, String apellido, String direccion, int telefono, String email, String fechanacimient
        lista.add(new Usuario(1, "miguel", "12345", "Miguel", "Bernedo", "casa", "123456789", "miguel@jama.com.pe", "09/01/1994"));
        lista.add(new Usuario(2, "christian", "12345", "Christian", "Valencia", "casa", "123456789", "christian@jama.com.pe", "01/01/01"));
        lista.add(new Usuario(3, "diego", "12345", "Diego", "Rojas", "casa", "123456789", "diego@jama.com.pe", "01/01/01"));
        lista.add(new Usuario(4, "oscar", "12345", "Oscar", "Diaz", "casa", "123456789", "oscar@jama.com.pe", "01/01/01"));
        lista.add(new Usuario(5, "sebastian", "12345", "Sebastian", "Rey", "casa", "123456789", "sebastian@jama.com.pe", "01/01/01"));
        lista.add(new Usuario(6, "marco", "12345", "Marco", "Payano", "casa", "123456789", "marco@jama.com.pe", "01/01/01"));
        lista.add(new Usuario(7, "jordi", "12345", "Jordi", "Apaclla", "casa", "123456789", "jordi@jama.com.pe", "01/01/01"));
        lista.add(new Usuario(8, "steve", "12345", "Steve", "Rivera", "casa", "123456789", "steve@jama.com.pe", "01/01/01"));
        lista.add(new Usuario(9, "papurente", "12345", "Diego", "Renteria", "casa", "123456789", "rente@jama.com.pe", "01/01/01"));
        lista.add(new Usuario(10, "falso", "12345", "Miguel", "De La Torre", "casa", "123456789", "falso@jama.com.pe", "01/01/01"));
        return lista;
    }


    public boolean validarLog(String user, String pass){
        boolean log = false;

        return log;
    }

    public Sesion(Usuario user) {
        this.user = user;
    }

    public Sesion(List<Usuario> listUsers) {
        this.listUsers = listUsers;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public List<Usuario> getListUsers() {
        return listUsers;
    }

    public void setListUsers(List<Usuario> listUsers) {
        this.listUsers = listUsers;
    }

    public boolean isLog() {
        return log;
    }

    public void setLog(boolean log) {
        this.log = log;
    }
}