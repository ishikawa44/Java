package group44.Project.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tovars {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name,category,brand,description,imgur;
    private Integer price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getImgur() {
        return imgur;
    }

    public void setImgur(String imgurl) {
        this.imgur = imgurl;
    }

    public Tovars() {
    }

    public Tovars(String name, String category, String brand, String description, String imgur, Integer price) {
        this.name = name;
        this.category = category;
        this.brand = brand;
        this.description = description;
        this.imgur = imgur;
        this.price = price;
    }
}
