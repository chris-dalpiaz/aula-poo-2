public class ContaCorrente extends Conta{

    public ContaCorrente(String titular) {
        super(titular);
    }

    @Override
    public void atualizarSaldo() {
        double tarifa = 10;
        saldo -= tarifa;
        System.out.println("Desconto de tarifa! R$" + tarifa + "\n" +
                "Saldo atual: R$" + saldo + "\n");
    }
}
