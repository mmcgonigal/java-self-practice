package Exception_practice;

public class Exception_re_Throwing {
    static void method1()  throws Exception {
          try {
              throw new Exception();
          }catch(Exception e){
              System.out.println("Exception has been caught in method 1  "); // method 1 에서  예외 처리 가 됨
              throw e; // 근데, 다시 예외를 던짐.
          }
    }

    public static void main(String[] args) {
        try{
            method1(); // method1 의 catch에 예외 처리가 있어서, 예외가 처리 되나, 그 다음 코드 throw e 에 의해 예외가 다시 던져짐.
        }catch (Exception e){
            System.out.println(" Exception has been caught in Main "); // 그리고  그 예외가 다시 처리 됨
        }
    }
}
