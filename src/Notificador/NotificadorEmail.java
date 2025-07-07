package Notificador;

import Contas.Conta;
import Interface.INotificador;

public class NotificadorEmail implements INotificador {

    @Override
    public void notificar(String mensagem, Conta conta) {
        System.out.println("Notificando via e-mail a conta " + conta.getTitular()
        + ". Mensagem enviada:\n" + mensagem);
    }
}
