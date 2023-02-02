package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림 : 흐르다, 데이터가 흐르다
        // 아주 많은 데이터에서 원하는 조건에 따라서 1,2,3 .. 차 필터링을 할 수 있음
        // 데이터에서 필요한 요소만 가져올 수 있음
        // 데이터 가공이 편리해짐

        // 스트림 생성
        // 배열 Arrays.stream
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);

        // 문자열
        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String> langStream = Arrays.stream(langs);

        // 리스트 Collection.stream()
        List<String> langList = new ArrayList<>();
        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#"); // 리스트를 만들면서 한번에 리스트를 추가할 수 있음
        System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();

        // Stream 객체 Stream.of
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");
        System.out.println("--------------------------------");
        // 스트림 사용
        // 중간 연산 (Intermediate Operation) : filter, map, sorted, distinct, skip, ...
        // 최종 연산 (Terminal Operation) : count, min, max, sum, forEach, anyMatch, allMatch, ...

        // 90 점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
        // Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
        System.out.println("--------------------------------");

        // 90 점 이상인 사람의 수
        int count = (int) Arrays.stream(scores).filter(x -> x >= 90).count(); // 원래 자료형은 long
        System.out.println(count);
        System.out.println("--------------------------------");

        // 90 점 이상인 점수들의 합
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("--------------------------------");

        // 90 점 이상인 점수들을 정렬
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println("--------------------------------");
    }
}
