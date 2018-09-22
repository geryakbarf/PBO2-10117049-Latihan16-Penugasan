/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan16.penugasan;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama                 : Gery Akbar Fauzi
 * Kelas                : PBO2
 * Nim                  : 10117049
 * Deskripsi Program    : Program ini berisi program operasi bilangan dengan
 *                        operator penugasan
 */
public class PBO210117049Latihan16Penugasan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        
        System.out.println("Nilai a = "+ a);
        System.out.println("Nilai b = "+ b);
        System.out.println("Nilai c = "+ c);
        System.out.println("");
        
        c = a + b;
        System.out.println("c = a + b = "+ c);
        c += a;
        System.out.println("c += a = "+ c);
        c -= a;
        System.out.println("c -= a = "+ c);
        c *= a;
        System.out.println("c *= a = "+ c);
        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a = "+ c);
        a = 10;
        c = 15;
        c %= a;
        System.out.println("c %= a = "+ c);
        c <<= 2;
        System.out.println("c <<= 2 = "+ c);
        c >>= 2;
        System.out.println("c >>= 2 = "+ c);
        c >>= 2;
        System.out.println("c >>= a = "+ c);
        c &= a;
        System.out.println("c &= 2 = "+ c);
        c ^= a;
        System.out.println("c ^= a = "+ c);
        c |= a;
        System.out.println("c |= a = "+ c);
    }
    
}
