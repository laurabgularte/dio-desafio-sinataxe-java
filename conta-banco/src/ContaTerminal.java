
import java.util.Scanner;

public class ContaTerminal {
     public static void main(String[] args) {
       //iniciando scanner p/ solicitar dados
                Scanner Scanner = new Scanner(System.in);

                //input dos dados pelo usuario
            
                System.out.println("Digite seu nome: ");
                String nome = Scanner.next();

                System.out.println("Digite o número de sua agência: ");
                String agencia = Scanner.next();

                System.out.println("Digite o número de sua conta: ");
                int numero = Scanner.nextInt();

                System.out.println("Digite o saldo atual de sua conta: ");
                double saldo = Scanner.nextDouble();

                //apos o input dos dados, a saida: 

                System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

                //finalizando o scanner 
                Scanner.close();
            }
        }
    

