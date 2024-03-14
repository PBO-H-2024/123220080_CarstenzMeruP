/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author ACER
 */public class Lingkaran implements HitungBidang {
    public Double r, pi = Math.PI;
    
    public Lingkaran (double r){
        this.r = r;
    }

    @Override
    public double Luas() {
        return (pi * r * r);
    }

    @Override
    public double Keliling() {
        return (2 * pi * r);
    }
    
    
    
}
