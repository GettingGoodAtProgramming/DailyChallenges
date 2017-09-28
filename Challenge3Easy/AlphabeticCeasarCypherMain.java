/*
 * 9/28/2017
 * Encrypt a message using the Ceasar Cypher.
 * The Ceasar Cypher will represent each letter with a letter 3 letters after it in the alphabet.
 * For example, ABCD will be encrypted to DEFG.
 * XYZABDC will be encrypted to ABCDEF
 * This program also decrypts messages.
 */
import java.util.Scanner;
public class AlphabeticCeasarCypherMain {
	
	public static char encryptChar(char c){
		//shift 3 alphabets
		c+=3;
		
		//loop back to beginning of alphabet if passing Z
		if((c>90 && c<97) || (c>122)){
			c-=26;
		}//if
		
		return c;
	}//encryptChar
	
	public static char decryptChar(char c){
		//shift 3 alphabets
		c-=3;
		
		//loop back to beginning of alphabet if passing Z
		if(((c>90 && c<97) || (c<65))&& c!=32){
			c+=26;
		}//if
		
		return c;
	}//decryptChar
	
	public static String encrypt(String encryptMe){
		String encryptedMessage = "";
		
		for(int i=0; i<encryptMe.length(); i++){
			char hold = encryptChar(encryptMe.charAt(i));
			encryptedMessage += Character.toString(hold);
		}//for
		
		return encryptedMessage;
		
	}//encrypt
	
	public static String decrypt(String encryptMe){
		String encryptedMessage = "";
		
		for(int i=0; i<encryptMe.length(); i++){
			char hold = decryptChar(encryptMe.charAt(i));
			encryptedMessage += Character.toString(hold);
		}//for
		
		return encryptedMessage;
		
	}//decrypt
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the message you want encrypted");
		String message = sc.nextLine();
		System.out.println(encrypt(message));
		System.out.println(decrypt(encrypt(message)));
		
	}//main

}//AlphabeticCeasarCypherMain
