package Contas;

import Interface.INotificador;

public abstract class Conta {
    protected String titular;
    protected Double saldo;
    protected INotificador notificador;

    public Conta(String titular, INotificador notificador) {
        this.titular = titular;
        //notificador é colocado no construtor por conta dele ser uma variável constante,
        // que é alterada somente no main quando precisa
        this.notificador = notificador;
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

    public String getTitular() {
        return titular;
    }
}
