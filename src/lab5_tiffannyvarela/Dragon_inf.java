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
public class Dragon_inf extends Legendaria{

    public Dragon_inf() {
        super();
    }

    public Dragon_inf(String objetivo, String velocidad, int c_elixir, String tipo, String nombre, int dano, int p_vida) {
        super(objetivo="Aereo", velocidad="Media", c_elixir=4, tipo, nombre, dano, p_vida);
    }

    @Override
    public String toString() {
        return "Dragon infernal";
    }
    
    
}
