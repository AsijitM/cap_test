package pdf.encrypter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		  try {
	            String encryptedName = Encrypter.getEncryptedName("Asmita");
	            System.out.println("Encrypted Name: " + encryptedName);
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
        
	}



}
