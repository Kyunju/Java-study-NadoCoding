package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        // 다차원 배열 순회
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"},
        };

        for (int i =0; i < seats.length; i++) {//세로
            //가로
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------");
        // 세로 크기 10 x 가로 크기 15에 해당하는 영화관 좌석
        String[][] seats2 = new String[10][15];
        String[] eng = {"A","B","C","D","E","F","G","H","I","J"};
        for (int i = 0; i < seats2.length; i++) { // 세로
            //가로
            for (int j = 0; j < seats2[i].length; j++) {
                seats2[i][j] = eng[i] + (j + 1);
            }
        }
        // 표 구매
        seats2[7][8] = "__";
        seats2[7][9] = "___";

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
