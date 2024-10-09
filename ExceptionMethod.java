public class ExceptionMethod {

    public void checkAge(int age) throws Exceptions{
        if(age < 18){
                throw new Exceptions("Less Than 18... Can't Sign In...");
        }
        else{
            System.out.println("Welcome To Jay's App....");
        }
    }
    
}
