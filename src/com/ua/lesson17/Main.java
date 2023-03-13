package src.com.ua.lesson17;

public class Main {

    public static void main(String[] args) {

        HomeworkService dayFoundByFirstWay = new HomeworkFirstWay();
        HomeworkService dayFoundBySecondWay = new HomeworkSecondWay();
        HomeworkService dayFoundByThirdWay = new HomeworkThirdWay();

        System.out.println("Now You are using the First way to find a day for a number");
        dayFoundByFirstWay.checkHomework();
        System.out.println("Now You are using the Second way to find a day for a number");
        dayFoundBySecondWay.checkHomework();
        System.out.println("Now You are using the Third way to find a day for a number");
        dayFoundByThirdWay.checkHomework();



    }
}
