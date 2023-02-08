package logica1;

import java.util.Scanner;

public class Logica1 {
    static double saldo = -10.5;
    
    public static void main(String[] args) {      
        verificaSaldo(); //Invocando a função "verificaSaldo()"
        saldo += 100;
        verificaSaldo();
        saldo += 100;
        verificaSaldo();
    }
    
    //Função / Método
    public static void verificaSaldo() {
        System.out.println(saldo);
        
     
if(saldo < 0) {
            System.out.println("Está no vermelho!");
        } else if (saldo > 0 && saldo < 100) {
            System.out.println("Você é pobre...");
        } else {
            System.out.println("Já dá pra pagar um lanche!");
        }
    }
    
}