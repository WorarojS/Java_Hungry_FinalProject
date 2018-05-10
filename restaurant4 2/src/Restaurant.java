import javafx.scene.image.Image;

public class Restaurant {

    private String name;
    private String style;
    private String price;
    private String location;
    private String reviews;
    private Image logo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public Image getLogo() {
        return logo;
    }



    public Restaurant(String name, String style, String price, String location, String reviews) {

        this.name = name;
        this.style = style;
        this.price = price;
        this.location = location;
        this.reviews = reviews;

    }
}
