package Main;

import Questoes.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Questão 1:");
        Q01c idade = new Q01c(30, 12, 7);
        System.out.println(idade.idadeEmdias());
        System.out.println("=-=-==-==-==-=-=-=-====-=-==-=-=");

        System.out.println("Questão 2:");
        Q02c Media = new Q02c(8,9,7,4,5,6);
        System.out.println(" Media de 8,9,7 = " + Media.MediaA() + ", Media de 4,5,6 = " + Media.MediaB() + ", Media total = " + Media.MediaC() + ", Media Final = " + Media.MediaD());
        System.out.println("=-=-==-==-==-=-=-=-====-=-==-=-=");

        System.out.println("Questao 3:");
        Q03c saldo = new Q03c(1000);
        System.out.println(saldo.salarioF());
        System.out.println("=-=-==-==-==-=-=-=-====-=-==-=-=");

        System.out.println("Questao 4:");
        Q04c peca1 = new Q04c(10, 01,10.00,30);
        Q04c peca2 = new Q04c(20, 02,30.00,50);
        System.out.println((peca1.valor* peca1.quantidade)*(peca1.IPI/100+1));

        System.out.println("=-=-==-==-==-=-=-=-====-=-==-=-=");

        System.out.println("Questao 5:");
        Q05c salario = new Q05c(1320,5000);
        System.out.println("A uma media de diferença de " + salario.salariof() + " salarios");
        System.out.println("=-=-==-==-==-=-=-=-====-=-==-=-=");

        System.out.println("Questao 6:");
        Q06c numero = new Q06c(10);
        System.out.println(numero.antesedepois());


    }
}