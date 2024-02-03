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
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args ->{
            Student marian = new Student(
                    "Marian",

                    LocalDate.of(2000, Month.JANUARY,5),
                    "m@m.com"
            );
            Student alex = new Student(
                    "Alex",

                    LocalDate.of(1990, Month.DECEMBER,10),
                    "a@a.com"
            );

            studentRepository.saveAll(
                    List.of(marian,alex)
            );
        };
    }
}
