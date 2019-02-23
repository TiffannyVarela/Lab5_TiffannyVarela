/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_tiffannyvarela;

/**
 *
 * @author tiffa
 */
public class Carta {
    private String nombre;
    private int dano;
    private int p_vida;

    public Carta() {
    }

    public Carta(String nombre, int dano, int p_vida) {
        this.nombre = nombre;
        this.dano = dano;
        this.p_vida = p_vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getP_vida() {
        return p_vida;
    }

    public void setP_vida(int p_vida) {
        this.p_vida = p_vida;
    }


    @Override
    public String toString() {
        return nombre;
    }

    
    
}
