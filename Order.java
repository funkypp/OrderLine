import java.util.ArrayList;

public class Order {
    private double totalPrice;
    private int orderID;
    private String orderDate;
    private String customerID;
    private String deliveryAddress;
    private ArrayList<OrderLine> orderList = new ArrayList<OrderLine>();

    public Order(int orderID, String orderDate, String customerID, String deliveryAddress) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.customerID = customerID;
        this.deliveryAddress = deliveryAddress;

    }

    public int getorderID() {
        return orderID;
    }

    public String getorderDate() {
        return orderDate;
    }

    public String getcustomerID() {
        return customerID;
    }

    public String getdeliveryAddress() {
        return deliveryAddress;
    }

    public String toString() {

        String result = orderID + ", " + orderDate + ", " + customerID + "," + deliveryAddress;

        for (OrderLine orderLine : orderList) {
            result += "\n" + orderLine.toString();
        }
        return result;
    }

    public double getTotalPrice() {
        double totalcost = 0;
        for (OrderLine line : orderList) {
            totalcost += line.getPrice();
        }
        return totalcost;
    }

    public void addOrderLine(int articleID, int quantity, double pricePerPiece, double taxRate) {
        OrderLine orderLine = new OrderLine(articleID, quantity, pricePerPiece, taxRate);
        orderList.add (orderLine);
        totalPrice += orderLine.getPrice();
    }

    public void toPrint() {
        for (OrderLine a : orderList) {
            System.out.println(a);
        }
    }
    public int getArticleIDD() {
        int Aid = 0;
        for (OrderLine line : orderList) {
            Aid = line.getArticleID();
        }
        return Aid;
    }
    public void getarticleIDZ() {
        for (OrderLine line: orderList){
            System.out.println(line.getArticleID());
        }
    }

    
}
