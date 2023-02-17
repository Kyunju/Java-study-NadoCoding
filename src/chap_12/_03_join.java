package chap_12;

import chap_12.clean.CleanRunnable;

public class _03_join {
    public static void main(String[] args) {
        // join 의 역할은 join의 Thread를 끝내고 다음줄로 넘어감
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        try {
            thread.join(2500); // 최대 2.5초 대기 완료되지 않으면 바로 다음줄로 넘어감
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        cleanByBoss();
    }
    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("(사장) " + i + "번방 청소 중");
            try {
                Thread.sleep(1000); // 1초 동안 멈추는 것
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
