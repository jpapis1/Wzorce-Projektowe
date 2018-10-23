package children;

import request.MotherRequest;

public class Antek extends Child{
    @Override
    public void processRequest(MotherRequest motherRequest) {
        if(motherRequest.getShelf().equals(Shelf.HIGH)) {
            System.out.println("Antek zdjął słodycze z półki!");
        } else {
            System.out.println("Nie ma wyższego od Antka!");
        }
    }
}
