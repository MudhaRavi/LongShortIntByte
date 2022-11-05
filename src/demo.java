public class demo {

    public static void main(String[] args) {
       /* int result = 1 + 2; // 1+2=3
        System.out.println("1+2 = " +result);
        int previous_result  = result;
        System.out.println("Previous_result = " +previous_result);
         result = result -1;
        System.out.println("result - 1 = " +result);*/


       /* int topScore = 99;
        int secondTop = 60;
        if (topScore > secondTop && topScore < 100) {
            System.out.println(" TopScore is grater and TopScore is less than 100");
        }*/

        double firstVariable = 20.00d;
        double secondVariable =80.00d;
        double result = (firstVariable + secondVariable) *100.00d;
        System.out.println("adding both values and multiple by 100 = " + result);

        double reminder = result % 40.00d;
        System.out.println("the reminder = " + reminder);

        boolean isNotReminder = (reminder == 0) ? true : false;
        System.out.println(" is not reminder =" + isNotReminder);

        if (!isNotReminder) {
            System.out.println(" got some reminder");
        }





    }
}
