/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_tiffannyvarela;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author tiffa
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String n_usuario;
    private String contrasena;
    private Date f_nacimiento;
    private int edad;
    private Color color;
    private ArrayList <Mazo> mazos = new ArrayList();

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String n_usuario, String contrasena, Date f_nacimiento, int edad, Color color) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.n_usuario = n_usuario;
        this.contrasena = contrasena;
        this.f_nacimiento = f_nacimiento;
        this.edad = edad;
        this.color = color;
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

    public String getN_usuario() {
        return n_usuario;
    }

    public void setN_usuario(String n_usuario) {
        this.n_usuario = n_usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(Date f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<Mazo> getMazos() {
        return mazos;
    }

    public void setMazos(ArrayList<Mazo> mazos) {
        this.mazos = mazos;
    }

    @Override
    public String toString() {
        return n_usuario;
    }
    
    
    
}
