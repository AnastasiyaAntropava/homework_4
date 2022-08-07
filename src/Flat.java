public class Flat extends EntityBase {
    int floor;
    int rooms;
    String personWhoLive;
    Furniture [] furnitureInfo;

    public void printFlatInfo() {
        System.out.printf("Flat located on %d floor\nRooms: %d\nIn Flat live: %s\nPrice: %f\n" , floor, rooms,
                personWhoLive, price);

        for (Furniture furniture : furnitureInfo) {
            furniture.printFurnitureInfo();
        }
    }

    public Flat(int floor, int rooms, String personWhoLive, double price, Furniture[] furnitures) {
        this.floor = floor;
        this.rooms = rooms;
        this.personWhoLive = personWhoLive;
        this.price = price;
        this.furnitureInfo = furnitures;
    }

    public String getPersonWhoLive() {
        return personWhoLive;
    }
}

