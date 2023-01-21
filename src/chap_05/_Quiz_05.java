package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // 신발 사이즈 옵셕 출력
        int[] sizes = new int[10];
        int fromSize = 250;
        int endSize = 295;
        int index = 0;
        for (int i = fromSize; i <= endSize; i += 5) {
            sizes[index] = i;
            index++;
        }

        for (int size :
                sizes) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }
    }
}
