import Banco.Banco;
import Contas.Conta;
import Contas.ContaCorrente;
import Contas.ContaInvestimento;
import Contas.ContaPoupanca;
import Interface.INotificador;
import Notificador.NotificadorConsole;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        INotificador notificador = new NotificadorConsole();

        //criando diferentes tipos de conta
        Conta conta1 = new ContaCorrente("Rodrigo", notificador);
        Conta conta2 = new ContaInvestimento("Josevaldo", notificador);
        Conta conta3 = new ContaPoupanca("Airton", notificador);

        //adicionando contas na lista de contas
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);
        banco.adicionarConta(conta3);

        //depositos
        conta1.depositar(100.0);
        conta2.depositar(200.0);
        conta3.depositar(500.0);

        //saques
        conta1.sacar(10.0);
        conta2.sacar(20.0);
        conta3.sacar(50.0);

        //rotina
        banco.executarRotinaMensal(banco.getListaContas());
    }
}