package com.alehkhvasko.peopledbweb.web.formatter;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Component
public class LocalDateFormatter implements Formatter<LocalDate> {
    private final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("MMMM dd yyyy");

    @Override
    public LocalDate parse(String text, Locale locale) throws ParseException {
        return LocalDate.parse(text, timeFormatter);
    }

    @Override
    public String print(LocalDate object, Locale locale) {
        return timeFormatter.format(object);
    }
}
