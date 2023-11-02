package Task1;

public class Сircle extends Figura implements Сounting {
    private int a,b,c;

    public Сircle(int a , int b , int c){
        this.a=a;
        this.b=b;
        this.c=c;

    }
    public double sumPerimetr() {
        return 2 * 3.14 * (a + b + c);
    }

    public double Ploshad() {
        return 3.14 * ((a + b) ^ 2);
    }
}
