package chap_07.camera;

// SpeedCam is a Camera
public class SpeedCam extends Camera { // 자식크래스

    public SpeedCam() {
        super("과속단속카메라");
    }

    public void takePicture() {
        // 사진 촬영
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }
    
    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }
    
    public void recognizeLicensePlate() {
        // 번호인식
        System.out.println("번호를 인식합니다");
    }

    @Override // annotation : 컴파일러에게 부모클래스의 메소드를 오버라이팅 하고 있다고 알려줌 만약 부모에 메소드가 없으면 에러
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
    }
}
