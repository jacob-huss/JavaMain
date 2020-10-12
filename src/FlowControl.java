/**
 * FlowControl
 */
// Answer to Question 1
/*     What is the value of k after the following loop executes:

          int k = 80;

          for (int i = 0; i < 5; i++) {

               k = k - 12;

          }

    a 32
    b 80
    c 20
    d 22
    e 0 

    I chose C because the numeral 5 in this equation denotes that the loop of k = k - 12; would be iterated 5 times resulting in 80 having 12 subtracted from it 5 times to equal 20 before the loop breaks
*/
public class FlowControl {

    public static void main(String[] Args) {
        // this equation for loop below tells the integer variable i will start at 0, and while it is less than 5 it will iterate in incremenets /// 1 , nested within this for loop is the second for loop with the condition that the integer variable k will start at 0 and while k is //// less than or 5 equal to the integer value i then continue to increment by 1 and run the code block that prints and asterisk with a ////// space, then the final code block command ran is a paragraph separate spacing print to create the stacked asterik effect
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}