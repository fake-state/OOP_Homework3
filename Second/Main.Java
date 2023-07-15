

public class Main {
    public static void main(String[] args) {
        I_MarketBehaviour market = new Market();
        market.addPerson("Максим");
        market.addPerson("Ирина");
        System.out.println("Размер очереди: " + market.size());
        System.out.println("Следующий человек: " + market.removePerson());
        /*
        В предыдущем ДЗ добавить реализацию собственного функционального
        интерфейса. В первом варианте вам нужно добавить реализацию собственного
        функционального интерфейса к предыдущему ДЗ. Вы можете выбрать любой
        класс или часть кода из предыдущего ДЗ и добавить свой собственный
        функциональный интерфейс, описывающий необходимое поведение.
        */

        // Создаем объект I_PersonProcessor и передаем его в метод
        // processAllPersons

        I_PersonProcessor processor = person -> System.out.println("Обработка: "
                + person);
        ((Market) market).processAllPersons(processor);

        /*
        Реализовать любой выбранный интерфейс из списка (Iterator<E>,
        Iterable<E>, Comparator<E>, Comparable<E>) в предыдущем ДЗ,
        предоставив собственную реализацию (нужно реализовать один из выбранных
        интерфейсов (Iterator<E>, Iterable<E>, Comparator<E>, Comparable<E>) в
        предыдущем ДЗ. Вы можете выбрать любой интерфейс и предоставить свою
        собственную реализацию методов, соответствующих этому интерфейсу
        */

        // создаются две очереди покупателей и добавляются элементы в каждую.

        MarketQueue queue1 = new MarketQueue();
        queue1.enqueue("Вячеслав");
        queue1.enqueue("Антонина");

        MarketQueue queue2 = new MarketQueue();
        queue2.enqueue("Александр");
        queue2.enqueue("Екатерина");

        // вызывается метод compareTo для сравнения размеров очередей

        int result = queue1.compareTo(String.valueOf(queue2));
        if (result < 0) {
            System.out.println("Очередь 1 меньше очереди 2");
        } else if (result > 0) {
            System.out.println("Очередь 1 больше очереди 2");
        } else {
            System.out.println("Очереди 1 и 2 имеют одинаковый размер");
        }
    }
}