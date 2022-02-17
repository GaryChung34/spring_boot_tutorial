package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student gary = new Student("Gary", "gary6480@gmail.com", LocalDate.of(1992, Month.MARCH, 4));

            Student wendy = new Student("Wendy", "wendyNg@gmail.com", LocalDate.of(1992, Month.MARCH, 18));

            repository.saveAll(
                    List.of(gary, wendy)
            );
        };
    }


}
