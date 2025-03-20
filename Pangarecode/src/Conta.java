import java.time.LocalDate;
import java.util.Objects;

public class Conta {

    public String nome;
    public Integer numero;
    public Integer agencia;
    public Double saldo;
    public LocalDate dataCriacao;

    public void depositar (double valor) {
        this.saldo += valor;
    }

    public boolean sacar (double valor) {
        if (this.saldo > valor) {
            this.saldo += valor;
            return true;
        }

        return false;
    }

    public void calcularRendimento () {
        this.saldo = this.saldo + 1.10;
    }

    public String RecuperarDadosParaImpressao() {
        return String.format ("[agência: %d, Nome: %s, Número: %d, Data de Criação {3}, Saldo: %f", agencia, nome, numero, dataCriacao.toString(), saldo);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(numero, conta.numero) && Objects.equals(agencia, conta.agencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, agencia);
    }
}
