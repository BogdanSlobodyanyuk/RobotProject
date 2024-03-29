package src.com.ua.lesson14Work.service;

import src.com.ua.lesson14Work.domain.Teacher;

import java.util.List;

public interface TaxesService {

    double calculateTaxes(Teacher teacher);

    default double calculateTaxes(Teacher[] teachers) {
        double taxValueForEmployees = 0;
        for (Teacher teacher : teachers) {
            if (teachers != null) {
                taxValueForEmployees += calculateTaxes(teacher);
            }
        }
        return taxValueForEmployees;
    }

    default double calculateTaxes(List<Teacher> teachers) {
        double taxValueForEmployees = 0;
        for (Teacher teacher : teachers) {
            if (teachers != null) {
                taxValueForEmployees += calculateTaxes(teacher);
            }
        }
        return taxValueForEmployees;
    }


}
