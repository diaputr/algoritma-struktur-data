package minggu12;
public class Node {
    int data;
    Node prev, next;

    Node(int data, Node prev, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }   
}