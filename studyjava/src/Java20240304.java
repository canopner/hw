public class Java20240304 {

    public static void main(String[] args) {

        int a;
        for (a = 0; a < 3; a++) {
            System.out.print(a + " ");
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i += 2) {
            System.out.

                    print(i + " ");
        }
        System.out.println();

        for (int i = 0, j = 0; i < 10; i++, j++) {
            System.out.print(i + j + " ");
        }
        System.out.println();
        for (int i = 0; ; i++) {
            if (i > 10) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.print("무한 루프 탈출");

        System.out.println();

        //멀티 조건식
        for (int x = 0, b = 5; x < 5 || b < 5; x++, b++) {
            System.out.print(x + "_" + b + " ");

        }


        System.out.println();

        //while문
        int count = 0; //초기식
        while (count < 5) { //조건식
            System.out.print(count + " ");
            count++; //증감식

        }
        // 의도적인 무한루프에서 while문은 자주 쓰임
        // while (true) { //무한루프
        //유저가 버튼 클릭할 때까지 대기
        // if (esc버튼 클릭)
        //      break;

        //do-while문
        int cnt1 = 5; // 초기식
        do {
            System.out.print(cnt1 + " ");
            cnt1++;
        } while (cnt1 < 5);
        //아래 while문과 비교하면,
        //반복문의 조건이 처음부터 false인 경우,
        //do-while문은 실행코드가 1회 실행되는 반면, while문은 실행되지않음
        int cnt2 = 5;
        while (cnt2 < 5) {
            System.out.print(cnt2 + " ");
            cnt2++;
        }
        //이중루프, 이중반복문, 매우 중요함
        for(int k = 0; k<3;k++)
        for (int j = 0; j < 5; j++) {
            System.out.println("[k=" + k + ", j=" + j + "]");
        }
    }
}
