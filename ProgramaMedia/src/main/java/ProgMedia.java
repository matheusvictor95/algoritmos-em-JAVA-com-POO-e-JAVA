
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matheus
 */
public class ProgMedia {
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);
        float n1 = teclado.nextFloat();
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua média foi "+m);
        if (m>9){
            System.out.println("Parabéns");
        }
        
    }
}
