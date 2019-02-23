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
public class Gigante_nob extends Comun{

    public Gigante_nob() {
        super();
    }

    public Gigante_nob(String nombre, int dano, int p_vida, String objetivo, String velocidad, int c_elixir, String tipo) {
        super(nombre, dano, p_vida, objetivo="Terrestre", velocidad="Media", c_elixir=6, tipo);
    }

    @Override
    public String toString() {
        return "Gigante noble";
    }
    
    
    
}
