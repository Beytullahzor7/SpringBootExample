package com.example.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return  args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(1999, Month.SEPTEMBER, 5)
            );

            Student tom = new Student(
                    "Tom",
                    "tom@gmail.com",
                    LocalDate.of(2002, Month.JUNE, 8)
            );

            repository.saveAll(List.of(mariam, tom));
        };
    }
}
