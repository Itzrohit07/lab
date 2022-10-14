package lab;

public class LowerCaseLetter {

	public static void main(String[] args) {
		 System.out.println(used("java_exercises"));
			System.out.println(used("Java_exercises"));
			System.out.println(used("java_Exercises"));		
			System.out.println(used("Java_Exercises"));	
	        }

	   public static String used(String text) {
		   if (text.matches("^[a-z]+_[a-z]+"))
	                return "Found a match!";
	       else
	                return " found Not a match!";
	   
	      
	   }
	}

	


