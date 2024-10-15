package com.nelnaji.demospring2024.dl.models;

import java.time.LocalDate;

public record Cat (
    long id,
    String catName,
    LocalDate birthDate,
    String breed,
    String description
){}
