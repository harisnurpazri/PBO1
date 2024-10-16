
package belajar_java.pkg1;
import java.util.Scanner;
public class Belajar_java1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int P, L, Luas, Kel;
        System.out.print ("Masukan P = ");
        P = input.nextInt();
        System.out.print ("Masukan L = ");
        L = input.nextInt();
        Luas = P * L;
        Kel = P + P + L + L;
        
        System.out.println ("Luas = "+P+" x "+L);
        System.out.println ("Luas = "+Luas+"\n");
        
        System.out.println ("Kel = "+P+" + "+P+" + "+L+" + "+L);
        System.out.println ("Kel = "+Kel+"\n");
        
    } 
}
