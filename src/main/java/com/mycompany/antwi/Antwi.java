/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.antwi;

/**
 *
 * @author software.engineering
 */
import java.util.Scanner;
public class Antwi {

    public static void main(String[] args) {
        Scanner Anntwi = new Scanner(System.in);
        
        System.out.println("input the First number?");
        int First = Anntwi.nextInt();
        
        System.out.println("input the Second number?");
        int Second = Anntwi.nextInt();
        
        
        
        System.out.println("The Sum Of " + First + " + " + Second + " == " + (Second + First));
        System.out.println("The Product Of " + First + " * " + Second + " == " + (Second + First));
        System.out.println("The Difference Of " + First + " - " + Second + " == " + (Second + First));
    }
}
