package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir();
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        }

        // 여러 하위 폴더 만드는 법

        folderName = "A/B/C";
        // 윈도우 : C:\\Users\\Nadocoding\\Desktop
        // 맥 : /Users/Nadocoding/Desktop
        // 자동완성 - File.separator
        folder = new File(folderName);
        folder.mkdirs();
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        } else {
            System.out.println("폴더 생성 실패 (mkdir)");
        }
        // 안되는 이유 A 폴더 안에 B 폴더가 없는데 C를 만들려고 그래서
        // 하위 폴더들까지 다 경로를 만들려면 folder.mkdirs() 를 사용
        // folder.mkdir() 은 단일 폴더 생성
    }
}
