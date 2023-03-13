package src.com.ua.lesson14Work;

import src.com.ua.lesson14Work.domain.MemberOfUniversity;
import src.com.ua.lesson14Work.domain.Student;
import src.com.ua.lesson14Work.domain.TaxType;
import src.com.ua.lesson14Work.domain.Teacher;
import src.com.ua.lesson14Work.service.GeneralTaxService;
import src.com.ua.lesson14Work.service.RectorService;
import src.com.ua.lesson14Work.service.TaxesService;
import src.com.ua.lesson14Work.service.ThirdGroupTaxService;

public class Main {

    public static void main(String[] args) {

        RectorService rector = new RectorService();
        MemberOfUniversity student = new Student();
        MemberOfUniversity teacher = new Teacher();

        rector.sortStudentsOfAverageScore();
        rector.sortTeacherOfWorksHours();
        student.determinePersonality();
        rector.printStudents();
        teacher.determinePersonality();
        rector.printTeachers();


        TaxesService thirdGroup = new ThirdGroupTaxService();
        TaxesService generalGroup = new GeneralTaxService();
        Teacher[] teachersThirdGroupTax = rector.findTeacherByTaxType(TaxType.THIRD_GROUP);
        Teacher[] teachersGeneralGroupTax = rector.findTeacherByTaxType(TaxType.GENERAL_TAX);


        System.out.println(generalGroup.calculateTaxes(teachersGeneralGroupTax));
        System.out.println(thirdGroup.calculateTaxes(teachersThirdGroupTax));


    }


}
