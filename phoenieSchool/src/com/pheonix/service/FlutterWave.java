package com.pheonix.service;

import com.pheonix.models.Student;

import java.math.BigDecimal;

public class FlutterWave implements PaymentService{
    @Override
    public void processPayment(Student student, BigDecimal amount) {
        //TODO call flutterwave api
    }
}
