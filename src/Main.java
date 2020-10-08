import java.util.Random;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // NewMethod variable = new NewMethod();

        // variable.printShirtSize('s');
        // variable.printShirtSize('l');

        // variable.printShirtSize('x');

        // variable.sayHello();

        // System.out.println("Test");

        // System.out.println(variable.property);

        // variable.count(20);

        // int[] simpleArray = { 1,2,3,4,5 };

        // String[] newArr = {"George", "Neil", "Joseph", "Marvin"};

        // for (int i = 0; i < simpleArray.length; i++) {

        // System.out.println(newArr[3]);

        // }

        // enhanced for loop

        // for (String name : newArr) {

        // System.out.println("Current Name " + name);

        // }
        // int iterator = 15;

        // // do {

        // // while (iterator > 15 ) {
        // // System.out.println(iterator);
        // // iterator--;

        // // logic

        // // do you want to continue
        // // continue = no
        // }
        // do {
        // System.out.println("Im running");
        // iterator++;

        // } while (iterator < 20 );
        // }

        // keywords: break continue return

        Random random = new Random();

        int breakPoint = random.nextInt(100);

        for (int i = 1; i < 5; i++) {
            System.out.println("Beginning loop" +i);
            for (int j = 0; j < 100; j++) {
                if (j == breakPoint) {
                    System.out.println("Length of this list: " + breakPoint);
                    break;
                }
                System.out.println("Index is: " + j);
            }
            System.out.println("Finished list: " + i);
            breakPoint = random.nextInt(100);
        }

        System.out.println("Post Loop");

    }
}
