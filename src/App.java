import java.util.Scanner;

public class App{


    public static void main(String[] args) {

        //declaração
        ContaBancaria conta;

        ContaBancaria conta2 = new ContaBancaria();

        //instanciação ou alocação
        conta = new ContaBancaria();

        //inicialização
        conta.agencia = "1234";
        conta.numero = "98765";
        conta.nomeCliente = "Zé";
        conta.saldo = 100.0;

        System.out.println(conta.verExtrato());

        conta.depositar(200.0);

        System.out.println(conta.verExtrato());

        System.out.println(conta.sacar(20));
        
        System.out.println(conta.verExtrato());
        System.out.println("#####");
        System.out.println(conta.sacar(-20));
        
        System.out.println(conta.verExtrato());
        System.out.println("#####");
        System.out.println(conta.sacar(2000));
        
        System.out.println(conta.verExtrato());
        System.out.println("#####");


    }


}
