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
public class Pandilla_duendes extends Comun{

    public Pandilla_duendes() {
        super();
    }

    public Pandilla_duendes(String nombre, int dano, int p_vida, String objetivo, String velocidad, int c_elixir, String tipo) {
        super(nombre, dano, p_vida, objetivo="Aereo", velocidad="Alta", c_elixir=3, tipo);
    }

    @Override
    public String toString() {
        return "Pandilla de duendes";
    }
    
    
    
}
