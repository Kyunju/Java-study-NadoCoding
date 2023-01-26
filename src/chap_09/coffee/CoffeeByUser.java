package chap_09.coffee;

import chap_09.user.User;
// 어떤 형태의 타입을 써도 상관 없지만 User 클래스를 상속하는 T를 써야한다는 의미이다.
// 다른 객체는 받을 수 없음
public class CoffeeByUser <T extends User>{
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }
}
