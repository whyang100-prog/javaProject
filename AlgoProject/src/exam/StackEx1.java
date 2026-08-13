package exam;

import java.util.Scanner;
import java.util.Stack;

public class StackEx1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("수식 입력 : ");
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        boolean result = true;

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // 여는 괄호면 Stack에 저장
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // 닫는 괄호를 만났을 때
            else if(ch == ')' || ch == '}' || ch == ']') {

                // 닫을 괄호가 있는데 Stack이 비어있으면 잘못된 수식
                if(stack.empty()) {
                    result = false;
                    break;
                }

                // 가장 최근에 들어온 여는 괄호 꺼내기
                char open = stack.pop();

                // 서로 짝이 맞는지 검사
                if(ch == ')' && open != '(') {
                    result = false;
                    break;
                }

                if(ch == '}' && open != '{') {
                    result = false;
                    break;
                }

                if(ch == ']' && open != '[') {
                    result = false;
                    break;
                }
            }
        }

        // 여는 괄호가 Stack에 남아있으면 잘못된 수식
        if(!stack.empty()) {
            result = false;
        }

        System.out.println(result);

        sc.close();
    }
}