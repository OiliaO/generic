package products;

public abstract class Product {
    private String title;
    private Double price;
    private String id;

    public Product(String title, Double price) {
        this.title = title;
        this.price = price;
        this.id = generateId();
    }

    protected abstract String generateId();

    public String getTitle() { return title; }
    public Double getPrice() { return price; }
    public String getId() { return id; }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Price: " + price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(String id) {
        this.id = id;
    }
}