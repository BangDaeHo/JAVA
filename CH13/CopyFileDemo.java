package CH13;

import java.io.*;

public class CopyFileDemo {
    public static void main(String[] args){
        String input = "C:\\JAVA\\CH13\\org.txt";
        String output = "C:\\JAVA\\CH13\\dup.txt";

        try(FileInputStream fis = new FileInputStream(input);
            FileOutputStream fos = new FileOutputStream(output)){
                int c;

                while((c = fis.read()) != -1)
                    fos.write(c);
            }catch(IOException e){

            }
    }
}
