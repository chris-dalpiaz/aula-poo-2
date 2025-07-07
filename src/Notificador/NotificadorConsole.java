package Notificador;

import Contas.Conta;
import Interface.INotificador;

public class NotificadorConsole implements INotificador {

    @Override
    public void notificar(String mensagem, Conta conta) {
        System.out.println("Notificando via CONSOLE a conta " + conta.getTitular()
                + ". Mensagem enviada:\n" + mensagem);
    }
}
