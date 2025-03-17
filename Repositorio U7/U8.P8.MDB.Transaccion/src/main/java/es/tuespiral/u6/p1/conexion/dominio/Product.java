package es.tuespiral.u6.p1.conexion.dominio;

public class Product {
    private Integer productId;
    private String productName;
    private String description;
    private Double standardCost;
    private Double listPrice;
    private Integer categoryId;

    public Product(Integer productId, String productName, String description, Double standardCost, Double listPrice, Integer categoryId) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.standardCost = standardCost;
        this.listPrice = listPrice;
        this.categoryId = categoryId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getStandardCost() {
        return standardCost;
    }

    public void setStandardCost(Double standardCost) {
        this.standardCost = standardCost;
    }

    public Double getListPrice() {
        return listPrice;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
    
    
}
