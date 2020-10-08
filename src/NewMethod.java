/**
 * NewMethod
 */
public class NewMethod {

    String property = "George";

    public void count(int num){

        for (int i = 1; i <= num; i++) {
            System.out.println("the number was " + i );
            ;
        }

        System.out.println("loop over");

    }

    public void printShirtSize(char shirt) {

        String msg = "";

        switch (shirt) {
            case 's':
                msg = "Shirt is small";

                break;

            case 'm':
                msg = "Shirt is medium";

                break;

            case 'l':
                msg = "Shirt is large";

                break;

            case 'x':
                msg = "Shirt is xtra large";

                break;

            default:
                msg = "Sorry we couldnt find that size";
                
                break;
        }

        System.out.println(msg);
    }

    public void sayHello() {
        System.out.println("Hello There");
    }
}