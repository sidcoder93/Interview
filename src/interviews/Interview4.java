package interviews;


/**
 * @cognizant
 */
public class Interview4 {

    public static void m1(Object obj){
        System.out.println("Obejct method");
    }


    public static void m1(String obj){
        System.out.println("String method");
    }

    public static void main(String[] args) {


        m1(null);
    }
}
