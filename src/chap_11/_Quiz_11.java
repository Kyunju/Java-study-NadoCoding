package chap_11;
// 에러코드
// 0 (에러 없음), 1 (판매 시간 아님), 2 (매진)
// 0 인 경우? 상품 구매를 완료하였습니다
// 1 인 경우? 상품 구매 가능 시간이 아닙니다. / 상품 구매는 20시 부터 가능합니다.
// 2 인 경우? 해당 상품은 매진 되었습니다. / 다음 기회에 이용해주세요

public class _Quiz_11 {
    public static void main(String[] args) {
        int errorCode = 2;
        try {
            if (errorCode == 0) {
                System.out.println("(상품 구매를 완료하였습니다)");
            }
            if (errorCode == 1) {
                throw new NotOnSaleException("상품 구매 가능 시간이 아닙니다.");
            }
            if (errorCode == 2) {
                throw new SoldOutException("해당 상품은 매진 되었습니다.");
            }
        } catch (NotOnSaleException e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다.");
        } catch (SoldOutException e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요");
        }
    }
}
// 에외 객체를 생성 // Exception 을 상속
class NotOnSaleException extends Exception {
    // 예외 객체 메세지를 전달 받음
    public NotOnSaleException(String message) {
        super(message);
    }
}

class SoldOutException extends Exception {
    public SoldOutException(String message) {
        super(message);
    }
}