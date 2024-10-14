package com.example.projects.codecademy_portfolio_app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.projects.codecademy_portfolio_app.model.UserProfile;

public interface UserRepository extends CrudRepository<UserProfile, Long> {
    // Step 1, 2, 3, and 4 should be covered.
    // - There are default methods provided by CrudRepository.
    // - Defualt methods have a specific return type which you'll need to know when
    // implementing them in the controller.
    // - What happens if a method doesn't find a match? What does it return. You'll
    // need to know.
    List<UserProfile> findByUserName(String userName);
}

// User entity-related scenarios:
/*
 * 1. As an unregistered user, I want to create my user profile using a display
 * name that’s unique only to me. -POST
 * 2. As a registered user, I want to update my user profile. I cannot modify my
 * unique display name. -PUT
 * 3. As an application experience, I want to fetch the user profile belonging
 * to a given display name. -GET
 * 4. As part of the backend process that validates a user-submitted dining
 * review, I want to verify that the user exists, based on the user display name
 * associated with the dining review. -GET
 */
