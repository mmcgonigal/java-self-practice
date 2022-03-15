package Exception_practice;

public class MyException extends Exception{
    private final int ERR_CODE;

     MyException(String msg, int err_code) {
        super(msg);
        ERR_CODE = err_code;
    }
    MyException(String msg){
         this(msg, 100);
    }
    public int getERR_CODE(){
         return ERR_CODE;
    }

}
