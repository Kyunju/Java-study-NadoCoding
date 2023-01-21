package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        // 내가 스스로 푼 퀴즈
        String busNumber = "상암08";
        int minutes = 3;
        String leftMinutes = Integer.toString(minutes) + "분";
        double distance = 1.2;
        String leftDistance = Double.toString(distance) + "km";

        System.out.println(busNumber + " 버스");
        System.out.println("약 " + leftMinutes + " 후 도착");
        System.out.println("남은 거리 " + leftDistance);

        // 해설
        // 버스 번호 (1234, 상암 08)
        String busNo = "상암08";

        // 남은 시간 (3분, 5분)
        int minute = 3;

        // 남은 거리 (1.5km, 0.8km)
        double distance_a = 1.2;

        // 결과출력
        System.out.println(busNo + "번 버스");
        System.out.println("약 " + minute + "분 후 도착");
        System.out.println("남은 거리 " + distance_a + "km");
    }
}
