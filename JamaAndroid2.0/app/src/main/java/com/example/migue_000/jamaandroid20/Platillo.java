package com.example.migue_000.jamaandroid20;

import java.io.Serializable;

/**
 * Created by migue_000 on 29/06/2016.
 */
public class Platillo implements Serializable {
    private int id;
    private String nombre, imagen, desc, tag;
    private int precio;

    public Platillo(int id, String nombre, String imagen, String desc, String tag, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.desc = desc;
        this.tag = tag;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getTag(){
        return tag;
    }

    public void setTag(String tag){
        this.tag = tag;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}

