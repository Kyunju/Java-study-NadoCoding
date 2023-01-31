package chap_10;

import chap_10.converter.Convertible;
import chap_10.converter.KRWConverter;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
//        converter.convert(2);
//        convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원"),2);
        // 자바스크립트의 콜백함수 같은 느낌이군!
        Convertible convertible = (USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
        convertUSD(convertible, 2);
    }

    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);
    }
}

// 자바는 모든 기능이 클래스 내에서만 가능하기 때문에 메소드라 부르는데 다른 언어들 안에는 클래스 외부에서 동작 -> 함수
