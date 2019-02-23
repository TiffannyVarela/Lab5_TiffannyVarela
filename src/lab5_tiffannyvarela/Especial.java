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
public class Especial extends Carta{
    private String objetivo;
    private String velocidad;
    private int c_elixir;
    private String tipo;

    public Especial() {
        super();
    }

    public Especial(String objetivo, String velocidad, int c_elixir, String tipo, String nombre, int dano, int p_vida) {
        super(nombre, dano, p_vida);
        this.objetivo = objetivo;
        this.velocidad = velocidad;
        this.c_elixir = c_elixir;
        this.tipo = "Especial";
    }

    @Override
    public String toString() {
        return "Especial";
    }
    
    
    
}
