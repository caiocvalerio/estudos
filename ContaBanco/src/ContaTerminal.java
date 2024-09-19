import java.math.BigDecimal;

public class ContaTerminal {
    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private BigDecimal saldo;

    public ContaTerminal(Integer numero, String agencia, String nomeCliente, BigDecimal saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setagencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaTerminal{" +
                "numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public String mensagemContaCriada() {
        return "Olá "+getNomeCliente()+", obrigado por criar uma conta em nosso banco, " +
                "sua agência é "+getAgencia()+
                ", conta "+getNumero()+
                " e seu saldo "+getSaldo()+
                " já está disponível para saque";
    }
}
