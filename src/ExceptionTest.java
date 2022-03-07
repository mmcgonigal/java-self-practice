public class ExceptionTest {
    public static void main(String[] args) {

       // system.out.println(args[0]);  -- compile error


      //  System.out.println(args[0]);  -- runtime error why ?  args has not been initialized

        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);  //not executing bwxUaw of error above
        } catch(ArithmeticException ae) {
            if (ae instanceof ArithmeticException)
                System.out.println("true");
            ae.printStackTrace();
            System.out.println("Exception message : "+  ae.getMessage());
        }catch(Exception e){
            System.out.println("Exception");
        }//try-catch end
        System.out.println(6);
    }// main

}

