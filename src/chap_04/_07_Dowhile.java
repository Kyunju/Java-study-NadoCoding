package chap_04;

public class _07_Dowhile {
    public static void main(String[] args) {
        // Do While 반복문
        int move = 0;
        int height = 25;
        int distance = 25;
        do {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착했습니다");
    }
}
