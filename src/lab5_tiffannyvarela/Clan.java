/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_tiffannyvarela;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author tiffa
 */
public class Clan {
    private String nombre;
    private ArrayList <Usuario> miembros = new ArrayList();
    private Date f_creacion;
    private String usuario_lider;
    private String tipo_clan;

    public Clan() {
    }

    public Clan(String nombre, Date f_creacion, String usuario_lider, String tipo_clan) {
        this.nombre = nombre;
        this.f_creacion = f_creacion;
        this.usuario_lider = usuario_lider;
        this.tipo_clan = tipo_clan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuario> miembros) {
        this.miembros = miembros;
    }

    public Date getF_creacion() {
        return f_creacion;
    }

    public void setF_creacion(Date f_creacion) {
        this.f_creacion = f_creacion;
    }

    public String getUsuario_lider() {
        return usuario_lider;
    }

    public void setUsuario_lider(String usuario_lider) {
        this.usuario_lider = usuario_lider;
    }

    public String getTipo_clan() {
        return tipo_clan;
    }

    public void setTipo_clan(String tipo_clan) {
        this.tipo_clan = tipo_clan;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
