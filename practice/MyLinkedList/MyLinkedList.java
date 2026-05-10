public class MyLinkedList<E>{
    private class node{
        E content;
        node next;
        node last;

        private node(E e){
            content = e;
        }
    }

    private node head;
    private node tail;
    private int size;

    public MyLinkedList(){
        size = 0;
        head = tail = null;
    }
    
    public void add(E e){
        if (size == 0){
            head = new node(e);
            head.last = null;
            head.next = null;
            tail = head;
            
        }else{
            node NewNode = new node(e);
            tail.next = NewNode;
            NewNode.last = tail;
            NewNode.next = null;
            tail = NewNode;
            
        }
        size ++;
    }

    public E get(int index){
        checkIndex(index);
        node current = head;
        for(int i = 0; i < index; i ++){
            current = current.next;
        }
        return current.content;
    }

    public E remove(int index){
        checkIndex(index);
        node current = head;
        for (int i = 0; i < index; i ++){
            current = current.next;
        }
        if (current.last != null) {
        current.last.next = current.next;
        } else {
            head = current.next;  // 删除的是头节点
        }
        if (current.next != null) {
            current.next.last = current.last;
        } else {
            tail = current.last;  // 删除的是尾节点
        }
        size--;
            return current.content;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

}