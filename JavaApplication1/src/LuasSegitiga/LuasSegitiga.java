/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LuasSegitiga;

import java.util.Scanner;

/**
 *
 * @author Kadek William Darmawan
 */
public class LuasSegitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dtain = new Scanner(System.in);
        
        Number luas;
        int a = 0;
        int t = 0;
        String nilai = "";
                
        System.out.println("Hitung Luas Segitiga");
        System.out.print("Input Alas Segitiga: ");
        nilai = dtain.nextLine();
        a = Integer.parseInt(nilai);
        System.out.print("Input Tinggi Segitiga: ");
        nilai = dtain.nextLine();
        t = Integer.parseInt(nilai);
        luas = a * t;
        
        System.out.println("Luas Segitiga: "+luas);
    }
    
}
