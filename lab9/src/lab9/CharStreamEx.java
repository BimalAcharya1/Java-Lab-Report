package Lab9;

import java.io.*;
public class CharStreamEx {
    public static void main(String[] args)throws Exception {
        String str = "This is an example of Character Stream.";
        FileWriter fw = new FileWriter("charStream.txt");
        fw.write(str);
        fw.close();
        System.out.println("File Write Successful");
        
        FileReader fr = new FileReader("charStream.txt");
        int ch;
        while((ch=fr.read())!= -1){
            System.out.print((char)ch);
        }System.out.println();
        fr.close();
    }
}
