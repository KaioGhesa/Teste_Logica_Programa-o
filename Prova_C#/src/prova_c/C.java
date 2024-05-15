package prova_c;
import java.util.Scanner;

public class C {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int senhaCorreta = 2002;
        int senhaDigitada = 0;
        
        do {
        
            System.out.println("Digite sua senha: ");
            senhaCorreta = sc.nextInt();
            
            if (senhaDigitada != senhaCorreta){
                System.out.println("Acesso Negado");
            }
        } while (senhaDigitada == senhaCorreta);
            System.out.println("Acesso Liberado");
    }
 }
