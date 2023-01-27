package src.com.ua.lesson6;

public class Main {

    /*  I used  "static" "final" "byte" for "factorialStartNumber" variable because
     * we always start from number "1" or "0" like a start number for counting,
     * and we can not change that, definitely that type "byte" would be enough.    */
    static final byte theFirstFactorialNumber = 1;
    static final byte theFirstNumberOfFibonacci = 0;
    static final byte theSecondNumberOfFibonacci = 1;

    public static void main(String[] args) {


        // Task 1


        int t1UserStartNumber = 1;
        int t1UserEndNumber = 10;

        System.out.print("Numbers from " + t1UserStartNumber + " to " + t1UserEndNumber + ":  ");

        for (int i = t1UserStartNumber; i <= t1UserEndNumber; i++) {
            System.out.print(i + " ");
        }


        // Task 2


        int t2UserStartNumber = 1;
        int t2UserEndNumber = 100;

        System.out.print("\n" + "Even Numbers in diapason from " + t2UserStartNumber + " to " + t2UserEndNumber + ":  ");

        for (int i = t2UserStartNumber; i <= t2UserEndNumber; i++) {   // if we don't include 100 in our diapason than replace "i < 100" instead of "i <= 100".
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }


        // Task 3


        int t3UserFactorialnumber = 7;
        long t3FactorialResult = theFirstFactorialNumber;// Here I used type "long" to let user more wide diapason of numbers than type byte.

        System.out.print("\n" + "Factorials of " + t3UserFactorialnumber + ":  ");

        for (int i = theFirstFactorialNumber; i <= t3UserFactorialnumber; i++) {
            t3FactorialResult = t3FactorialResult * i;
            if (i == t3UserFactorialnumber) {
                System.out.print(t3FactorialResult);
            }
        }


        // Task 4


        int t4UserFiboNumberTo = 100;
        int t4UserFirstFiboNumber = theFirstNumberOfFibonacci;     // User can also use own two numbers of Fibonacci system
        int t4UserSecondFiboNumber = theSecondNumberOfFibonacci;

        System.out.print("\n" + "Fibonacci numbers with beginning from " + t4UserFirstFiboNumber + " and " + t4UserSecondFiboNumber +
                " values in diapason to " + t4UserFiboNumberTo + ":  ");

        while (t4UserFirstFiboNumber <= t4UserFiboNumberTo) {

            System.out.print( t4UserFirstFiboNumber + " ");

            int nextFiboNumber = t4UserFirstFiboNumber + t4UserSecondFiboNumber;
            t4UserFirstFiboNumber = t4UserSecondFiboNumber;
            t4UserSecondFiboNumber = nextFiboNumber;

        }
    }


}

