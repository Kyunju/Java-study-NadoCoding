package chap_07;

public class BlackBox {
    String modelName;
    String resolution;
    int price;
    String color;
    static boolean canAutoReport = false; // 자동신고기능 // static : 클래스 변수 모든 인스턴스 객체가 가지고 있는 값이 됨
    int serialNumber;// 시리얼 번호
    static int counter = 0;
    BlackBox() {
        System.out.println("기본 생성자 호출");
        this.serialNumber = ++counter;
        System.out.println("새로운 시리얼 넘버를 발급 받았습니다 : " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color){
        this(); // 기본 생성자 호출
        
        System.out.println("사용자 정의 생성자 호출");
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;
    }
    
    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) { // 일반영상
            return 9;
        }
        if (type == 2) { // 이벤트 영상
            return 2;
        }
        return 10;
    }

    // shoDateTime : 날짜 정보 표시 여부
    // showSpeed : 속도 정보 표시 여부
    // min : 영상 기록 단위 (분)
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다");
        if(showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record(){
        record(true,true,5);
    }

    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-0000) 로 연결합니다.");
//        modelName = "test";
        canAutoReport = false;
    }

    void appendModelName(String modelName) {
        this.modelName += modelName;
    }

    // Getter & Setter
    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        } else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
