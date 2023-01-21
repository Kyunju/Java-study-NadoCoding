package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 주차 요금 정산 프로그램
        // 내가 한것
        int parkingFeeFerHour = 4000;
        int MAX_FEE = 30000;
        String isWhoCar = "장애인";
        int parkingHour = 10;
        
        int currentFee = 0;
        for (int i = 0; i < parkingHour; i++) {
            currentFee += parkingFeeFerHour;
            
            if (currentFee >= MAX_FEE) {
                currentFee = MAX_FEE;
                break;
            }
        }
        switch (isWhoCar) {
            case "경차":
            case "장애인":
                System.out.println(isWhoCar + " 차량 " + parkingHour + "시간" + " 주차 시 " + currentFee / 2 + " 원");
                break;
            default:
                System.out.println(isWhoCar + " 차량" + parkingHour + "시간" + " 주차 시 " + currentFee + " 원");
        }

        // 솔루션
        int hour = 5;
        boolean isSmallCar = false;
        boolean withDisabledPeople = false;
        int fee = hour * 4000;
        if (fee > 30000) {
            fee = 30000;
        }

        if (isSmallCar || withDisabledPeople) {
            fee = fee / 2;
        }
        System.out.println("주차 요금은 " + fee + " 원입니다");
    }
}
