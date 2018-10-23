package visitor;

import transportable.Animal;
import transportable.Person;
import transportable.Shipment;

public interface TransportVisitor {
    void visit(Animal animal);
    void visit(Person person);
    void visit(Shipment shipment);
}
