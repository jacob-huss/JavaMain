
/**
 * MainR
 */
public class MainR {
    public static void main(String[] Args) {

        // random number loop with nested prints lab part 1

        // Math.random();

        // int randOne = (int) (Math.random() * 100);

        // if (randOne > 70) {

        // if (randOne > 90) {
        // System.out.println("Really Big Number");
        // } else {
        // System.out.println("Big Number");
        // }

        // }

        // if ((randOne >= 40) && (randOne <= 70)) {

        // if (randOne == 50) {
        // System.out.println("Really Average Number");
        // } else {
        // System.out.println("Medium Number");
        // }
        // }
        // if (randOne < 40) {

        // if (randOne < 15) {
        // System.out.println("Really Small Number");
        // } else{
        // System.out.println("Small Number");
        // }

        // }
        // }

        // for loop lab part 2
        // print 1-30
        // for (int i = 0; i <= 30; i++) {

        // // print even only
        // if (i % 2 == 0) {
        // System.out.println("Loop Value =" + i);
        // }

        // }

        // count down loop 20 to 0
        // for (int i = 20; i > -1; i--) {
        // System.out.println("Loop Value =" +i);
        // }
        // lab example examination
        // for (int x = 1, y = 1; x < 20 && y < 50; x++, y += 4) {
        // System.out.println("X is: " + x + ", y is: " + y);
        // }

        // string enhanced loop

        // String str = "This is a very long and completely meaningless string that
        // serves no purpose.";
        // char [] c = str.toCharArray();

        // for (int i = 0; i < c.length; i++) {
        // System.out.println(c[i]);
        // }

        // capital vowel
        String str = "This is a very long and completely meaningless string that servers no purpose.";

        char[] c = str.toCharArray();

        enum
        Vowels{A,E,I,O,U,a,e,i,o,u}

        for (int i = 0; i < c.length; i++) {
            for (Vowels v : Vowels.values()) {
                if ((str.charAt(i) + "").equalsIgnoreCase(v.name())) {
                    System.out.println(str.charAt(i));
                }
            }
        }
    }
}
