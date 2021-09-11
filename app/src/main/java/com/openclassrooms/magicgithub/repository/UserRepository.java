package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        return (this.apiService.getUsers() != null) ? this.apiService.getUsers() : new ArrayList<>();
    }

    public void generateRandomUser() {
        this.apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        // TODO: A modifier
    }
}
