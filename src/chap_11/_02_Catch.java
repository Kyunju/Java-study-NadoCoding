package chap_11;

public class _02_Catch {
    public static void main(String[] args) {
        // Catch 심화

        try {
            System.out.println(3 / 0); //(계산 잘못)
//            int[] arr = new int[3]; //(인덱스 잘못)
//            arr[5] = 100;

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("뭔가 잘못 계산을 하셨네요.");
        //} catch (ArrayIndexOutOfBoundsException e) {
        //    System.out.println("인덱스를 잘못 설정했어요.");
        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}
