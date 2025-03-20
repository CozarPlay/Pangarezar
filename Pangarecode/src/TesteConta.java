import java.time.LocalDate;

public class TesteConta {

    public static void main (String[] args) {
        Conta contaAluno = new Conta();
        contaAluno.nome = "João";
        contaAluno.numero = 33658;
        contaAluno.agencia = 9999;
        contaAluno.saldo = 0.0;
        contaAluno.dataCriacao = LocalDate.now();

        System.out.println(contaAluno.RecuperarDadosParaImpressao());
        contaAluno.depositar(100.00);
        System.out.println(contaAluno.RecuperarDadosParaImpressao());
        contaAluno.calcularRendimento();
        contaAluno.sacar(50.00);
        System.out.println(contaAluno.RecuperarDadosParaImpressao());
    }
}
