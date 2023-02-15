package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
    // 쓰레드 ( 프로세스의 자원을 이용해서 실제로 작업하는 것)
    // 프로세스 (프로그램 실행되어 돌아가는 상태)
    // 프로세스는 여러개의 쓰레드를 가질 수 있다
    // 기본적으로는 하나의 쓰레드

    public static void main(String[] args) {

        // 호텔방
        // 1 3 5 7 9 - 사장
        // 2 4 6 8 10 - 직원
        // cleanBySelf();

        CleanThread cleanThread = new CleanThread();
        //cleanThread.run(); // 직원 청소 - 직접 호출하면 Thread로 되지 않음
        cleanThread.start();

        cleanByBoss(); // 사장 청소
    }
    
    public static void cleanBySelf() {
        System.out.println("-- 혼자 청소 시작 --");
        for (int i = 1; i <= 10; i++) {
            System.out.println("(혼자) " + i + "번방 청소 중");
        }
        System.out.println("-- 청소 끝 --");
    }
    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("(사장) " + i + "번방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
