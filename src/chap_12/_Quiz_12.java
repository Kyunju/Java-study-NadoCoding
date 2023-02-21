package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {
        // 상품 A와 상품 B로 이루어진 세트 상품을 효율적으로 포장하는 프로그램을 작성하시오

        // 상품 A와 상품 B는 각각 5개씩 준비
        // 상품 A와 상품 B는 두 사람이 독립적으로 준비
        // 상품 A와 상품 B가 모두 준비된 이후 세트 상품 포장 시작
        // 포장이 필요한 세트 상품은 총 5개

        // A 상품 준비 쓰레드
        Runnable pakager1 = () -> {
            for (int i = 1; i <= 5; i ++) {
                System.out.println("A 상품 준비 " + i + "/5");
            }
            System.out.println("-- A 상품 준비 완료 --");
        };
        // B 상품 준비 쓰레드
        Runnable pakager2 = () -> {
            for (int i = 1; i <= 5; i ++) {
                System.out.println("B 상품 준비 " + i + "/5");
            }
            System.out.println("-- B 상품 준비 완료 --");
        };

        //Thread 실행
        Thread threadPakager1 = new Thread(pakager1);
        Thread threadPakager2 = new Thread(pakager2);
        threadPakager1.start();
        threadPakager2.start();

        // 해당 Thread가 끝날 때까지 기다림 Thread.join()
        try {
            threadPakager1.join();
            threadPakager2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // join 말고 다른 방법으로 Thread 끝날때까지 기다리기

//        while (threadPakager1.isAlive() || threadPakager2.isAlive()) {
//
//        }

        // 세트 상품 포장
        setPakager();
    }

    synchronized static void setPakager() {
        System.out.println("== 세트 상품 포장 시작 ==");
        for (int i = 1; i <= 5; i++) {
            System.out.println("세트 상품 포장 " + i + "/5");
        }
        System.out.println("== 세트 상품 포장 완료 ==");
    }
}
