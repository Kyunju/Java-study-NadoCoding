package chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String information, int startIndex ) {
        String publicInfo = information.substring(0,startIndex);
        String hideInfo = "";

        for (int i = startIndex; i < information.length(); i++) {
            hideInfo += "*";
        }
        return publicInfo.concat(hideInfo);
    }

    public static void main(String[] args) {
        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}
