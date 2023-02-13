package chap_11;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
    public static void main(String[] args) {
        // 호출한 곳으로 예외 처리를 미루려면 throws를 사용할 수 있다

        try {
            writeFile();
        } catch (IOException e) {
            System.out.println("메인 메소드에서 해결할게요");
        }
    }

    public static void writeFile() throws IOException {
//        try {
//            FileWriter writer = new FileWriter("test.txt");
//            throw new IOException("파일 쓰기에 실패했어요 !!");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("writeFile 메소드 내에서 자체 해결했어요.");
//        }
        
        // 여기서 코드를 실행하다 발생되는 문제를 던지게 된다
        FileWriter writer = new FileWriter("test.txt");
        throw new IOException("파일 쓰기에 실패했어요 !!");
    }
}
