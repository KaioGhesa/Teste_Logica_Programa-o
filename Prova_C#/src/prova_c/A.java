package prova_c;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double peça1,numPeça1,valorUnit1,peça2,numPeça2,valorUnit2,som1,som2, valorTotal;
        
        System.out.println("Qual o codigo do primeiro produto?: ");
        peça1 = sc.nextDouble();
        
        System.out.println("Qual a quantidade de pecas do primeiro produto?:");
        numPeça1 = sc.nextDouble();
        
        System.out.println("Qual o valor unitario?: ");
        valorUnit1 = sc.nextDouble();
        
        som1 = valorUnit1 * numPeça1;
        
        
        System.out.println("Qual o codigo do segundo produto?: ");
        peça2 = sc.nextDouble();
        
        System.out.println("Qual a quantidade de pecas do primeiro produto?:");
        numPeça2 = sc.nextDouble();
        
        System.out.println("Qual o valor unitario?: ");
        valorUnit2 = sc.nextDouble();
        
        som2 = valorUnit2 * numPeça2;
        
        valorTotal = som1 + som2;
        
        
        System.out.println("-------");
        System.out.println("Valor total de suas compras: " + valorTotal);
        
    }
}
