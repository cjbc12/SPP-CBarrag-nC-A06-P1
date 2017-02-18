/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cbarragánc.a06.p1;

import java.util.Scanner;

/**
 *
 * @author Barra
 */
public class SPPCBarragánCA06P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb= new Scanner (System.in);
        int num;
        int suma=0;
        num=solicitarDatos();
        
        while(num>0){
            suma= calcularSuma(suma, num);
            num=solicitarDatos();
        }
        
        System.out.println("El resultado de la suma es:" +suma);
    }
    static int solicitarDatos() {
        Scanner kb= new Scanner (System.in);
        int num;
        
        System.out.println("Introduce un numero: ");
        try {
        num= kb.nextInt();
        }
        catch (Exception e){
        System.out.println("Esto no es un numero entero");
        num=0;
        }
        return num;
        }
           
    static int calcularSuma(int suma, int num){
        suma= suma+num;
        return suma;
    }
}

