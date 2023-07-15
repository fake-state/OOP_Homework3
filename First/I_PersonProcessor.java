package First;

/**
 * Интерфейс I_PersonProcessor определяет методы для обработки человека.
 */
@FunctionalInterface
public interface I_PersonProcessor {
    void processPerson(String person);
}