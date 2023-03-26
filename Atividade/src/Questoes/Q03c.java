package Questoes;

public class Q03c {
    int saldo;

    public Q03c(int saldo) {
        this.saldo = saldo;
    }

    public int salarioF(){
        return (this.saldo / 100) + this.saldo;
    }
}
