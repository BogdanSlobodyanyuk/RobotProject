package src.com.ua.lesson14.service;

import src.com.ua.lesson14.domain.Teacher;

public class GeneralTaxService implements TaxesService {

    @Override
    public double calculateTaxes(Teacher[] teachers) {
        double taxValueForEmployees = 0;
        for (int i = 0; i < teachers.length; i++) {
            if (teachers != null) {
                taxValueForEmployees += calculateTaxes(teachers[i]);
            }
        }
        return taxValueForEmployees;
    }

    @Override
    public double calculateTaxes(Teacher teacher) {
        double taxValueForEmployee = teacher.getSalary() * 0.195;
        return taxValueForEmployee;

    }
}
