import java.util.Scanner;

public class DFA01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter binary string (or 'exit' to quit): ");
            System.out.print("Input: ");
            String s = sc.nextLine().trim();

            if (s.equalsIgnoreCase("exit")) break;

            if (!s.matches("[01]+")) {
                System.out.println("Invalid input. Only 0 and 1 allowed.\n");
                continue;
            }

            int state = 0; // q0 = 0, q1 = 1, q2 = 2 (accept)

            for (char ch : s.toCharArray()) {
                switch (state) {
                    case 0: state = (ch == '0') ? 1 : 0; break;
                    case 1: state = (ch == '0') ? 1 : 2; break;
                    case 2: state = (ch == '0') ? 1 : 0; break;
                }
            }
            
            System.out.print("Output: ");
            System.out.println(state == 2 ? "Accepted\n" : "Rejected\n");
        }
        sc.close();
    }
}
