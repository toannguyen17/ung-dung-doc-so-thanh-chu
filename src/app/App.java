package app;

import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {

		String[] hundred = {"one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};

		String[] teen = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		String[] ten  = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

		String[] unit = {"one", "two", "three", "four", "five", "six", "seven", "eigh", "nine"};

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number: ");
		// nhập vào số nguyên
		int numeric       = scanner.nextInt();
		// chuyển số nguyên thành chuỗi
		String charNumber = String.valueOf(numeric);
		System.out.println(charNumber);

		boolean isTen = false;
		String result = "";
		int length = charNumber.length();
		for (int i = 0; i < length; i++) {
			int last = length-i;
			int n    = Character.getNumericValue(charNumber.charAt(i));
			if(last == 3){
				result += hundred[n-1] + " ";
			} else if (last == 2) {
				if(n == 1){
					isTen = true;
				}else{
					result += teen[n - 1] + "-";
				}
			} else if (last == 1){
				if (isTen == true) {
					result += ten[n];
				}else{
					result += unit[n - 1];
				}
			}
		}
		System.out.println(result);
	}
}
