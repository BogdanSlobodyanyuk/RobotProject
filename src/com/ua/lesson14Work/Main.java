package src.com.ua.lesson14Work;

import src.com.ua.lesson14Work.domain.MemberOfUniversity;
import src.com.ua.lesson14Work.domain.Student;
import src.com.ua.lesson14Work.domain.TaxType;
import src.com.ua.lesson14Work.domain.Teacher;
import src.com.ua.lesson14Work.service.GeneralTaxService;
import src.com.ua.lesson14Work.service.RectorService;
import src.com.ua.lesson14Work.service.TaxesService;
import src.com.ua.lesson14Work.service.ThirdGroupTaxService;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        RectorService rector = new RectorService();
        MemberOfUniversity student = new Student();
        MemberOfUniversity teacher = new Teacher();

        rector.sortStudentsOfAverageScoreForArray();
        rector.sortTeacherOfWorksHoursForArray();
        student.determinePersonality();
        rector.printStudents("array");
        teacher.determinePersonality();
        rector.printTeachers("array");


        TaxesService thirdGroupForArray = new ThirdGroupTaxService();
        TaxesService generalGroupForArray = new GeneralTaxService();
        Teacher[] teachersThirdGroupTax = rector.findTeacherByTaxTypeForArray(TaxType.THIRD_GROUP);
        Teacher[] teachersGeneralGroupTax = rector.findTeacherByTaxTypeForArray(TaxType.GENERAL_TAX);


        System.out.println(generalGroupForArray.calculateTaxes(teachersGeneralGroupTax));
        System.out.println(thirdGroupForArray.calculateTaxes(teachersThirdGroupTax));





// 000000000000000000000000            Realization for list         00000000000000000000000000000




        rector.sortStudentsOfAverageScoreForList();
        rector.sortTeacherOfWorksHoursForList();
        student.determinePersonality();
        rector.printStudents("list");
        teacher.determinePersonality();
        rector.printTeachers("list");


        TaxesService thirdGroupForList = new ThirdGroupTaxService();
        TaxesService generalGroupForList = new GeneralTaxService();
        List<Teacher> teachersThirdGroupTaxForList = rector.findTeacherByTaxTypeForList(TaxType.THIRD_GROUP);
        List<Teacher> teachersGeneralGroupTaxForList = rector.findTeacherByTaxTypeForList(TaxType.GENERAL_TAX);


        System.out.println(generalGroupForList.calculateTaxes(teachersGeneralGroupTaxForList));
        System.out.println(thirdGroupForList.calculateTaxes(teachersThirdGroupTaxForList));


    }


}
