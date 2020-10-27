package com.ecz;

public class Product {
    private String productId;
    private String productName;
    private String price;
    private String coffeeOrigin;

    public Product(String productId2, String productName2, String price2, String coffeeOrigin2) {
        this.productId = productId2;
        this.productName = productName2;
        this.price = price2;
        this.coffeeOrigin = coffeeOrigin2;
	}

	public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCoffeeOrigin() {
        return coffeeOrigin;
    }

    public void setCoffeeOrigin(String coffeeOrigin) {
        this.coffeeOrigin = coffeeOrigin;
    }


    @Override
    public String toString() {
        return "\n Product [coffeeOrigin=" + coffeeOrigin + ", price=" + price + ", productId=" + productId
                + ", productName=" + productName + "]";
    }

    
   
}
