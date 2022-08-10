import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       //Starts at 1 and NOT 0
       int lineNumber = 1;
       
       while (in.hasNext()) {
           System.out.println(lineNumber + " " + in.nextLine());
           lineNumber++;
       }
       
    }
}