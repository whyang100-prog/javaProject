package ramda.oneparamnoreturn;

public class FunctionalEx {
// 함수형 인터페이스 구현 객체 구성(람다식)
    public static void main(String[] args) {
//매게변수가 있고 반환문 없는 람다식,실행문장 2문장 이상
        MyFunctingInterface fi;

        fi = (int x) -> {
            int res = x * 5;
            System.out.println(res);
        };

        fi.method(5);

        fi = (x) -> {
            System.out.println(res);
        };

        fi.method(5);

        // 실행문이 한 줄이면 중괄호 생략 가능
        fi = x -> System.out.println(x*5);

        fi.method(5);
    }
}