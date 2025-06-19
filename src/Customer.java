public class Customer {
    private String id;
    private String name;
    private int phoneNumber;

    public Customer(String id, String name, int phoneNumber){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public void display(){
        System.out.println("ID :"+id+" Name : "+name+" Phone Number : "+phoneNumber);
    }

}
