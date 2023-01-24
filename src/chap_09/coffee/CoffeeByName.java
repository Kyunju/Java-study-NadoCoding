package chap_09.coffee;

public class CoffeeByName {
    // Object로 만듦
    public Object name;

    public CoffeeByName(Object name) {
        this.name = name;
    }
    
    public void ready() {
        System.out.println("커피 준비 완료 : " + name);
    }
}
