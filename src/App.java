import models.Node;
import models.Person;
import controllers.ListaEnlazada;
import controllers.Queue;

import controllers.Stack; 

public class App {
    public static void main(String[] args) throws Exception {
        Node<Person> node1 = new Node<Person>(new Person("Juan", 30));
        Node<Person> node2 = new Node<Person>(new Person("Maria", 35));
        Node<Person> node3 = new Node<Person>(new Person("Pedro", 25));
        Node<Person> node4 = new Node<Person>(new Person("Diego", 28));
        node1.setNext(node2);
        node2.setNext(node3); 
        node3.setNext(node4);

        System.out.println(node1);

       /*  Stack<Person> persons = new Stack<Person>();
        persons.push(new Person("Juan", 30));
        persons.push(new Person("Maria", 35));
        persons.push(new Person("Pedro", 32));
        persons.push(new Person("Diego", 31));
        System.out.println("Tamaño de la pila: " + persons.size());
        persons.printAllNodes();
        System.out.println(persons.pop());
        System.out.println("Size = " + persons.size());
        persons.printAllNodes();*/

        //Clase Queue
       /*  System.out.println("Ejercicio 3 - 11/12/2025");
        Queue<Person> persons = new Queue<Person>();
        persons.enqueue(new Person("Juan", 30));
        persons.enqueue(new Person("Maria", 35));
        persons.enqueue(new Person("Pepito", 32));
        persons.enqueue(new Person("Diego", 31));
        System.out.println("Size=" + persons.size());
        persons.printAllNodes();
        System.out.println(persons.dequeue());
        System.out.println("Primera" + persons.getFirst());
        System.out.println("Ultima" + persons.getLast());
        System.out.println("Size=" + persons.size());
        persons.printAllNodes();*/

        //Clase Lista Enlazada
        ListaEnlazada<Person> persons = new ListaEnlazada<Person>();
        persons.append(new Person("Juan", 30));
        persons.append(new Person("Maria", 35));
        persons.append(new Person("Pepito", 32));
        persons.append(new Person("Diego", 31));
        System.out.println("Size=" + persons.size());
        persons.printAllNodes();
        persons.deleteNode(new Person("Pepito", 32));
        persons.printAllNodes();
        persons.deleteFirst();
        persons.printAllNodes();
        persons.deleteLast();
        persons.printAllNodes();
        System.out.println("Size=" + persons.size());
    
        
    }

}
