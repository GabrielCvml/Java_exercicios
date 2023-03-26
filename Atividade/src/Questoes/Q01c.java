package Questoes;

public class Q01c {

    int anos;
    int meses;
    int dias;
    public Q01c(int anos, int meses, int dias) {
        this.anos = anos;
        this.meses = meses;
        this.dias = dias;
    }

    public int idadeEmdias () {
        int total = this.anos * 365 + this.meses * 30 + this.dias;
        return total;
    }
}
