/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg0a100;

import java.util.Random;

/**
 *
 * @author 50494
 */
public class Main {

   
    public static void llenar() {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            a[i]=Math.abs(r.nextInt()%100);     
        } 
    }
    static void mostrar(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i++ "-->" +a[i]);
            
        }
    
    }
    
    static void burbujas();
        int temp;
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                if(a[y-1] >= a[y]){
                    temp = a[y];
                    a[y]=a[y-1];
                    a[y-1]=temp;
                
                }
                
            
            }

}
static int a[]=new int[10];
public static void main(String[] args){
    llenar();
    mostrar();
    burbujas();
    System.out.println("Los numeros en orden serian: ");
    mostrar();

}
    
    
}
