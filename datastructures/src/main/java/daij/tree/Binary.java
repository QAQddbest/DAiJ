package daij.tree;

import java.util.Iterator;

/**
 * Add support for binary tree.
 *
 * @param <E> Element type of the Node
 */
public interface Binary<E> {

    /**
     * Return an iterator that will iterate in preorder.
     *
     * @return an iterator that will iterate in preorder.
     */
    Iterator<E> getPreorderIterator();

    /**
     * Return an iterator that will iterate in postorder.
     *
     * @return an iterator that will iterate in postorder.
     */
    Iterator<E> getPostorderIterator();

    /**
     * Return an iterator that will iterate in inorder.
     *
     * @return an iterator that will iterate in inorder.
     */
    Iterator<E> getInorderIterator();
}
