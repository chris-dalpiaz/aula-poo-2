import java.util.ArrayList;

public abstract class Conta {
    protected String titular;
    protected Double saldo;

    public Conta(String titular) {
        this.titular = titular;
        saldo = 0.0;
    }

    public void depositar(Double valorDeposito){
        if (valorDeposito > 0){
            saldo += valorDeposito;
            System.out.println("Depositado R$" + valorDeposito + " com sucesso!\n" +
                    "Saldo atual: R$" + saldo + "\n");
        } else {
            System.out.println("Operação inválida!\n");
        }
    }

    public void sacar(Double valorSaque){
        if (valorSaque > 0 && saldo >= valorSaque){
            saldo -= valorSaque;
            System.out.println("Sacado R$" + valorSaque + " com sucesso!\n" +
                    "Saldo atual: R$" + saldo + "\n");
        } else {
            System.out.println("Operação inválida!\n");
        }
    }

    public void exibirDados(){
        System.out.println("Titular da conta: " + titular + "\n" +
                "Saldo atual: R$" + saldo + "\n");
        System.out.println();
    }

    public abstract void atualizarSaldo();
}
