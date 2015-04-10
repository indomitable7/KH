package step4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static String getString(){
		Scanner scan = new Scanner(System.in);
		System.out.println("입력한 단어 첫글자 대문자로 바꿔줄게");
		String str = scan.nextLine();
		return str;
	}
	public static void capital(String s){
		System.out.print("Capitalize :");
		StringTokenizer strTok = new StringTokenizer(s);
		while(strTok.hasMoreTokens()){
			String write = strTok.nextToken();
			System.out.print(" "+write.substring(0,1).toUpperCase()+write.substring(1));
		}
	}
	
	public static void main(String[] args) {
		capital(getString());
	}

}
