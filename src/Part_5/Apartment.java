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

        return Math.abs(this.pricePerSquare - compared.pricePerSquare);

    }

    public static void main(String[] args) {

        //part 1
//        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
//        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
//        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);
//
//        System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));     // false
//        System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));  // true
//
//        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
//        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
//        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);
//
//        System.out.println(manhattanSingleRoomApt.priceDifference(atlantaTwoRoomApt));  //71600
//        System.out.println(bangorThreeRoomApt.priceDifference(atlantaTwoRoomApt));   //35400

    }


}
