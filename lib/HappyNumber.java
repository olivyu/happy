package happy;

import java.util.ArrayList;
import java.util.Scanner;

public class HappyNumber {
	static Scanner input = new Scanner(System.in);
	static int test;

	public static void main(String[] args){
		System.out.println("Welcome to the Happy Number Test!");
		while (true){
			System.out.println("Please input a positive integer, or press (q) to quit:");
			String num = input.nextLine();
			if (num.equals("q")){
				return;
			}
			else{
				prompt(num);
			}
		}
		
	}
	
	private static void prompt(String num){
		try {
			test = Integer.parseInt(num); //valueOf(num).intValue();
		}
		catch (NumberFormatException e){
			System.out.println("Exception thrown  :" + e);
			System.out.println("That is not an integer!");
		}
		if (test < 0) {
			System.out.println("That is not positive!");
		}
		else{
			System.out.println(isHappy(test));
		}
	}
	
	private static String isHappy(int n){
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(n);
		return withList(n, intList);
	}

	private static String withList(int n, ArrayList intlist){
		if (n==1){
			return Integer.toString(n) + " - Happy";
		}
		else{
			int number = calculate_recur(n);
			if (intlist.contains(number)){
				return Integer.toString(n) + ", " + Integer.toString(number) + " - Not Happy";
			}
			else {
				intlist.add(number);
				return Integer.toString(n) + ", " + withList(number,intlist);
			}
		}
	}
	
	private static String isHappy_nonrecur(int n){
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(n);
		int next = calculate_recur(n);
		while (!intList.contains(next) && next != 1){
			intList.add(next);
			next = calculate_recur(next);
		}
		intList.add(next);
		String output = "";
		for (int i=0;i<intList.size();i++){
			output += Integer.toString(intList.get(i)) + ", ";
		}
		if (next==1){
			return output + "- Happy";
		}
		else{
			return output + "- Not Happy";
		}
	}
	
	private static int calculate(int n){
		int digit = 0;
		while (n > 0) {
		     digit += Math.pow(n%10,2);
		     n /= 10;
		 }
		return digit;
	}
	
	private static int calculate_recur(int n){
		if (n<1){
			return 0;
		}
		else {
			return (int) Math.pow(n%10,2) + calculate_recur(n/10);
		}
	}
}
