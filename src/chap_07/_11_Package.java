package chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지 (랜덤 클래스)
        // 하나의 프로젝트를 진행 할 때 서로 연관된 클래스 끼리 묶어 놓은 것을 package라 한다
        // package가 안적혀 있으면 에러가 발생함

        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt()); // int 의 범위 내에서 정수형 값 반환
        System.out.println("랜덤 정수 (범위) : " + random.nextInt(10)); // 0이상 10미만의 정수형 값
        System.out.println("랜덤 실수 : " + random.nextDouble()); // 0.0 이상 0.1 미만의 실수 값
        // System.out.println("랜덤 실수 (범위) : " + random.nextDouble(10.0)); // 이렇게 불가 ❌

        // 만약 5.0 이상 10.0 미만의 실수를 뽑으려면?
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (범위) : " + (min + (max - min ) * random.nextDouble()));
        System.out.println("랜덤 boolean : " + random.nextBoolean());
        
        // 로또 번호를 랜덤으로 뽑으려면? 1~45
        System.out.println("로또 번호 : " + (random.nextInt(45) + 1));
        // nextInt(45) : 0 이상 45 미만의 수
        // nextInt(45) + 1 : 1이상 46미만의 수 = 1 이상 45 이하의 수
        
        // Math, Scanner, StringBuilder, StringBuffer, StringTokenizer
        // BigInteger, BigDecimal
        // LocalDate, LocalTime, ... 다양한 클래스
    }
}
