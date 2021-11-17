package com.pheonix.service;

import com.pheonix.models.Student;

import java.math.BigDecimal;

public interface PaymentService {

    void processPayment(Student student, BigDecimal amount);
}
