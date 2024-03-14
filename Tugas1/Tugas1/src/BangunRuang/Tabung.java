/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

import BangunDatar.Lingkaran;

/**
 *
 * @author ACER
 */
public class Tabung extends Lingkaran implements HitungRuang{
    double t;
    
    public Tabung (double r, double t){
        super(r);
        this.t = t;
    }

    @Override
    public double Volume() {
        return Luas() * t;
    }

    @Override
    public double LuasPermukaan() {
        return 2 * Luas() + t * Keliling();
    }
    
    
}
