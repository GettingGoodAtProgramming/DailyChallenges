/*
 * 9/28/2017
 * Generate a password with symbols and capital/lower case letters
 */
public class PasswordGenerator {
	
	
	public static String generatePassword(int passLength){
		String password = "";
		String possibleCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()";
		
		for (int i = 0; i < passLength; i++){
			password += possibleCharacters.charAt((int)(Math.random()*possibleCharacters.length()));
		}
		return password;
	}
	
	public static void main(String args[]){
		int passLength =15;
		int numberOfPasswords=10;
		
		for(int i = 0; i<numberOfPasswords; i++){
		System.out.println(generatePassword(passLength));
		}
	}

}
