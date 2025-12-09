import models.Node;
import models.Person;
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

        Stack<Person> persons = new Stack<Person>();
        persons.push(new Person("Juan", 30));
        persons.push(new Person("Maria", 35));
        persons.push(new Person("Pedro", 32));
        persons.push(new Person("Diego", 31));
        System.out.println("Tamaño de la pila: " + persons.size());
        persons.printAllNodes();
        System.out.println(persons.pop());
        System.out.println("Size = " + persons.size());
        persons.printAllNodes();
        
    }

}
