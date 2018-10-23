public class Main {

    public static void main(String[] args) {
	// write your code here
        ChessPiece blackKing = new BlackKing("Czarny Król");
        ChessPiece whiteKing = new WhiteKing("Biały Król");

        System.out.println(blackKing.getColor());
        System.out.println(whiteKing.getColor());
    }
}
