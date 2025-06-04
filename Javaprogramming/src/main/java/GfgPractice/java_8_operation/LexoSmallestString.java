package GfgPractice.java_8_operation;

public class LexoSmallestString {

        public static String getSmallestString(int n) {
            if (n <= 0)
                return "";

            // Start with all 'a' characters
            StringBuilder sb = new StringBuilder("a".repeat(n));

            // Calculate the sum of character values
            int sum = n; // Since 'a' = 1, initial sum is n * 1

            // If the sum is odd, change the last character to 'b' (value 2)
            if (sum % 2 != 0) {
                sb.setCharAt(n - 1, 'b');
            }

            return sb.toString();
        }

        public static void main(String[] args) {
            int n = 5;
            String result = getSmallestString(n);
            System.out.println(result); // Output: aaaab (sum = 6, divisible by 2)
        }
    }

