public class ContaPoupanca extends Conta{
    public ContaPoupanca(String titular) {
        super(titular);
    }

    @Override
    public void atualizarSaldo() {
        double rendimento = saldo * 0.01;
        saldo += rendimento;

        System.out.println("Rendimento de R$" + rendimento + " nesse mês!\n" +
                "Saldo atual: R$" + saldo + "\n");
    }
}
