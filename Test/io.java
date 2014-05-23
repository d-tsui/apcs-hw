import java.io.*;
import java.util.Scanner;

public class io {
    public static void main(String[] args){
    
    File file = new File("test.out");
    try {
        Scanner sc = new Scanner(file);
        //while(sc.hasNextInt()) {
        while (sc.hasNextLine()) {
            //int i = sc.nextInt();
            String s = sc.nextLine();
            System.out.println(s);
        }
        sc.close();
    } 
    catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    
    String input = new String();
    try {
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        sc.close();
    } 
    catch (Exception e) {
        e.printStackTrace();
    }
    
    
    
	PrintWriter out=null;
	try {
	    out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
	} catch (Exception e){};
		out.println ("You typed:");
	    out.println (input);
	    out.close ();
    }
	

}
