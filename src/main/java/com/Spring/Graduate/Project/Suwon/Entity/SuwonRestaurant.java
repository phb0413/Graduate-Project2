package com.Spring.Graduate.Project.Suwon.Entity;

import javax.persistence.*;

@Entity
@Table(name = "SuwonRestaurant")
public class SuwonRestaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String imageUrl;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private String rating;

    public SuwonRestaurant() {
    }

    public SuwonRestaurant(String name, String imageUrl, String category, String rating) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.category = category;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getCategory() {
        return category;
    }

    public String getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "SuwonRestaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", category='" + category + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
