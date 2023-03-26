package Questoes;

public class Q06c {


    int numero;
    public Q06c(int numero) {
        this.numero = numero;
    }

    public String antesedepois(){
        int antes = this.numero - 1;
        int depois = this.numero + 1;
        String F = "O seu numero " + this.numero + " tem como antecessor = " + antes + ", e como sucessor = " + depois;
        return F;
    }

}
