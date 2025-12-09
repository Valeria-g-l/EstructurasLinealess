package controllers;

import models.Node;

public class Stack<T> {
    private Node<T> top;
    private int count;  

    public Stack() {
        this.top = null;
        this.count = 0;
    }

    //Metodo para insertar
    public void push(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.setNext(top);
        top = newNode;
        count++;   
    }

    //Metodo para eliminar
    public T pop() {
        if (top == null) {
            return null;
        }
        T data = top.getValue();
        top = top.getNext();
        count--;   
        return data;  
    }

    //Metodo para retornar el primero pero sin eliminar
    public T peek() {
        if (top == null) {
            return null;
        }
        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }

    
    public int size() {
        return count;
    }

    public void printAllNodes(){
        Node<T> aux = top;
        System.out.println("Cima -> ");
        while(aux != null){
            System.out.println(aux.getValue().toString() + " -> ");
            aux = aux.getNext();
        }
        System.out.println("Fin");
    }
}
