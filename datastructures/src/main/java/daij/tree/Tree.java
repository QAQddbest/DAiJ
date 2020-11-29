package daij.tree;

public interface Tree<E> {

    E getRoot();

    int size();

    boolean isEmpty();

    boolean contains(Object o);

    void clear();

}
