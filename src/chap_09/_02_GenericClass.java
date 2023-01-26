package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VIPUser;

import javax.jws.soap.SOAPBinding;

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

        System.out.println("-------------------------");

        // Generic Class
        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);

        System.out.println("-------------------------");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("서장훈"));
        c8.ready();
        
//        CoffeeByUser<User> c9 = new CoffeeByUser<>(new BlackBox());
        // 만들 수 없음 상속하는 클래스가 아니기 때문에

        System.out.println("-------------------------");
        orderCoffee("김영철");
        orderCoffee(36);
        
        orderCoffee("김희철","아메리카노");
        orderCoffee(37,"카페라떼");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }
    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}

class BlackBox {
    
}