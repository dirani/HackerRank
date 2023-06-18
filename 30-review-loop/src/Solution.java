import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Read the number of test cases
        int t = Integer.parseInt(reader.readLine());

        // Iterate over each test case
        for (int i = 0; i < t; i++) {
            // Read the string
            String s = reader.readLine();

            // Initialize even and odd strings
            StringBuilder evenChars = new StringBuilder();
            StringBuilder oddChars = new StringBuilder();

            // Iterate over each character and update evenChars and oddChars
            for (int j = 0; j < s.length(); j++) {
                if  (j % 2 == 0) {
                     evenChars.append(s.charAt(j));
                } else {
                    oddChars.append(s.charAt(j));
                }
            }

            // Print the even and odd strings separated by a space
            System.out.println(evenChars.toString() + " " + oddChars.toString());
        }
 
        reader.close();

    }
}