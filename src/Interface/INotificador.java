package Interface;

import Contas.Conta;

public interface INotificador {
    void notificar(String mensagem, Conta conta);
}
