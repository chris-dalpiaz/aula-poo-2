package Contas;

import Interface.INotificador;

public class ContaInvestimento extends Conta {
    public ContaInvestimento(String titular, INotificador notificador) {
        super(titular, notificador);
    }

    @Override
    public void atualizarSaldo() {
        double tarifa = 5;
        double rendimento = saldo * 0.02;
        saldo += rendimento - tarifa;

        notificador.notificar("Rendimento de R$" + rendimento +
                " nesse mês!\n" + "Tarifa de R$" + tarifa + "\n" +
                "Saldo atual: R$" + saldo + "\n", this);
    }
}
