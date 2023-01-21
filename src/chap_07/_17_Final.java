package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

public class _17_Final {

    public static void main(String[] args) {
        // Final : 어디에서도 변수, 메소드 값을 바꿀 수 없다.
        // public > abstract > static > final > ...

        ActionCam actionCam = new ActionCam();
//        actionCam.lens = "표준렌즈"; final로 변수 값이 고정되어 있어 바꿀 수 없음
        actionCam.recordVideo();


        System.out.println("------------------------");

        SlowActionCam slowActionCam = new SlowActionCam();

        slowActionCam.makeVideo();
    }

}
