package List;


	/*
	Q1(b)(1): Write a Java program for getting different colors through 
	ArrayList interface and search whether the color "Red" is available or not.
	*/

	import java.util.*;

	public class SearchColor {
	    public static void main(String[] args) {

	        // Creating ArrayList
	        ArrayList<String> colors = new ArrayList<>();

	        // Adding elements
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");

	        // Searching for "Red"
	        if(colors.contains("Red")) {
	            System.out.println("Red color is available.");
	        } else {
	            System.out.println("Red color is not available.");
	        }
	    }
	}

