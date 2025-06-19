public class Item {
    private String id;
    private String name;
    private double price;

    public Item(String id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public void display(){
        System.out.println("Item ID : "+id+", Item Name : "+name+" Item Price : "+price);
    }
}
