package com.alehkhvasko.peopledbweb.web.controller;

import com.alehkhvasko.peopledbweb.biz.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/people")
public class PeopleController {

    @GetMapping
    public String getPeople(Model model) {
        List<Person> people = List.of(
                new Person(1L, "Al", "Snake", LocalDate.of(1980, 1, 1), new BigDecimal(300)),
                new Person(2L, "John", "Brown", LocalDate.of(1980, 1, 1), new BigDecimal(250)),
                new Person(3L, "Elli", "Ludvord", LocalDate.of(1980, 1, 1), new BigDecimal(210))
        );
        model.addAttribute("people", people);
        return "people";
    }
}
