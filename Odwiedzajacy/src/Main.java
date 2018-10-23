import transportable.Animal;
import transportable.Person;
import transportable.Shipment;
import transportable.Transportable;
import visitor.NameTransportVisitor;
import visitor.PriceTransportVisitor;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("dog", 30);
        Person person = new Person("Dawid", "Nowak", true);
        Shipment shipment = new Shipment("PL", "4325452", false);
        List<Transportable> transportableList = Arrays.asList(animal, person, shipment);
        PriceTransportVisitor priceTransportVisitor = new PriceTransportVisitor();
        NameTransportVisitor nameTransportVisitor = new NameTransportVisitor();
        transportableList.forEach(PriceTransportVisitor -> PriceTransportVisitor.accept(priceTransportVisitor));
        transportableList.forEach(NameTransportVisitor -> NameTransportVisitor.accept(nameTransportVisitor));
    }
}
