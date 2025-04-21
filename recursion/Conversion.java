public class Conversion{

    static String digits[] = {
         "zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"
    };

    public static void printDigit(int number){

        if(number == 0){
            return;
        }

        //get the last digit to print it into words
        int lastDigit = number % 10;

        //recurse the function
        printDigit(number / 10);

        //print the digit into words
        System.out.print(digits[lastDigit] + " ");
    }
    public static void main(String[] args){
        int number = 40;
        printDigit(number);
        System.out.println();

    }
}
