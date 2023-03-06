package src.com.ua.lesson14.service;

import src.com.ua.lesson14.domain.Teacher;

public class ThirdGroupTaxService implements  TaxesService{

    private static final double SINGLE_SOCIAL_CONTRIBUTION_AMOUNT = 1450.50;
    @Override
    public double calculateTaxes(Teacher[] teachers) {
        return 0;
    }

    @Override
    public double calculateTaxes(Teacher teacher) {
        double taxValueForEmployee = teacher.getSalary() * 0.05 + SINGLE_SOCIAL_CONTRIBUTION_AMOUNT;
        return taxValueForEmployee;
    }

}
