package chap_07.camera;

// FactoryCam is a Camera (IS-A) 관계
public class FactoryCam extends Camera { // 자식 클래스
    public FactoryCam() {
//        this.name = "공장 카메라";
        super("공장카메라"); // 부모클래스의 생성자에 바로 접근
    }


    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
    }
}
