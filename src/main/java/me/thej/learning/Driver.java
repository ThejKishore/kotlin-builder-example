package me.thej.learning;

import me.thej.model.Employee;
import me.thej.model.Validation;

public class Driver {

    public static void main(String[] args) {
        Employee employee = Employee.builder()
                .id(1)
                .firstName("Thej Kishore")
                .lastName("Karuneegar")
                .build();

        System.out.println("employee = " + employee);
        employee = employee.toBuilder().firstName("Thej Kishore").build();
        System.out.println("validate employee = " + Validation.getValidateEmployee().validate(employee));
    }
}
