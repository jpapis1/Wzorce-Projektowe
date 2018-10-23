package children;

import request.MotherRequest;

public class Ania extends Child {
    @Override
    public void processRequest(MotherRequest motherRequest) {
        if(motherRequest.getShelf().equals(Shelf.LOW)) {
            System.out.println("Ania zdjęła słodycze z półki!");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
