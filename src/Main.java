public class Main {
    public static void main(String[] args) {
        Furniture oldFurniture = new Furniture("Armchair", "Antiques",2);
        Furniture newFurniture = new Furniture("Cupboard", "The new one", 7);
        Flat perfectFlat = new Flat (5,2,"Viktar and Annastasiya",
                110000.99, new Furniture[] { oldFurniture });

        Flat newFlat = new Flat(10,4, "HagiVagi and KissiMissi", 30000000,
                new Furniture[] {newFurniture});
        perfectFlat.printFlatInfo();
        newFlat.printFlatInfo();
    }
}