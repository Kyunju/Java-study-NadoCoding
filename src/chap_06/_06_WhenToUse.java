package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number) { // "4"
        return getPower(number, 2);
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드 필요한 이유

        // 유지보수와 긴 코드의 중복을 줄여줌
        // 메소드 내에서 오버라이딩된 메소드를 또 호출할 수 있음

        System.out.println(getPower(2));
        System.out.println(getPower(2,4));
    }
}
