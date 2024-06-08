package exception;

public class Age {

    public static boolean checkIfCanVote(int age){

        try {
            if (age < 18) {
                throw new AgeLessThan18Exception("Age is less than 18");
            }
            else {
                return true;
            }
        }catch (AgeLessThan18Exception ex){
            System.out.println("Exception is "+ ex.getMessage() );
            return false;
        }

    }
}
