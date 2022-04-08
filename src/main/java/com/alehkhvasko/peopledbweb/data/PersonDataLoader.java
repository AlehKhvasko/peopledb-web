package com.alehkhvasko.peopledbweb.data;

import com.alehkhvasko.peopledbweb.biz.model.Person;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Component
public class PersonDataLoader implements ApplicationRunner {
    private final PersonRepository personRepository;

    public PersonDataLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //if (personRepository.count() == 0) {
            List<Person> people = List.of(
                    new Person(null, "Aleh", "Snake", LocalDate.of(1980, 1, 1), new BigDecimal(300)),
                    new Person(null, "John", "Brown", LocalDate.of(1985, 6, 20), new BigDecimal(250)),
                    new Person(null, "Elizabeth", "Ludvord", LocalDate.of(1990, 4, 15), new BigDecimal(210))
            );

            personRepository.saveAll(people);
        //}
    }
}
