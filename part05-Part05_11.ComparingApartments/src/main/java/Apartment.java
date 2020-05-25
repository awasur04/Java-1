
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }
    public int priceDifference(Apartment compared) {
        int apartment1 = this.squares * this.princePerSquare;
        int apartment2 = compared.squares * compared.princePerSquare;
        return Math.abs(apartment1 - apartment2);
    }
    public boolean moreExpensiveThan(Apartment compared) {
        int apartment1 = this.squares * this.princePerSquare;
        int apartment2 = compared.squares * compared.princePerSquare;
        if (apartment1 > apartment2) {
            return true;
        }
        return false;
    }

}
