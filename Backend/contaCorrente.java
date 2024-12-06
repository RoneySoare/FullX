package Conta;
public class contaCorrente extends conta {

    public contaCorrente(double saldoInicial){
        super(saldoInicial);
    }

    public void exibirDetalhes(){
        System.out.printf("O saldo da conta é R$: %.2f%n", getSaldo());
    }
    
}