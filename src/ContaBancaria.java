public class ContaBancaria {

    // atributos
    String numero;
    String agencia;
    String nomeCliente;
    double saldo;

    // metodos
    void depositar(double valor) {
        saldo = saldo + valor;
    }

    String sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo = saldo - valor;
                return "Saque realizado!!!";
            }else{
                return "Saldo insuficiente!!";
            }
        }else{
            return "Valor inválido!!!";
        }

    }

    String verExtrato() {
        String str = "";

        str = "\nAgência: " + agencia +
                "\n Número: " + numero +
                "\n Cliente: " + nomeCliente +
                "\n Saldo R$:" + saldo;

        return str;
    }

}