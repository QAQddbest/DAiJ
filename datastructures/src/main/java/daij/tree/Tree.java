package daij.tree;

import java.util.Iterator;

/**
 * A tree is a collection of nodes, starting from a root node, and each note is pointing at one or more child.
 *
 * @param <E> Element type of the Node
 * @author OliverDD
 * @version 1.0.0
 */
public interface Tree<E> {

    /**
     * Return the root node of this tree.
     *
     * @return the root node of the tree.
     */
    E getRoot();

    /**
     * Return the number of the nodes in this tree.
     *
     * @return Number of nodes in the tree.
     */
    int size();

    /**
     * Judge if this tree is empty.
     *
     * @return <tt>true</tt> if the tree is empty, <tt>false</tt> in the other side.
     */
    boolean isEmpty();

    /**
     * Judge if this tree contains the element.
     *
     * @param e element that need to judge.
     * @return <tt>true</tt> if contained, <tt>false</tt> in the other side.
     */
    boolean contains(E e);

    /**
     * Remove every node in this tree.
     */
    void clear();

    /**
     * Add an element to this tree.
     *
     * @param e element that need to add.
     * @return <tt>true</tt> if succeed, <tt>false</tt> in the other side.
     */
    boolean add(E e);

    /**
     * Remove first occurrence of element from this tree.
     *
     * @param e element that need to remove.
     * @return T element removed from the tree.
     */
    E remove(E e);

    /**
     * Return an iterator that will iterate by level.
     *
     * @return an iterator that will iterate by level.
     */
    Iterator<E> getLevelOrderIterator();

}
