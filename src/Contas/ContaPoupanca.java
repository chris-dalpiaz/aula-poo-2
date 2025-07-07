package Contas;

import Interface.INotificador;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular, INotificador notificador) {
        super(titular, notificador);
    }
    @Override
    public void atualizarSaldo() {
        double rendimento = saldo * 0.01;
        saldo += rendimento;

        notificador.notificar("Rendimento de R$" + rendimento +
                " nesse mês!\n" + "Saldo atual: R$" + saldo + "\n", this);
    }
}
