package Task1;

public class Rectangle extends Figura implements Сounting {
     private int a,b,c;

    public Rectangle(int a , int b , int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double sumPerimetr() {
        return (a + b + c) * 2;
    }

    public double Ploshad() {
        return a * b;
    }
}
