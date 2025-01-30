package lesson12.homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        //checkAbbreviation();
        System.out.println("----------------------------------");
        checkDocument();
    }

    public static void checkAbbreviation() {
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Please, enter abbreviation(example:BSUIR):");
        String[] abbreviation = input.nextLine().split(" ");
        for (String string : abbreviation) {
            Pattern p = Pattern.compile("^[A-Z]{2,6}$");
            Matcher m = p.matcher(string);
            if (m.matches()) {
                System.out.println(m.group());
                flag = true;
            }
        }
        if(!flag){
            System.out.println("No correct abbreviation");
        }
    }
    public static void checkDocument(){
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Please enter text(document number format:'xxxx-xxxx-xx', phone number format:" +
                "'+(xx)xxxxxxx', Email example:'maxim@gmail.com'");
        String[] document = input.nextLine().split(" ");
        for(String string: document){
            Pattern p1= Pattern.compile("\\d{4}-\\d{4}-\\d{2}");
            Pattern p2=Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");
            Pattern p3=Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$");
            Matcher m1= p1.matcher(string);
            Matcher m2= p2.matcher(string);
            Matcher m3= p3.matcher(string);
            if(m1.matches()) {
                System.out.println("1. Document number: " + m1.group());
                flag = true;
            }
            if(m2.matches()) {
                System.out.println("2. Phone number: " + m2.group());
                flag=true;
            }
            if(m3.matches()) {
                System.out.println("3. Email: " + m3.group());
                flag=true;
            }
        }
        if(!flag){
            System.out.println("No correct information about document(document number, phone number, email)");
        }
    }
}

