package Part_5;

public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {

        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;

    }

    public boolean largerThan(Apartment compared) {

        if(this.squares > compared.squares) {

            if(this.rooms > compared.rooms) {

                return true;

            } else {

                return false;

            }

        } else {

            return false;

        }

    }

    public int priceDifference(Apartment compared) {

        return Math.abs(this.pricePerSquare * this.squares - compared.pricePerSquare * compared.squares);

    }

    public boolean moreExpensiveThan(Apartment compared) {

        if(this.pricePerSquare * this.squares > compared.pricePerSquare * compared.squares) {

            return true;

        } else {

            return false;

        }

    }

    public static void main(String[] args) {

        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

        // tests method largerThan()
        System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));     // false
        System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));  // true

        // tests method priceDifference()
        System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));  //71600
        System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));   //35400

        // tests method moreExpensiveThan()
        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));  // false
        System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));   // true

    }

}
