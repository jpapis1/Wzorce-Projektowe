import children.*;
import request.MotherRequest;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MotherRequest motherRequest = new MotherRequest(Shelf.HIGH);
        Child tomek = new Tomek();
        Child ania = new Ania();
        Child antek = new Antek();
        ania.setTallerChild(tomek);
        tomek.setTallerChild(antek);
        ania.processRequest(motherRequest);
    }
}
