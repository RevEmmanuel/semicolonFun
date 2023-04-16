package classTask.Level2;

import java.util.ArrayList;
import java.util.List;

public class LinkedList<T> {

    private List<Node<T>> items = new ArrayList<>();

//    private int count = 1;

    public Node<T> getHead() {
        if (items.size() == 0) throw new ArrayIndexOutOfBoundsException("LinkedList is empty");
        return items.get(0);
    }

    /*
    public Node<T> getNext() {
        if (items.size() == 0) throw new ArrayIndexOutOfBoundsException("LinkedList is empty");
        Node<T> next;
        next =  items.get(count++);
        return next;
    }
     */

    public void insertAtTail(Node<T> item) {
        items.add(item);
    }

    public void insertAtHead(Node<T> item) {
        List<Node<T>> newItems = new ArrayList<>();
        newItems.add(item);
        newItems.addAll(items);
        items = newItems;
    }

    public void delete(Node<T> item) {
        if (items.size() == 0) throw new ArrayIndexOutOfBoundsException("LinkedList is empty");
        items.remove(item);
    }

    public void deleteAtHead() {
        List<Node<T>> newItems = new ArrayList<>();
        for (int i = 1; i < items.size(); i++) {
            newItems.add(items.get(i));
        }
        items = newItems;
    }

    public int search(Node<T>  item) {
        if (items.size() == 0) throw new ArrayIndexOutOfBoundsException("LinkedList is empty");
        int count = 0;
        for (Node<T> itemOld : items) {
            if (itemOld.equals(item)) return count;
            count++;
        }
        return -1;
    }

    public boolean isEmpty() {
        return items.size() == 0;
    }

    public void remove_duplicates() {
        List<Node<T>> uniqueNodes = new ArrayList<>();
        for (Node<T> node : items) {
            if (!uniqueNodes.contains(node)) {
                uniqueNodes.add(node);
            }
        }
        items = uniqueNodes;
    }

}
