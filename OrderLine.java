
public class OrderLine {
    private int articleID;
    private int quantity;
    private double pricePerPiece;
    private double taxRate;

    public OrderLine(int articleID, int quantity, double pricePerPiece, double taxRate) {
        this.articleID = articleID;
        this.quantity = quantity;
        this.pricePerPiece = pricePerPiece;
        this.taxRate = taxRate;

    }

    public int getArticleID() {
        return articleID;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerPiece() {
        return pricePerPiece;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getPrice() {
        return quantity * pricePerPiece;
    }

    public String toString() {

        return "(" + articleID + ", " + quantity + ", " + pricePerPiece + "," + taxRate + ")";
    }



}
