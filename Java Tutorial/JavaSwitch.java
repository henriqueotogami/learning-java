public class JavaSwitch {

    static void exerciseOne(String[] args) {
        // Insert the missing parts to complete the following switch statement.
        int day = 2;
        switch (day) {
            case 1:
            System.out.println("Saturday");
            break;
            case 2:
            System.out.println("Sunday");
            ;
        }
    }

    static void exerciseTwo(String[] args) {
        // Complete the switch statement, and add the correct keyword at the end to specify some code to run if there is no case match in the switch statement.
        int day = 4;
        switch (day) {
            case 1:
            System.out.println("Saturday");
            break;
            case 2:
            System.out.println("Sunday");
            break;
            default:
            System.out.println("Weekend");
        }
    }
}