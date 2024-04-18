package com.Spring.Graduate.Project.Gangwon.Entity;

import javax.persistence.*;

@Entity
@Table(name = "GangwonRestaurant")
public class GangwonRestaurant {
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

    public GangwonRestaurant() {
    }

    public GangwonRestaurant(String name, String imageUrl, String category, String rating) {
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


}
