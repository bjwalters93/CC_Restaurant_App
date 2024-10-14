package com.example.projects.codecademy_portfolio_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import com.example.projects.enums.PostStatus;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private long id;

    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    private PostStatus postStatus;

    @Column(name = "USER_NAME")
    @Getter
    @Setter
    private String userName;

    @Column(name = "RESTAURANT_ID")
    @Getter
    @Setter
    private long restaurantId;

    @Column(name = "PEANUT_SCORE")
    @Getter
    @Setter
    private double peanutScore;

    @Column(name = "EGG_SCORE")
    @Getter
    @Setter
    private double eggScore;

    @Column(name = "DAIRY_SCORE")
    @Getter
    @Setter
    private double dairyScore;

    @Column(name = "COMMENTARY")
    @Getter
    @Setter
    private String commentary;
}
