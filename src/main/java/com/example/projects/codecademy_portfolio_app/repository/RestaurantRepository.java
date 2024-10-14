package com.example.projects.codecademy_portfolio_app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.projects.codecademy_portfolio_app.model.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {

    List<Restaurant> findByNameAndZipCode(String name, String zipCode);

    List<Restaurant> findByZipCodeAndOverAllScoreGreaterThanOrderByOverAllScoreDesc(String zipCode, double number);

}

// Restaurant entity-related scenarios:
/*
 * 1. As an application experience, I want to submit a new restaurant entry.
 * Should a restaurant with the same name and with the same zip code already
 * exist, I will see a failure. -GET to check existance, && POST.
 * 2. As an application experience, I want to fetch the details of a restaurant,
 * given its unique Id. -GET : findById(ID id) crudrepo default method
 * 3. As an application experience, I want to fetch restaurants that match a
 * given zip code and that also have at least one user-submitted score for a
 * given allergy. I want to see them sorted in descending order. -GET ...unsure?
 * need to figure this one out.
 */
