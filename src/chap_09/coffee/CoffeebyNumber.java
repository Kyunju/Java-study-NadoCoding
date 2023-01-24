package chap_09.coffee;

public class CoffeebyNumber {
    public int waitingNumber;

    public CoffeebyNumber(int waitingNumber) {
        this.waitingNumber = waitingNumber;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + waitingNumber);
    }
}
