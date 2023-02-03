package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _Quiz_10 {
    public static void main(String[] args) {
        Customer c1 = new Customer("챈들러", 50);
        Customer c2 = new Customer("레이첼", 42);
        Customer c3 = new Customer("모니카", 21);
        Customer c4 = new Customer("벤자민", 18);
        Customer c5 = new Customer("제임스", 5);
        int entranceFee = 5000;
        int freeLimitAge = 20; // 이하

        List<Customer> customerList = new ArrayList<>();
        customerList = Arrays.asList(c1,c2,c3,c4,c5);

        System.out.println("미술관 입장료");
        System.out.println("-----------------");
        customerList.stream()
                .map(x -> x.age >= freeLimitAge ?
                        x.name + " " + entranceFee + "원" :
                        x.name + " " + "무료")
                .forEach(System.out::println);
    }


}

class Customer {
    String name;
    int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}