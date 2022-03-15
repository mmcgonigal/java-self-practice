package Exception_practice;

public class ExceptionTest {
    public static void main(String[] args) {

        // system.out.println(args[0]);  -- //compile error


      // System.out.println(args[0]);  //-- runtime error why ?  args has not been initialize


        //THIS IS WHERE EXCEPTION DID NOT HAPPENED IN TRY-BLOCK

        System.out.println(1);

        try{
            System.out.println(2);
            System.out.println(3);
        }catch(Exception e){
            System.out.println(4);
        }// try catch end
        System.out.println(5);
        //1 ->2 ->3 -> 5

        System.out.println(1);
        try{
            System.out.println(0/0);
            System.out.println(2);
        } catch (ArithmeticException e){
            System.out.println(3);
        } // this is the end of try- catch
        System.out.println(4);

        //1 -> 3 -> 4

        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        }catch (ArithmeticException ae){
            if (ae instanceof ArithmeticException)
                System.out.println(5);
            System.out.println("ArithmeticException!!");
        }catch(Exception e){
            System.out.println(6);
            System.out.println("any other Exception other than ArithmeticException");
        }
        System.out.println(7);
        System.out.println(8);

        System.out.println(1);
        System.out.println(2);

        try{
            System.out.println(3);
            System.out.println(0/0);
            System.out.println((4));
        }catch(ArithmeticException ae){
            ae.printStackTrace();
            System.out.println("ae.getMessage() = " + ae.getMessage());
        }
        System.out.println(6);





//
//        System.out.println(1);
//        System.out.println(2);
//        try{
//            System.out.println(3);
//            System.out.println(0/0);
//            System.out.println(4);  //not executing bwxUaw of error above
//        } catch(ArithmeticException ae) {
//            if (ae instanceof ArithmeticException)
//                System.out.println("true");
//            ae.printStackTrace();
//            System.out.println("Exception message : "+  ae.getMessage());
//        }catch(Exception e){
//            System.out.println("Exception");
//        }//try-catch end
//        System.out.println(6);
    }// main

}

