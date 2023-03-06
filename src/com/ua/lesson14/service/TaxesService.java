package src.com.ua.lesson14.service;

import src.com.ua.lesson13Practice.domain.Employee;
import src.com.ua.lesson14.domain.Teacher;

public interface TaxesService {

    double calculateTaxes (Teacher teacher);
    default double  calculateTaxes (Teacher[] teachers){
        double taxValueForEmployees = 0;
        for (int i = 0; i < teachers.length; i++) {
            if (teachers != null) {
                taxValueForEmployees += calculateTaxes(teachers[i]);
            }
        }
        return taxValueForEmployees;
    }

}
