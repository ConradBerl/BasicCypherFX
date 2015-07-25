package application;

public class Cypher {

	//the letter to encode
	private static char[] input = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
	
	//the association, encrypted
	private static char[] output = "BCDEFGHIJKLMNOPQRSTUVWXYZAbcdefghijklmnopqrstuvwxyza1234567890".toCharArray();
	
	
	public static String encrypt(String s) {
		
		char[] temp = new char[s.length()];
		
		for (int i=0; i<s.length(); i++){
			
			boolean forEncrypt = false;
			
			//if a char in the original message matches a char from input
			//convert that char to the output equivalent.
			for (int j=0; j<input.length; j++){
				if (s.charAt(i) == input[j]){
					temp[i] = output[j];
					forEncrypt = true;
					break;
				}
			}
			
			if (forEncrypt == false){
			//if no char from input is equivalent,
			//simply copy the original value
			temp[i] = s.charAt(i);
			}
			
		}
		
		String encryptedMsg = new String(temp);	
			
		return encryptedMsg;
	}
	
	
	public static String decrypt(String s) {
		
		char[] temp = new char[s.length()];
		
		for (int i=0; i<s.length(); i++){
			
			boolean forEncrypt = false;
			
			//if a char in the original message matches a char from input
			//convert that char to the output equivalent.
			for (int j=0; j<input.length; j++){
				if (s.charAt(i) == output[j]){
					temp[i] = input[j];
					forEncrypt = true;
					break;
				}
			}
			
			if (forEncrypt == false){
			//if no char from input is equivalent,
			//simply copy the original value
			temp[i] = s.charAt(i);
			}
			
		}
		
		String encryptedMsg = new String(temp);	
			
		return encryptedMsg;
	}
		
}
