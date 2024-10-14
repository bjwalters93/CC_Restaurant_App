package com.example.projects.codecademy_portfolio_app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private long id;

    // Usernames need to be unique for each user.
    @Column(name = "USER_NAME")
    @Getter
    @Setter
    private String userName;

    @Column(name = "CITY")
    @Getter
    @Setter
    private String city;

    @Column(name = "STATE")
    @Getter
    @Setter
    private String state;

    @Column(name = "ZIP_CODE")
    @Getter
    @Setter
    private String zipCode;

    @Column(name = "SHOW_PEANUT_SCORE")
    @Getter
    @Setter
    private boolean peanutScore;

    @Column(name = "SHOW_EGG_SCORE")
    @Getter
    @Setter
    private boolean eggScore;

    @Column(name = "SHOW_DAIRY_SCORE")
    @Getter
    @Setter
    private boolean dairyScore;
}
