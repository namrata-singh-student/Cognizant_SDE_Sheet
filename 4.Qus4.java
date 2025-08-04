/*
Q-1 Ritik, a science enthusiast, wants to create a magic board for his school project. The magic board should display a sum for a corresponding character.

10

Help Ritik develop this application. Your task is to find the sum of ASCII values of the characters that are presents in string.

11

Assume A-65, B = 66 a = 97 b = 98 ......... z = 122 Z = 90

Jュー

Note: The string only contains alphabets

Input 1 ABCD

Output 266(65 + 66 + 67 + 68)

*/
import java.io.*;
import java.util.Scanner;
public class Qus1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int sum = 0 ;
		for(int i = 0; i< s.length(); i++) {
			sum += s.charAt(i);
		}
		System.out.print(sum);
	}

}


/*
We can do it like this also if output format is different


  public class Qus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int sum = 0;
        StringBuilder steps = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int ascii = s.charAt(i);
            sum += ascii;
            steps.append(ascii);
            if (i < s.length() - 1) {
                steps.append(" + ");
            }
        }

        System.out.println(sum + " (" + steps.toString() + ")");
    }
}
*/
