package com.example.springjpaconcat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(TestSpringJpaConcatApplication.class)
class SpringJpaConcatApplicationTests {

    @Autowired
    private BookRepository bookRepository;

    @Test
    void findWithNullable() {
        bookRepository.findWithTitle(null);
    }

}
