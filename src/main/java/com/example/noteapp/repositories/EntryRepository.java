package com.example.noteapp.repositories;

import com.example.noteapp.entities.Entry;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryRepository extends JpaRepository<Entry, Long> {

    // Example custom query: Find entries by user
    List<Entry> findByUser_Id(Long userId);

    // You can define more custom queries if needed
}
