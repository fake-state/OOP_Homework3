package Second;

/**
 * Интерфейс I_Queue определяет методы для работы с очередью.
 */
public interface I_Queue {
    void enqueue(String person);
    String dequeue();
    boolean isEmpty();
    int size();
}