

/*package logica1;

import java.util.Scanner; //Importando a classe "Scanner"

public class Logica1 {
        
    public static void main(String[] args) {
        boolean control = false;
        int num = 0;
        
        Scanner readNumber = new Scanner(System.in);
        System.out.println("Digite um número PAR:");
                
        while(!control) {
            int numRead = readNumber.nextInt();
            if(numRead % 2 == 0) {
                num = numRead;
                control = !control;
            } else {
                System.out.println("Você digitou um ÍMPAR...tente de novo.");
            }
        }
        
        int[] numPares = new int[(num/2)];
        int[] numImpares = new int[(num/2)];
        int indexImpar = 0;
        int indexPar = 0;
        
        while(indexPar < numPares.length) {
            if(num % 2 == 1) {
                numPares[indexPar] = num;
                indexPar++;
            } else {
                numImpares[indexImpar] = num;
                indexImpar++;
            }
            
            num--; //Decrementando o número inicial
        }
        
        System.out.println("Números ímpares:");
        for(int i = 0; i < numPares.length; i++) {
            System.out.println(numPares[i]);
        }
        
        System.out.println("Números pares:");
        for(int i = 0; i < numImpares.length; i++) {
            System.out.println(numImpares[i]);
        }
    }
}package logica1;

import java.util.Scanner; //Importando a classe "Scanner"

public class Logica1 {
        
    public static void main(String[] args) {
        boolean control = false;
        int num = 0;
        
        Scanner readNumber = new Scanner(System.in);
        System.out.println("Digite um número PAR:");
                
        while(!control) {
            int numRead = readNumber.nextInt();
            if(numRead % 2 == 0) {
                num = numRead;
                control = !control;
            } else {
                System.out.println("Você digitou um ÍMPAR...tente de novo.");
            }
        }
        
        int[] numPares = new int[(num/2)];
        int[] numImpares = new int[(num/2)];
        int indexImpar = 0;
        int indexPar = 0;
        
        while(indexPar < numPares.length) {
            if(num % 2 == 1) {
                numPares[indexPar] = num;
                indexPar++;
            } else {
                numImpares[indexImpar] = num;
                indexImpar++;
            }
            
            num--; //Decrementando o número inicial
        }
        
        System.out.println("Números ímpares:");
        for(int i = 0; i < numPares.length; i++) {
            System.out.println(numPares[i]);
        }
        
        System.out.println("Números pares:");
        for(int i = 0; i < numImpares.length; i++) {
            System.out.println(numImpares[i]);
        }
    }
}
*/