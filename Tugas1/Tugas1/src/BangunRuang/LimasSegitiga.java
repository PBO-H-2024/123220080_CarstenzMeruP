/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

import BangunDatar.Segitiga;

/**
 *
 * @author ACER
 */
public class LimasSegitiga extends Segitiga implements HitungRuang{
    double t;
    
    public LimasSegitiga (double a, double b, double c, double t){
        super(a, b, c);
        this.t = t;
    }

    @Override
    public double Volume() {
        return Luas() * t / 3;
    }

    @Override
    public double LuasPermukaan() {
        return (Luas() + (a*t/2) + (b*t/2) + (c*t/2));
    }
    
}
