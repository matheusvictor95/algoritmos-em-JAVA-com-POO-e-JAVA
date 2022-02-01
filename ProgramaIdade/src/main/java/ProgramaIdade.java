
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
public class ProgramaIdade {
    public static void main (String[] args){
        Scanner t = new Scanner(System.in);
        System.out.println("em que ano você nasceu? ");
        int nasc = t.nextInt();
        int i = 2021-nasc;
        System.out.println("Sua idade é:" +i);
        if (i>=18){
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de Idade");
        }
    }
}
