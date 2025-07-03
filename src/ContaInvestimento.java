public class ContaInvestimento extends Conta{
    public ContaInvestimento(String titular) {
        super(titular);
    }

    @Override
    public void atualizarSaldo() {
        double tarifa = 5;
        double rendimento = saldo * 0.02;
        saldo += rendimento - tarifa;

        System.out.println("Rendimento de R$" + rendimento + " nesse mês!\n" +
                "Tarifa de R$" + tarifa + "\n" +
                "Saldo atual: R$" + saldo + "\n");
    }
}
