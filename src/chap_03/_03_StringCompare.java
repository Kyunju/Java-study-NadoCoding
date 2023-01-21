package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // 문자열이 같으면 true, 다르면 false
        System.out.println(s1.equals("Java")); // 문자열이 같으면 true, 다르면 false
        System.out.println(s2.equals("python")); // 대소문자 구분 false
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 없이 문자열 내용 만 체크

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true (내용 비교)
        System.out.println(s1 == s2); // true (참조 값 비교)

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false

    }
}
