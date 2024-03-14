/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas1;


import BangunRuang.LimasSegitiga;
import BangunRuang.Tabung;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String backToMenu;
        int menu;
        
        do {
            System.out.println("\n--MENU--");
            System.out.println("\n1. Tabung \n2. Limas Segitiga");
            System.out.print("=> ");
            menu = scan.nextInt();
            if(menu == 1){
                double r, t;
                System.out.print("jari-jari tabung : ");
                r = scan.nextDouble();
                System.out.print("tinggi tabung : ");
                t = scan.nextDouble();
                Tabung tabung = new Tabung(r, t);
                System.out.println("\nHasil Perhitungan : \n");
                System.out.println("keliling : " + tabung.Keliling());
                System.out.println("Luas lingkaran : " + tabung.Luas());
                System.out.println("Volume tabung : " + tabung.Volume());
                System.out.println("Luas permukaan : " + tabung.LuasPermukaan());
            }else if(menu == 2){
                double a, b, c, t;
                System.out.print("sisi 1 : ");
                a = scan.nextDouble();
                System.out.print("sisi 2 : ");
                b = scan.nextDouble();
                System.out.print("sisi 3 : ");
                c = scan.nextDouble();
                System.out.print("tinggi limas : ");
                t = scan.nextDouble();
                LimasSegitiga limas = new LimasSegitiga(a, b, c, t);
                System.out.println("\nHasil Perhitungan : ");
                System.out.println("keliling : " + limas.Keliling());
                System.out.println("Luas lingkaran : " + limas.Luas());
                System.out.println("Volume tabung : " + limas.Volume());
                System.out.println("Luas permukaan : " + limas.LuasPermukaan());
            }else{
                System.out.println("\nSalah pilih masse");
            }
            
            System.out.print("\nBack to menu? (y/n) \n=> ");
            backToMenu = scan.next();
        } while (backToMenu.equals("y"))  ;  
    }
    
}
