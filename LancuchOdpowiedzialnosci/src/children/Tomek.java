package children;

import request.MotherRequest;

public class Tomek extends Child {
    @Override
    public void processRequest(MotherRequest motherRequest) {
        if(motherRequest.getShelf().equals(Shelf.MEDIUM)) {
            System.out.println("Tomek zdjął słodycze z półki!");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
