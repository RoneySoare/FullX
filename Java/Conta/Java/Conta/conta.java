package Java.Conta;

public class conta {
    protected double saldo;

    public conta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }
}