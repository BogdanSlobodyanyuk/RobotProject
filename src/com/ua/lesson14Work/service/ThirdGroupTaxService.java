package src.com.ua.lesson14Work.service;

import src.com.ua.lesson14Work.domain.Teacher;

public class ThirdGroupTaxService implements  TaxesService{

    private static final double SINGLE_SOCIAL_CONTRIBUTION_AMOUNT = 1450.50;

    @Override
    public double calculateTaxes(Teacher teacher) {
       return teacher.getSalary() * 0.05 + SINGLE_SOCIAL_CONTRIBUTION_AMOUNT;

    }
}
