import java.util.ArrayList;

public class Banco {
    ArrayList<Conta> listaContas = new ArrayList<>();

    public void adicionarConta(Conta conta){
        listaContas.add(conta);
        System.out.println("Adicionado a conta do titular " + conta.titular + " com sucesso!\n");
    }

    public void executarRotinaMensal(ArrayList<Conta> listaContas){
        for (int i = 0; i < listaContas.size(); i++){
            listaContas.get(i).atualizarSaldo();
        }
    }

    public ArrayList<Conta> getListaContas() {
        return listaContas;
    }
}
