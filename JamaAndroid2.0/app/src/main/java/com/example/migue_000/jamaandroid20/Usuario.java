package com.example.migue_000.jamaandroid20;

/**
 * Created by migue_000 on 29/06/2016.
 */
public class Usuario {

    private int idregistroUsuario;
    private String usuario;
    private String pass;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;
    private String fechanacimiento;

    public Usuario(int idregistrousuario,String usuario, String pass, String nombre, String apellido, String direccion, String telefono, String email, String fechanacimiento) {
        this.idregistroUsuario = idregistrousuario;
        this.usuario = usuario;
        this.pass = pass;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.fechanacimiento = fechanacimiento;
    }

    public Usuario(String usuario, String pass){
        this.usuario = usuario;
        this.pass = pass;
    }

    public Usuario() {
    }

    public int getIdregistroUsuario() {
        return idregistroUsuario;
    }

    public void setIdregistroUsuario(int idregistroUsuario) {
        this.idregistroUsuario = idregistroUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    public String getUsuario(){ return usuario;}

    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public String getPass(){ return pass;}

    public void setPass(String pass){
        this.pass= pass;
    }
}