package daij.tree;

import java.util.Iterator;

public interface TreeIterator<E> {
    Iterator<E> getPreorderIterator();

    Iterator<E> getPostorderIterator();

    Iterator<E> getInorderIterator();

    Iterator<E> getLevelOrderIterator();
}
