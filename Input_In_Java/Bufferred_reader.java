package Input_In_Java;

import java.io.*;

public class Bufferred_reader {
    public static void main( String[] args ) throws IOException{
        BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
        System.out.println("Enter the String ");
        String s = br.readLine();
        System.out.println("You Entered : " + s);
    }    
}
