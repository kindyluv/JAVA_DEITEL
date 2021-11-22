package phoenixSchool.src.service;

import phoenixSchool.src.models.Student;

import java.math.BigDecimal;

public interface PaymentService {

    void processPayment(Student student, BigDecimal amount);
}
