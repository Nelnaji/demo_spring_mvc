package com.nelnaji.demospring2024.dl.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageForm {
    private String userName;
    private String userEmail;
    private String userMessage;
}
