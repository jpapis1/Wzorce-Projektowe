package visitor;

import transportable.Animal;
import transportable.Person;
import transportable.Shipment;

public class NameTransportVisitor implements TransportVisitor {
    @Override
    public void visit(Animal animal) {
        System.out.println("Typ zwierzęcia: " + animal.getKind());
    }

    @Override
    public void visit(Person person) {
        System.out.println("Imię i nazwisko osoby: " + person.getFirstName() + " " + person.getLastName());
    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println("Prefix i numer przesyłki: " + shipment.getPrefix() + " " + shipment.getSerialNumber());
    }
}
