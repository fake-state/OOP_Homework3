package First;
/*
        В предыдущем ДЗ добавить реализацию собственного функционального
        интерфейса. В первом варианте вам нужно добавить реализацию собственного
        функционального интерфейса к предыдущему ДЗ. Вы можете выбрать любой
        класс или часть кода из предыдущего ДЗ и добавить свой собственный
        функциональный интерфейс, описывающий необходимое поведение.
        */


public class Main {
    public static void main(String[] args) {
        I_MarketBehaviour market = new Market();
        market.addPerson("Максим");
        market.addPerson("Ирина");
        System.out.println("Размер очереди: " + market.size());
        System.out.println("Следующий человек: " + market.removePerson());
        
        // Создаем объект I_PersonProcessor и передаем его в метод
        // processAllPersons

        I_PersonProcessor processor = person -> System.out.println("Обработка: "
                + person);
        ((Market) market).processAllPersons(processor);
    }
}