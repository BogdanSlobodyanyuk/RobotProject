package src.com.ua.lesson14Work.service;

import src.com.ua.lesson14Work.domain.Teacher;

public class GeneralTaxService implements TaxesService {

    @Override
    public double calculateTaxes(Teacher teacher) {
       return teacher.getSalary() * 0.195;

    }
}
