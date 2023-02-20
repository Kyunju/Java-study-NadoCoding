package chap_12;

import chap_12.clean.Room;

public class _05_Synchronization {
    public static void main(String[] args) {
        // 순서대로 번갈아 가며 일하게 하고 싶을 때
        // 같은 변수에 2개의 쓰레드가 접근해서 작업 할 때
        // 동기화가 필요함

        Room room = new Room();
        Runnable cleaner1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("-- (직원1) 청소 시작 (Thread) --");
                for (int i = 1; i <= 5; i++) {
                    room.clean("직원1");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    if (i == 2) {
                        throw new RuntimeException("못해 먹겠다 !");
                    }
                }
                System.out.println("-- (직원1) 청소 끝 (Thread) --");
            }
        };

        Runnable cleaner2 = () -> {
            System.out.println("-- (직원2) 청소 시작 (Thread) --");
            for (int i = 1; i <= 5; i++) {
                room.clean("직원2");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("-- (직원2) 청소 끝 (Thread) --");
        };

        Thread cleanerThread1 = new Thread(cleaner1);
        Thread cleanerThread2 = new Thread(cleaner2);

        cleanerThread1.start();
        cleanerThread2.start();
    }
}
