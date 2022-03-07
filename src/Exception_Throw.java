public class Exception_Throw {


    public static void main(String[] args) {
        try{
            Exception e =  new Exception("intended Error**");
            throw e;//
            //throw new Exception("intended ERROR ***");
        }catch(Exception e){
            System.out.println("error message :  " + e.getMessage());
            e.printStackTrace();


        }
        System.out.println(" Program closed ");
    }
}
