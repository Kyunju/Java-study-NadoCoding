package chap_07.camera;

// 상속 할 수 없는 클래스가 됨
public final class ActionCam extends Camera{
    public final String lens = "광각렌즈";
    public ActionCam() {
        super("액션 카메라");
    }
    
//    public final void makeVideo() {
//        System.out.println(this.name + " : " + this.lens + " : 멋진 비디오를 제작합니다");
//    }
    // final로 인해 오버라이딩 할 수 없음
}
