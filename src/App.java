import java.util.Scanner;

public class App{


    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        double valor;
        //declaração
        ContaBancaria conta;

        //ContaBancaria conta2 = new ContaBancaria();

        //instanciação ou alocação
        conta = new ContaBancaria("1234","345","Zé");

        //inicialização
        /*conta.setAgencia("1234");
        conta.setNumero("98765");
        conta.setNomeCliente("Zé");
        
        conta.setSaldo(100.0);*/

        System.out.println(conta.verExtrato());

        conta.depositar(200.0);

        conta.setNomeCliente("Maria");

        System.out.println(conta.verExtrato());

        System.out.println(conta.sacar(20));
        
        System.out.println(conta.verExtrato());
        System.out.println("#####");




        System.out.println(conta.sacar(-20));
        
        System.out.println(conta.verExtrato());
        System.out.println("#####");

        valor = 2000;
        double saldo = conta.getSaldo();

        if(valor < saldo){
             System.out.println(conta.sacar(valor));
        }


        
        
        System.out.println(conta.verExtrato());
        System.out.println("#####");


        teclado.close();

    }


}
