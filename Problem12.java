import java.util.ArrayList;

public class Problem12 {
    public static void main(String[] args) {

        Order order1 = new Order(1234, "2019-05-02", "34567",
                "Patrik Petersson\nGrindtorps skolgränd 44\n18347 Stockholm");
        order1.addOrderLine(1234, 1, 1500, 25); // Processor A
        order1.addOrderLine(2345, 3, 500, 25); // Hårddisk B
        System.out.println(order1);
        order1.addOrderLine(3456, 1, 180, 25); // Mus
        System.out.println("Ditt totala pris : " + order1.getTotalPrice());
        
        
        order1.toPrint();
        
    }
}