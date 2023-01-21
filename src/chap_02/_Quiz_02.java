package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 내가 한 것
        final int LIMITS = 120;
        int a_child = 115;
        int b_child = 121;
        System.out.println("키가 " + a_child + "cm 이므로 탑승 " + ((a_child > LIMITS) ? "가능" : "불가능") + "합니다");
        System.out.println("키가 " + b_child + "cm 이므로 탑승 " + ((b_child > LIMITS) ? "가능" : "불가능") + "합니다");

        // 해설 솔루션
        int height = 115;
        String result = (height >= 120 ) ? "탑승 가능합니다" : "탑승 불가능합니다";
        System.out.println("키가 " + height + "cm 이므로 " + result);
    }
}
