/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author ACER
 */
public class Segitiga implements HitungBidang{
    public double a, b, c;
    
    public Segitiga (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;   
    }

    @Override
    public double Luas() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
        //rumus heron
    }

    @Override
    public double Keliling() {
        return (a + b + c);
    }
    
    
}
