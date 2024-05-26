import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 
            System.out.println("MENU:");
            System.out.println("1.Depositar");
            System.out.println("2.Sacar");
            System.out.println("3.Consultar");
            System.out.println("0.Encerrar");
            int opcao = scanner.nextInt(); 
            
            switch (opcao) {

               case 1: //DEPOSITAR

                   double saldoDeposito = scanner.nextDouble();

                   saldo += saldoDeposito;

                   System.out.println("Saldo atual: "+saldo);

                   break;

               case 2: // SACAR

                   double saldoSaque = scanner.nextDouble();

                   if( saldoSaque <= saldo){

                       saldo -= saldoSaque;

                       System.out.println("Saldo atual: "+saldo);

                   }else {

                       System.out.println("Saldo insuficiente.");

                   }

                   break;

               case 3: // CONSULTAR SALDO

                   System.out.println("Saldo atual: "+saldo);

                   break;

               case 0:

                   System.out.println("Programa encerrado.");

                   return;

               default:// Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:

                   System.out.println("Opção inválida. Tente novamente.");

           }

       }

   }

}