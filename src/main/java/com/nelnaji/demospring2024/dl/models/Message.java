package com.nelnaji.demospring2024.dl.models;

import java.time.LocalDate;

public record Message (
    String userName,
    String userEmail,
    String userMessage
){
}
