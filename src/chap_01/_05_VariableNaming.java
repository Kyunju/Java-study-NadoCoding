package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄, 문자, 숫자 사용 가능 (공백 사용 불가)
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 두개 이상의 단어 각 단어의 시작 글자는 대문자
        // 6. 예약어 사용 불가 ( public, static, int, void, double ...)

        // 입국 신고서 (여행)
        String nationality = "대한민국";
        String firstName = "경주";
        String lastName = "이";
        String dateOfBrith = "2001-12-31";
        String residentialAddress = "무슨 호텔";// 체류지
        String purposeOfVisit = "관광";

        // 절대 변하지 않는 상수는 대문자로
        final String CODE = "KR"; // final 예약어를 앞에 써야함
    }
}
