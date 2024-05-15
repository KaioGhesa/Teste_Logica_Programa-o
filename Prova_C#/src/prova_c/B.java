package prova_c;
import java.util.Scanner;

/*Com base na tabela de preços ao lado, faça
um programa que leia o código de um item e a
quantidade deste item. A seguir, calcule e
mostre o valor da conta a pagar.**/

public class B {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Tabela de Preços:");
        System.out.println("1 - Cachorro Quente: R$4,00");
        System.out.println("2 - X-Salada: R$4,50");
        System.out.println("3 - X-Bacon: R$5,00");
        System.out.println("4 - Torrada Simples: R$2,00");
        System.out.println("5 - Refrigerante: R$1,50");
        
        System.out.println("Insira o codigo do item: ");
        int codigo = sc.nextInt();
        
        System.out.println("Insira a quantidade: ");
        int qtd = sc.nextInt();
        
        double precoUnitario = 0.0;
        
        switch(codigo){
        
            case 1:
                precoUnitario = 4.00;
                break;
         
            case 2:
                precoUnitario = 4.50;
                break;
            
            case 3:
                precoUnitario = 5.00;
                break;
             
            case 4:
                precoUnitario = 2.00;
                break;
                
            case 5:
                precoUnitario = 1.50;
                break;
                
            
            default:
             
                System.out.println("Código inválido. ");
                System.exit(0);
        }

        double total = precoUnitario *qtd;
        
        System.out.println("Valor total a pagar: R$" + total);
        
    }
}
