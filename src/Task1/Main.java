package Task1;

public class Main {
    //Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
    //функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
    //абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран
    //сумму периметра всех фигур в массиве.
    public static void main(String[] args) {
        Figura numberTriangel = new Triangle(4, 7, 9);
        Figura numberCircle = new Сircle(2, 3, 4);
        Figura numberRectangle = new Rectangle(19, 5, 6);
        /**
         * Здесь я проверял методы
         */
        System.out.println("-------------------");
        System.out.println("Периметр треугольника:" + " " + numberTriangel.sumPerimetr());
        System.out.println("Площадь треугольника:" + " " + numberTriangel.Ploshad());
        System.out.println("-------------------");
        System.out.println("Периметр круга:" + " " + numberCircle.sumPerimetr());
        System.out.println("Площадь круга:" + " " + numberCircle.Ploshad());
        System.out.println("-------------------");
        System.out.println("Периметр прямоугольника:" + " " + numberRectangle.sumPerimetr());
        System.out.println("Площадь прямоугльника:" + " " + numberRectangle.Ploshad());
        System.out.println("-------------------");
        /**
         * Здесь массив и вычисление
         */
        Figura[] figuras = new Figura[5];
        figuras[0] = new Triangle(4, 9, 1);
        figuras[1] = new Сircle(5, 2, 4);
        figuras[2] = new Rectangle(9, 0, 4);
        figuras[3] = new Сircle(0, 1, 10);
        figuras[4] = new Triangle(9, 6, 4);

        int count = 0;
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Перимметр фигуры" + " " + "[" + i + "]" + " " + "Равен:" + " " + figuras[i].sumPerimetr());
            count += figuras[i].sumPerimetr();
        }
        System.out.println("Сумма периметром фигур равна:" + count);
    }
}
