public class LongShortIntByte {

    public static void main(String[] args) {





        byte byteValue = 127;
        short shortValue = 3287;
        int intValue = 56788999;
        long longValue = (5000L + 10L * (byteValue + intValue + shortValue));
        System.out.println("The Long Total Value =" + longValue);

        double numberOfPounds = 200d;
        double convertedPounds = numberOfPounds * 0.45359237d;
        System.out.println(convertedPounds);

        int myIntValue  = 100;
        int myMaxvalue = Integer.MAX_VALUE;
        int myMinValue = Integer.MIN_VALUE;
        System.out.println("my MAX Value = " + myMaxvalue + " My MIN Value ="+ myMinValue);

        double myDoubleValue  = 12.3455666d;
        double myDoubleMaxvalue = Double.MAX_VALUE;
        double myDoubleMinValue = Double.MIN_VALUE;
        System.out.println("my MAX Value = " + myMaxvalue + " My MIN Value ="+ myMinValue);

        String myString = " I am ravi kumar";
        myString = myString + " I am so confident";
       // System.out.println(myString);
        myString =  myString + " I can achieve all i need ";
        System.out.println(myString);

    }
}
