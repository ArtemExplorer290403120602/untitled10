package Task2;

public class Main {
    //Самостоятельно изучить и показать пример работы интерфейса-маркера Cloneable
    public static void main(String[] args) {
        Person person1 = new Person("John", 25);
        /**
         * В данном примере мы создаем класс Person, который реализует интерфейс Cloneable.
         * Затем мы создаем объект person1 и клонируем его, создавая объект person2 с помощью метода clone().
         * Проверяем, что объекты person1 и person2 различны и что их поля равны.
         */
        try {
            // Клонирование объекта
            Person person2 = (Person) person1.clone();

            // Проверка, что объекты различны
            System.out.println(person1 != person2);

            // Проверка, что поля клонированного объекта равны полям исходного объекта
            System.out.println(person1.getName().equals(person2.getName()));
            System.out.println(person1.getAge() == person2.getAge());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
