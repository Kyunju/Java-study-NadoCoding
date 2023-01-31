package chap_10.converter;

@FunctionalInterface
public interface Convertible {
    // 위에 annotation을 붙여주면 다른 메소드를 정의 못함 이 인터페이스는 함수형 인터페이스다라고 알려줌
    void convert(int USD);
}
