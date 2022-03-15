package Exception_practice;

import java.io.File;

public class Exception_Practice {

    static File createFile(String filename) throws Exception{
        if (filename == null || filename.equals(""))
            throw new Exception("not valid name of the file");
        File f = new File(filename);
        f.createNewFile();
        return f;
    }
    public static void main(String[] args) {
        try {
            File f = createFile(args[0]);
            System.out.println(f.getName() + " successfully created a file");
        }catch(Exception e){
            System.out.println(e.getMessage() + " Please re-enter the name of file");
        }
    }


}
