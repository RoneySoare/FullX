package Conta;

public class contaCorrente extends conta {
    
    public contaCorrente(double saldoinicial){
        super(saldoinicial);
    }

    public void exibirDetalhes(){
        System.out.printf("Seu saldo da conta corrente é R$: %.2f%n", getSaldo());
    }
}
