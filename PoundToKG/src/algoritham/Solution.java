package algoritham;

import java.util.*;

class Solution {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();
			System.out.println(isBalanced(input));
		}

	}

	public static boolean isBalanced(String value) {

        char holders = 0;
        Stack<Character> values = new Stack<>();
        for (int i = 0; i < value.length(); i++) {

            holders = value.charAt(i);
            if (holders == '{' || holders == '[' || holders == '(') {

                values.push(holders);
                continue;
            }

            if (values.isEmpty()) {

                return false;
            }

            switch (holders) {

            case '}':
                char temp = values.pop();
                if (temp == '[' || temp == '(') {

                    return false;

                }
                break;
            case ']':
                temp = values.pop();
                if (temp == '{' || temp == '(') {

                    return false;

                }
                break;

            case ')':
                temp = values.pop();
                if (temp == '{' || temp == '[') {

                    return false;

                }
                break;
            }

        }
        if (values.isEmpty()) {
            return true;
        } else {
            return false;
        }
    
}
}
