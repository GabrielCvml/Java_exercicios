package Questoes;

public class Q05c {

    double salarioM;
    double salarioU;
    public Q05c(double salarioM, double salarioU) {
        this.salarioM = salarioM;
        this.salarioU = salarioU;
    }
    public int salariof(){
        int cont = 1;
        double salarioM = this.salarioM;
        double salarioU = this.salarioU;

        while (salarioU > salarioM){
            salarioM += this.salarioM;
            cont+=1;
        }
        return cont;
    }
}
