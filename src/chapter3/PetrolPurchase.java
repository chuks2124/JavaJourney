package chapter3;

public class PetrolPurchase {
    private String location;
    private String petrolType;
    private int quantity;
    private double price;
    private double discount;

    public PetrolPurchase(String location, String petrolType, int quantity, double price, double discount) {
        this.location = location;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
        }


    public String getPetrolType() {
        return petrolType;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0.00) {
            this.quantity = quantity;
        }
    }

    public double getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        if (price > 0.00) {
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setDiscount(double discount) {
        if (discount > 0.00) {
            this.discount = discount;
        }
    }

    public double getDiscount() {
        return discount;
    }

    public double getpurchaseAmount() {
        double totalcost = (quantity * price);
        double discountAmount = totalcost * (discount / 100);
        return totalcost - discountAmount;
    }
}

