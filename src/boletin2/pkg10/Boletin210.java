/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg10;

import java.util.Scanner;

/**
 *
 * @author ggarciaalvarez
 */
public class Boletin210 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int B;//Soldo bruto
        int L;//Soldo liquido
        int S;//Soldo fixo
        int C;//Comision
        int Q;//quilometraxe
        int D;//dietas
        int p;//IRPF
        int R;//Retencion da seguridade social
        int V;//ventas
        int K;//kilometros
        int d;;//dias
        System.out.println("Introduzca el sueldo fijo");
        Scanner obx1 = new Scanner (System.in);//Pedir soldo fixo
        S = obx1.nextInt();
        System.out.println("Introduzca las ventas realizadas");
        Scanner obx2 = new Scanner (System.in);//Pedir ventas
        V = obx2.nextInt();
        C=5*V/100;
        System.out.println("Introduzca la cantidad de dias de desplazamiento");
        Scanner obx3 = new Scanner (System.in);//Pedir dias
        d = obx3.nextInt();
        D=30*d;
        System.out.println("Introduzca la cantidad de kilometros recorridos");
        Scanner obx4 = new Scanner (System.in);//Pedir kilometros recorridos
        K = obx4.nextInt();
        Q=2*K;
        B=S+C+Q+D;
        L=B-(B*18/100)-36;
        System.out.println(B+" soldo bruto");
        System.out.println(L+" soldo liquido");
    }
    
}
