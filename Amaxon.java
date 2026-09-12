public class Amaxon {

    int id;
    String product;
    String status;
    int orderid;

    // Constructor 1 with this keyword
   public Amaxon(int id, String product, int orderid) {
        this.id = id;
        this.product = product;
        this.orderid = orderid;
    }

    // Constructor 2 with this keyword
   public Amaxon(String product, String status) {
        this.product = product;
        this.status = status;
    }

    // Constructor 3 without this keyword
     public Amaxon(int oid) {
        orderid = oid;
    }

    public static void main(String[] args) {

        Amaxon a1 = new Amaxon(101, "toys", 10101);
        System.out.println("Product ID = " + a1.id);
        System.out.println("Product Name = " + a1.product);
        System.out.println("Order ID = " + a1.orderid);

        System.out.println("--------------------------------");

        Amaxon a2 = new Amaxon("Clothes", "Delivered");
        System.out.println("Product Name = " + a2.product);
        System.out.println("Product Status = " + a2.status);

        System.out.println("--------------------------------");

        Amaxon a3 = new Amaxon(1002);
        System.out.println("Order ID = " + a3.orderid);
    }
}