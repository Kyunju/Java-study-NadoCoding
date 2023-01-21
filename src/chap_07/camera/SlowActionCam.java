package chap_07.camera;

public class SlowActionCam{
    public String name;
    public String lens;
    public SlowActionCam() {
        this.name = "슬로우 액션 카메라";
        this.lens = "망원렌즈";
    }

    public void makeVideo() {
        System.out.println(this.name + " : " + this.lens + " : 멋진 슬로우 모드 비디오를 제작합니다");
    }
}
