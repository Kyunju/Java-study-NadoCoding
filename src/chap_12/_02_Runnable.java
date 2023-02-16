package chap_12;

import chap_12.clean.CleanRunnable;

public class _02_Runnable {
    public static void main(String[] args) {
        // Runnable은 인터페이스이기 때문에 다른 부모 클래스를 상속해서
        // 클래스를 만들 수 있음
        // Thread는 Thread를 부모 클래스로 상속하기 때문에 단일 상속으로
        // 부모 클래스를 다른 것을 상속해야 한다면 Runnable 사용
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();
        cleanByBoss();
    }

    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("(사장) " + i + "번방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
