package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        // 나코 매장
        for (int i = 0; i < 10; i++) {
            System.out.println("어서오세요. 나코입니다. " + i);
        }

        // 짝수만 추력 (fori 만 적고 엔터)
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }
        System.out.println();
        // 홀수만 출력
        // 1, 3, 5, 7, 9
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }

        System.out.println();
        // 1부터 10까지의 수들의 합
        // 1 + 2 + .... + 10 = 55
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println(sum);
        }
    }
}
