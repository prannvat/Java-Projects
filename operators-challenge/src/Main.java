public class Main {
    public static void main(String[] args) {
        //1.Create a double variable with the value of 20
        //2.Create a second variable of type double with the value of 80
        //3.Add both numbers up and multiply by 25
        //4.Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        //5.Write and "if" statement that displays a message "Total was over the limit"
        //  if the remaining total (#4) is equal to 20 or less.

         double initialNo = 20;
         double secondNo = 80;
         double result = (initialNo + secondNo)*25;
         double remainder = result % 40;
         System.out.println("Remainder is " + remainder);
         if(remainder <= 20){
             System.out.println("Total was over the limit");
         }
    }
}