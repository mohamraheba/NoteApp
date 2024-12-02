package com.example.noteapp.repositories;



import com.example.noteapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // You can define custom queries here if needed
    // Example: Find User by name
    User findByName(String name);
}

