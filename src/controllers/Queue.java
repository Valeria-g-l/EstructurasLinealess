package controllers;

import models.Node;

public class Queue<T> {
    private Node<T> first; 
    private Node<T> last;  
    private int size;      

    public Queue() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<T>(data);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
        size++;
    }

    
    private boolean isEmpty() {
        return first == null;
    }

    
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        T data = first.getValue();
        first = first.getNext();
        if (first == null) {
            last = null;
        }
        size--;
        return data;
    }

    
    public String getFirst() {
        if (isEmpty()) {
            return "Cola vacía";
        }
        return first.getValue().toString();
    }

    
    public String getLast() {
        if (isEmpty()) {
            return "Cola vacía";
        }
        return last.getValue().toString();
    }

   
    public int size() {
        return size;
    }

    
    public void printAllNodes() {
        Node<T> aux = first;
        System.out.print("Cima -> ");
        while (aux != null) {
            System.out.print(aux.getValue().toString() + " -> ");
            aux = aux.getNext();
        }
        System.out.println("Fin");
    }
}
