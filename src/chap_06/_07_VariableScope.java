package chap_06;

public class _07_VariableScope {
    public static void methodA() {
//        System.out.println(number);
    }

    public static void main(String[] args) {
        // main method 안에서 선언된 변수는 여기서만 쓸 수 있음
        int number = 3; // 지역변수

    }
}
