package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 자료형의 값 여러개를 저장하는 연속된 곻간

        // 배열 선언 첫 번째 방법
        String[] coffees = new String[4]; // 크기 4에 해당하는 배열
        String coffee_a[] = new String[4]; // 똑같은 방법
        coffees[0] = "아메리카노";
        coffees[1] = "카페모카";
        coffees[2] = "카페라떼";
        coffees[3] = "카푸치노";

        // 세번재 방법
        String [] coffee_b = new String[] { "아메리카노", "카페모카", "라떼", "카푸치노"};

        // 네번째 방법
        String [] coffees_c = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        System.out.println(coffees_c[0] + " 하나");
        System.out.println(coffees_c[1] + " 하나");
        // 값 변경
        coffees_c[2] = "에스프레소";
        System.out.println(coffees_c[2] + " 하나");
        System.out.println(coffees_c[3] + " 하나");

        // 다른 자료형?
        int[] i = new int[3];
        double[] d = new double[] {3.1, 3.2, 3.3};
        boolean[] b = {true, false, true};
    }
}
