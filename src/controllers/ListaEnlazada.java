package controllers;

import models.Node;

public class ListaEnlazada<T> {
    public Node<T> head;
    private int size = 0;

    public void append(T data){
        Node<T> newNode = new Node<T>(data);
        if(head == null){
            head = newNode;
        } else {
            Node<T> aux = head;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(newNode);
        }

    }

    public void  deleteFirst(){
        if(head != null){
            head = head.getNext();
            size --;
        }
    }

    public void deleteLast(){
        if(head != null){
            if(head.getNext() == null){
                head = null; 
            } else {
                Node<T> aux = head;
                while(aux.getNext().getNext() != null){
                    aux = aux.getNext();
                }
                aux.setNext(null);
            }
        }
    }

    public void deleteNode(T data){
        if(head != null){
            if(head.getValue().equals(data)){
                head = head.getNext();
            } else {
                Node<T> aux = head;
                while(aux.getNext() != null && !aux.getNext().getValue().equals(data)){
                    aux = aux.getNext();
                }
                if(aux.getNext() != null){
                    aux.setNext(aux.getNext().getNext());
                }
            }
        }
    }

    public void printAllNodes() {
        Node<T> aux = head;
        System.out.println("Head -> ");
        while (aux != null) {
            System.out.println(aux.getValue().toString() + " -> ");
            aux = aux.getNext();
        }
        System.out.println("Fin");
    }

    public String size() {
        return Integer.toString(size);
    }
    
}
