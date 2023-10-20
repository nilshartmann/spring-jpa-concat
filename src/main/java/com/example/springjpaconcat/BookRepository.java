package com.example.springjpaconcat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface BookRepository extends Repository<Book, String> {

    @Query("""
            select b from Book b
                where :t is null or b.title like concat(:t, '%')
            """)
    List<Book> findWithTitle(String t);

}
