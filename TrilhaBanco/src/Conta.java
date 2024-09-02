public class Conta {
    int numConta;
    Double saldo;
    String nome;
    public Conta(Double saldo){
        this.saldo = saldo;
    }
    public Conta(int numConta, Double saldo, String nome) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.nome = nome;
    }
    public void sacar(int num){
        if (saldo < num){
            System.out.println("Saldo insuficiente.");
        } else {
            saldo = saldo - num;
        }
    }
    public void depositar(int num){
        saldo = num + saldo;
    }
    public void getSaldo(){
        System.out.println("R$"+saldo);
    }
}
