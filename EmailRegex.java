import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {
     public static void main(String[] args){
           /*method for first name
           using regex*/
            isvalidfirstname();
           /*method for last name
           using regex*/
            isvalidlastname();
           /*method for valid email id
            input by user*/
            isvalidemail();
     }
     public static void isvalidfirstname(){
            System.out.println("Enter your first name with first letter in capital");
            Scanner myinput = new Scanner(System.in);
            String fname = myinput.nextLine();
            Pattern p = Pattern.compile(("^[A-Z]{1}[a-z]{2,}$"));
            Matcher m = p.matcher(fname);
            boolean b = m.matches();
            System.out.println(b);
            if(!b){
            isvalidfirstname();
            }

     }
     public static void isvalidlastname(){
            System.out.println("Enter your last name");
            Scanner input = new Scanner(System.in);
            String lname = input.nextLine();
            Pattern pat = Pattern.compile(("^[A-Z]{1}[a-z]{2,}$"));
            Matcher mat = pat.matcher(lname);
            boolean c = mat.matches();
            if(!c){
                   isvalidlastname();
            }
       }
     public static void isvalidemail(){
            System.out.println("Enter your email id");
            Scanner inputemail = new Scanner(System.in);
            String email = inputemail.nextLine();
            Pattern patemail = Pattern.compile(("^[A-Za-z0-9+-._]{0,}@[A-Za-z0-9+-._]{0,}[.][com|in]{2,3}$"));
            Matcher matemail = patemail.matcher(email);
            boolean d = matemail.matches();
            System.out.println(d);
            if (d==true){
                   System.out.println("email id is valid");
            }else {
                   System.out.println("email id is not valid");
            }

       }
}



