package Questoes;

public class Q02c {

    int n1;
    int n2;
    int n3;
    int n4;
    int n5;
    int n6;

    public Q02c(int n1, int n2, int n3, int n4, int n5, int n6) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
        this.n6 = n6;
    }

    public int MediaA(){
        int Media1 =  (n1 + n2 + n3)/3;
        return Media1;
    }
    public int MediaB(){
        int Media2 =  (n4 + n5 + n6)/3;
        return Media2;
    }

    public int MediaC(){
        int Media = MediaB() + MediaA();
        return Media;
    }
    public int MediaD() {
        int MediaMedia = MediaC() / 2;
        int mediaMedia = MediaMedia;
        return MediaMedia;
    }
}
