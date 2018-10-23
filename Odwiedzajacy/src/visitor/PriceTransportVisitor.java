package visitor;

import transportable.Animal;
import transportable.Person;
import transportable.Shipment;

public class PriceTransportVisitor implements TransportVisitor {
    @Override
    public void visit(Animal animal) {
        System.out.println("Cena przewozu zwierzęcia: " + (animal.getWeight()*0.2) + " PLN");
    }

    @Override
    public void visit(Person person) {
        int price = 6;
        if(person.isRegularCustomer()) {
            price = price/2;
        }
        System.out.println("Cena przewozu człowieka: " + price + " PLN");
    }

    @Override
    public void visit(Shipment shipment) {
        int price = 2;
        if(shipment.isLarge()) {
            price = price*3;
        }
        System.out.println("Cena przewozu towaru: " + price + " PLN");
    }
}
