package com.example.springjpaconcat;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
@Import(TestSpringJpaConcatApplication.class)

class SpringJpaConcatApplicationTests {
private static final Logger log = LoggerFactory.getLogger( SpringJpaConcatApplicationTests.class );
    @Autowired

    private BookRepository bookRepository;

    @Test
    void this_WORKS_InSpringBoot_3_1_5() {

        log.info(" ########### WITH ARGUMENT ################## ");
        var resultWithLi = bookRepository.findWithTitle("Li");
        log.info(" ########### WITH ARGUMENT FINISHED ################## {}", resultWithLi);

        log.info("############# WITH NULL ####################");
        var result = bookRepository.findWithTitle(null);
        log.info("############# WITH NULL FINISHED #################### {}", result);
    }

    @Test
    void this_DOES_NOT_WorkInSpringBoot_3_1_5() {
        log.info("############# WITH NULL ####################");
        var result = bookRepository.findWithTitle(null);
        log.info("############# WITH NULL FINISHED #################### {}", result);

        log.info(" ########### WITH ARGUMENT ################## ");
        var resultWithLi = bookRepository.findWithTitle("Li");
        log.info(" ########### WITH ARGUMENT FINISHED ################## {}", resultWithLi);

    }



//    @Test
//    void findWithTypecastAndNullArgument() {
//        assertEquals(3, bookRepository.findWithTitleAndCast(null).size());
//    }
//
//    @Test
//    void findWithTypecastAndArguments() {
//        assertEquals(2, bookRepository.findWithTitleAndCast("L").size());
//        assertEquals(1, bookRepository.findWithTitleAndCast("Li").size());
//    }

}
