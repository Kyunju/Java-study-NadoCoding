package chap_09;

import chap_09.coffee.CoffeeByName;
import chap_09.coffee.CoffeeByNickname;
import chap_09.coffee.CoffeebyNumber;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeebyNumber c1 = new CoffeebyNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println("-------------------------");

        // 상태값을 오브젝트로 만들었을 때 정수나 문자열이 다 가능한 것 처럼 보이나 문제가 있음
        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println("-------------------------");
        int c3Name = (int) c3.name; // 형번환을 통해서 넣을 수 있음
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);
        
        //c4Name = (String) c3.name; // 코드를 실행해보지 않고는 에러를 볼 수가 없음
    }
}
