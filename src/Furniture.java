public class Furniture extends EntityBase {
    public String using;
    public int amount;

    public void printFurnitureInfo() {
        System.out.printf("Type of furniture: %s\nDo people use it before: %s\n" +
                "How much in flat this type of furniture: %d\n", name, using, amount);
    }

    public Furniture(String name, String using, int amount) {
        this.name = name;
        this.using = using;
        this.amount = amount;
    }
}
