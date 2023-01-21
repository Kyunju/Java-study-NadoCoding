package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(4 % 2);

        // 증감 연산자
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10 val 라는 값을 가지고 문장에 먼저 출력을 한 후에  val 1을 더해주는 것
        System.out.println(val); // 11

        System.out.println(++val); // val에 먼저 연산을 하고  val 값을 프린트함
        System.out.println(val);

        // 은행 대기표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기인원 0
        System.out.println("대기 인원 : " + waiting++);// 대기인원 1
        System.out.println("대기 인원 : " + waiting++);// 대기인원 2
        System.out.println("총 대기 인원 : " + waiting);// 대기인원 3
    }
}
