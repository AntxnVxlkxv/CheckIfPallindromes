
public class CaesarCipher {
	public static StringBuffer crypt(String text, int s) {
		StringBuffer k = new StringBuffer();
		for (int i = 0; i < text.length(); i++) {
			if (Character.isUpperCase(text.charAt(i))) {
				char ch = (char) (((int) text.charAt(i) + s - 65) % 26 + 65);
				k.append(ch);
			} else {
				char ch = (char) (((int) text.charAt(i) + s - 97) % 26 + 97);
				k.append(ch);
			}
		}
		return k;
	}
}
