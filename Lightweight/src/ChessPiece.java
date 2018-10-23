public class ChessPiece {
    String name;
    int numberPosition;
    char letterPosition;
    private Color color;

    public ChessPiece(String name, int numberPosition, char letterPosition, String color) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        switch (color.toLowerCase()) {
            case "black":
                this.color = ColorRepository.getBlack();
                break;
            case "white":
                this.color = ColorRepository.getWhite();
                break;
        }
    }

    public Color getColor() {
        return color;
    }
}
