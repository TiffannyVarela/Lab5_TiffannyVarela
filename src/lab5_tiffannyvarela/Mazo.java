/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_tiffannyvarela;

import java.util.ArrayList;

/**
 *
 * @author tiffa
 */
public class Mazo {
    private double coste;
    private ArrayList <Carta> cartas = new ArrayList();

    public Mazo() {
    }

    public Mazo(double coste) {
        this.coste = coste;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Mazo{" + "coste=" + coste + ", cartas=" + cartas + '}';
    }
    
    
}
