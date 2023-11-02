package Task;

public class Accountant extends PositionsNumber implements Positions {
    public void printsPosition(String text) {
        System.out.println("Его должность это:" + " " + text);
    }
}
