public class CaeserCypher {
    public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
        StringBuilder finalResult = new StringBuilder();
        key = key % 26;
        for (char c : str.toCharArray()) {
            int newChar = (int) c + key;
            if (newChar > 122) {
                newChar = newChar % 122 + 96;
            }
            finalResult.append((char)newChar);
        }

        return finalResult.toString();
    }
}
