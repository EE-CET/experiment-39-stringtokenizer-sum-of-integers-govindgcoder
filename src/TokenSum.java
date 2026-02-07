import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        // Read the entire line of integers
        // Create a StringTokenizer object for the line
        StringTokenizer st = new StringTokenizer(S);
        // Iterate through tokens (hasMoreTokens)
        int sum = 0;
        while(st.hasMoreTokens()){
        // Parse each token to int and add to sum
            sum+=Integer.parseInt(st.nextToken());
        }
        // TODO: Print the sum
        System.out.print(sum);
    }
}
