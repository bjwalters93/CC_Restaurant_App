package com.example.projects.codecademy_portfolio_app.controller;

import com.example.projects.codecademy_portfolio_app.repository.RestaurantRepository;
import com.example.projects.codecademy_portfolio_app.model.Restaurant;

// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurants")
class RestaurantController {

    private final RestaurantRepository restaurantRepository;

    RestaurantController(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @GetMapping
    Iterable<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    @PostMapping("/newRestaurant")
    Restaurant newEmployee(@RequestBody Restaurant newRestaurant) {
        return restaurantRepository.save(newRestaurant);
    }

    // // Single item

    // @GetMapping("/employees/{id}")
    // Employee one(@PathVariable Long id) {

    // return repository.findById(id)
    // .orElseThrow(() -> new EmployeeNotFoundException(id));
    // }

    // @PutMapping("/employees/{id}")
    // Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable
    // Long id) {

    // return repository.findById(id)
    // .map(employee -> {
    // employee.setName(newEmployee.getName());
    // employee.setRole(newEmployee.getRole());
    // return repository.save(employee);
    // })
    // .orElseGet(() -> {
    // return repository.save(newEmployee);
    // });
    // }

    // @DeleteMapping("/employees/{id}")
    // void deleteEmployee(@PathVariable Long id) {
    // repository.deleteById(id);
    // }
}
