package chap_06;

public class _05_Overloading {
    public static int getPower(int number) { // "4"
        int result = number * number;
        return result;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }
    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩 // 이름은 똑같지만 전달값이 다른 메소드를 찾아 실행
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
    }
}
