import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class Lastname {
        public static void main(String[] args){
            isvalidfirstname();
            isvalidlastname();
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
        }}


