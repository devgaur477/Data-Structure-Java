package sortings;

public class CaesarEncryption {
	
	public static final int ALPHANUM = 26;
	public static final char alpha[] = {'A' ,'B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
						char encrypt[] = new char[ALPHANUM];
						char decrypt[] = new char[ALPHANUM];
						
					public CaesarEncryption() {
						for(int i=0;i<23;i++) {
							encrypt[i] = alpha[i+3 % ALPHANUM];
						}
						for(int i=0;i<23;i++) {
							decrypt[encrypt[i] - 'A'] = alpha[i];
						}
					}
					
					
				public String encrypt(String secret) {
					
					char [] mess = secret.toCharArray();
					
					for(int i=0 ; i<mess.length;i++) {
						if(Character.isUpperCase(mess[i])) {
							mess[i] = encrypt[mess[i] - 'A'];
						}
					}
					
					return new String(mess);
				}
				
				
				public String decrypt(String secret) {
					char [] mess = secret.toCharArray();
					
					for(int i=0;i<mess.length;i++) {
						if(Character.isUpperCase(mess[i])) {
							mess[i] = decrypt[mess[i] - 'A'];
						}
					}
					
					return new String(mess);
				}
						
						
	public static void main(String[] args) {
		
			CaesarEncryption obj = new CaesarEncryption();
			
			System.out.println(""+new String(obj.encrypt));
			System.out.println(""+ new String(obj.decrypt));
			
			String secret = "HI I AM DEV"; 
			secret = obj.encrypt(secret);
			System.out.println(secret);
			secret = obj.decrypt(secret);
			System.out.println(secret);
			
		
		
		

	}

}
