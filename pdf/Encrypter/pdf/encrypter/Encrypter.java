package pdf.encrypter;
//handles input validation and encryption
public class Encrypter {
	public static String getEncryptedName(String name) {
		Validator val=new Validator();
		boolean flag=val.validate(name);
		if(flag) {
			StringBuilder sb=new StringBuilder(name);
			String mod=sb.reverse().toString().toLowerCase();
			return mod;
		}else {
			throw new IllegalArgumentException("Try again with valid name");
		}
		
	}

}
