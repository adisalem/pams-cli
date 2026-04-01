package com.pams.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.pams.model.Patient;

import java.io.File;
import java.time.LocalDate;
import java.util.*;

public class PAMSApp {

    public static void main(String[] args) throws Exception {

        List<Patient> patients = Arrays.asList(
            new Patient(1, "Daniel", "Agar", "(641) 123-0009",
                "dagar@m.as", "1 N Street", LocalDate.of(1987,1,19)),

            new Patient(2, "Ana", "Smith", "",
                "amsith@te.edu", "", LocalDate.of(1948,12,5)),

            new Patient(3, "Marcus", "Garvey", "(123) 292-0018",
                "", "4 East Ave", LocalDate.of(2001,9,18)),

            new Patient(4, "Jeff", "Goldbloom", "(999) 165-1192",
                "jgold@es.co.za", "", LocalDate.of(1995,2,28)),

            new Patient(5, "Mary", "Washington", "",
                "", "30 W Burlington", LocalDate.of(1932,5,31))
        );

        // Sort by age DESC (oldest first)
        patients.sort((p1, p2) -> Integer.compare(p2.getAge(), p1.getAge()));

        // Convert to JSON
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        // Write to file
        mapper.writeValue(new File("patients.json"), patients);

        System.out.println("JSON file created successfully!");
    }
}