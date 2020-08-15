package DesingPattern.MVC_Pattern.dao;

import java.util.ArrayList;
import java.util.List;

public interface GenericDAO<T, ID> {

    void saveBook(T t);

    void upDate(Long id, T t);

    void remove(T t);

    T getById(ID id);

    List<T> getAll();
}
