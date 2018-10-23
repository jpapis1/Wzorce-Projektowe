package children;

import request.MotherRequest;

public abstract class Child {
    private Child tallerChild;
    public abstract void processRequest(MotherRequest motherRequest);

    public void setTallerChild(Child tallerChild) {
        this.tallerChild = tallerChild;
    }

    public Child getTallerChild() {
        return tallerChild;
    }
}
