package com.Spring.Graduate.Project.Kimcheon.Entity;


import javax.persistence.*;

@Entity
@Table(name = "KimcheonRestaurant")
public class KimcheonRestaurant {
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


    public KimcheonRestaurant() {
    }

    public KimcheonRestaurant(String name, String imageUrl, String category, String rating) {
        this.name=name;
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
        return "KimcheonRestaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", category='" + category + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
