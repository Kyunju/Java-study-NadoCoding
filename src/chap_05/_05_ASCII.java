package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 모드 (ANSI) : 미국 표준 코드
        char c = 'A'; // 알파벳 대문자는 65 부터 시작, 소문자는 97 부터 시작, 숫자는 48 부터 시작
        System.out.println(c);
        System.out.println((int)c);

        c = 'B';
        System.out.println(c);
        System.out.println((int) c);

        c++;
        System.out.println(c);
        System.out.println((int) c);

        // 아스키 코드 활용
        String[][] seats2 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats2.length; i++) { // 세로
            //가로
            for (int j = 0; j < seats2[i].length; j++) {
                seats2[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }

        // 영화관 좌석 번호 확인
        for (int i =0; i < seats2.length; i++) {//세로
            //가로
            for (int j = 0; j < seats2[i].length; j++) {
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
    }
    }
}
