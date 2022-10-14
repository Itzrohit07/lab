package lab;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//create a object
        while(sc.hasNext()){
            String IP = sc.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex {
    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = num + "." +  num + "." +  num + "." + num;


	}


