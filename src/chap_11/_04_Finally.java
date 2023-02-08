package chap_11;

public class _04_Finally {
    public static void main(String[] args) {
        // 오류가 나던 안나던 무조건 수행 해야 하는 것 Finally
        try {
            System.out.println("택시의 문을 연다.");
            throw new Exception("휴무 택시");
        }catch (Exception e) {
            System.out.println("!! 문제 발생 : " + e.getMessage());
        } finally {
            System.out.println("택시의 문을 닫는다.");
        }
    }
}
