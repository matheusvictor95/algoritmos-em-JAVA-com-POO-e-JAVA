/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matheus
 */
public class Contador {
    public static void main (String[] args){
        int cc =0;
        while (cc<10){
            cc++;
            if (cc==5 || cc==7){
                continue;
            }
            System.out.println("Cambalhota");
            //cc++;
        }
    }
}
