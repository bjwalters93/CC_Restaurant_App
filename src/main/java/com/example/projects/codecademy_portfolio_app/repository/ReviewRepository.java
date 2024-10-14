package com.example.projects.codecademy_portfolio_app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.projects.codecademy_portfolio_app.model.Review;
import com.example.projects.enums.PostStatus;

public interface ReviewRepository extends CrudRepository<Review, Long> {
    List<Review> findByPostStatus(PostStatus postStatus);
}

// Dining review entity-related scenarios:
/*
 * 1. As a registered user, I want to submit a dining review. -POST && GET -note
 * "as a registered user". User must exist to make a post.
 * 2. As an admin, I want to get the list of all dining reviews that are pending
 * approval. -GET - findByPostStatus()
 * 3. As an admin, I want to approve or reject a given dining review. -PUT
 * 4. As part of the backend process that updates a restaurant’s set of scores,
 * I want to fetch the set of all approved dining reviews belonging to this
 * restaurant. -GET - findByPostStatus()
 */
