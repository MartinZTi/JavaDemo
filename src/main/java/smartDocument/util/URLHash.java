package smartDocument.util;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Arrays;

import org.apache.log4j.Logger;
import org.junit.Test;

public class URLHash {

	static Logger logger = Logger.getLogger(URLHash.class);

	public static String genSecretHashKey() {
		SecureRandom random = new SecureRandom();
		byte[] salt = new byte[32];
		logger.info(Arrays.toString(salt));
		random.nextBytes(salt);

		logger.info(Arrays.toString(salt));
		return toHex(salt);
	}
	
	private static String toHex(byte[] array) {
		BigInteger bi = new BigInteger(array);
		String hex = bi.toString(16);
		int paddingLength = array.length*2 - hex.length();
		if(paddingLength > 0) {
			return String.format("%0"+paddingLength + "d", new Object[] {Integer.valueOf(0)}+hex);
		}
		return hex;
	}	
	
	@Test
	public void test1() {
		String genSecretHashKey = URLHash.genSecretHashKey();
		System.out.println(genSecretHashKey);
	}
	

	
}
