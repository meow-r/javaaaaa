package practice.MyArrayList;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ArrayList;

public class MyArrayList<E> implements Iterable<E>{
    private Object[] elementData;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private int modCount = 0;

    public MyArrayList(int initialCapacity) {
        size = 0;
        int newCapacity = 0;
        if(initialCapacity > 0){
            newCapacity = initialCapacity;
        }else {
            System.out.println("invalid, default capacity = 10");
            newCapacity = DEFAULT_CAPACITY;
        }
        elementData = new Object[newCapacity];
    }

    public MyArrayList() {
        size = 0;
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public boolean add(E e) {
        ensureCapacity(size + 1);
        elementData[size++] = e;
        modCount ++;
        return true;
    }

    public E get(int index) {
        checkIndex(index);
        return (E) elementData[index];
    }

    public E remove(int index) {
        checkIndex(index);
        modCount ++;
        E oldValue = (E) elementData[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null; // 让 GC 回收
        return oldValue;
    }

    public int size() {
        return size;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elementData.length) {
            System.out.println("旧容量：" + elementData.length);
            int newCapacity = elementData.length + (elementData.length >> 1);
            Object[] newData = new Object[newCapacity];
            System.arraycopy(elementData, 0, newData, 0, size);
            elementData = newData;
            System.out.println("扩容了" + "-> 新容量：" + newCapacity);
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    @Override
    public MyIterator iterator(){
        return new MyIterator();
    }

    private class MyIterator implements Iterator<E>{
        private int cursor = 0;
        private int expectedCount = modCount;
        @Override
        public boolean hasNext(){
            checkForComodification();
            if (cursor < size){
                return true;
            }
            return false;
        }

        @Override
        public E next(){
            checkForComodification();
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            return (E) elementData[cursor++];
        }

        @Override
        public void remove(){
            checkForComodification();
            if(cursor == 0){
                throw new IllegalStateException("必须先调用 next()");
            }
            MyArrayList.this.remove(cursor-1);
            expectedCount = modCount;
            cursor --;
        }
        
        final void checkForComodification() {
        if (modCount != expectedCount) {
            throw new ConcurrentModificationException();
        }
    }
    }


    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("=== 增强 for 循环遍历 ===");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        System.out.println("\n=== 使用迭代器删除以 'A' 开头的元素 ===");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String fruit = it.next();
            if (fruit.startsWith("A")) {
                it.remove();
                System.out.println("删除: " + fruit);
            }
        }

        System.out.println("\n=== 删除后剩余元素 ===");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}