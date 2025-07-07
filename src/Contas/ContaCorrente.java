package Contas;

import Interface.INotificador;

public class ContaCorrente extends Conta{

    public ContaCorrente(String titular, INotificador notificador) {
        super(titular, notificador);
    }

    @Override
    public void atualizarSaldo() {
        double tarifa = 10;
        saldo -= tarifa;
        notificador.notificar("Desconto de tarifa! R$" + tarifa + "\n" +
                "Saldo atual: R$" + saldo + "\n", this);
    }
}
