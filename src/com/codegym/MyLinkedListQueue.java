package com.codegym;

import java.util.LinkedList;

public class MyLinkedListQueue <E> {
    private LinkedList <E> elments = new LinkedList<>();

    public MyLinkedListQueue() {
    }
    public void enqueue (E e){
        elments.addLast(e);
    }
    public E dequeue(){
        return elments.removeFirst();

    }
//    public int getSize(){
//        return elments.size();
//    }
//    public boolean isEmpty(){
//        return elments.size() == 0;
//    }
}
