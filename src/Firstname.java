import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Firstname {
        public static void main(String[] args){
            System.out.println("Enter your first name with first letter in capital");
            Scanner myinput = new Scanner(System.in);
            String fname = myinput.nextLine();
            Pattern p = Pattern.compile(("[A-Z]{1}[a-z]{2,}$"));
            Matcher m = p.matcher(fname);
            boolean b = m.matches();
            System.out.println(b);
        }
    }

