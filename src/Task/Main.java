package Task;

public class Main {
    //Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с
    //методом, который печатает название должности и имплементировать этот метод в
    //созданные классы.
    public static void main(String[] args) {
        PositionsNumber numberOne= new Worker();
        PositionsNumber numberTwo= new Director();
        PositionsNumber numberThree= new Accountant();
        numberOne.printsPosition("Рабочий");
        numberTwo.printsPosition("Директор");
        numberThree.printsPosition("Бухгалтер");
    }
}
