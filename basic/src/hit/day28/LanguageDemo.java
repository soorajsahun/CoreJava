package hit.day28;

import java.util.Locale;
import java.util.ResourceBundle;

public final class LanguageDemo {
	public static void main(String[] args) {
		Locale locale=Locale.getDefault();
		System.out.println(locale);
		
//		Locale.setDefault(new Locale("ta"));
//		System.out.println(Locale.getDefault());
		
//		ResourceBundle rb=ResourceBundle.getBundle("mydictionary", Locale.getDefault());
		
		ResourceBundle rb=ResourceBundle.getBundle("mydictionary", new Locale("ta"));

		System.out.println(rb.getString("hello"));
	}
}
