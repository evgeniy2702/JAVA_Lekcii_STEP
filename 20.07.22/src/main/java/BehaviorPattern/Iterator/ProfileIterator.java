package BehaviorPattern.Iterator;

public interface ProfileIterator {

    // Общий интерфейс итераторов.

    boolean hasNext();

    Profile getNext();

    void reset();
}
