public class Java20240305 {
    public static void main(String[] args) {
        //break = 제어문의 중괄호를 탈출시키는 키워드
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i > 5) {
                break;
            }
        }

        //이중 for문의 break 사용법

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    i = 99999999; //매우 큰 수를 세팅해서 바깥 for문 탈출
                    break;

                }
                System.out.println(i + ", " + j);
            }
        }

        //바깥 for문까지 탈출하는 방법
        out:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 3) {
                    //매우 큰 수를 세팅해서 바깥 for문 탈출
                    break out;
                }
                System.out.println(i + ", " + j);
            }
            }

            //continue 사용법
            for (int k = 0; k < 10; k++) {
                if (k % 2 == 1) { //홀수의 경우 아래 출력문을 실행하지 않음
                    continue;
                }
                System.out.println(k);
            }
            for (int a=0; a<5; a++) {
                for (int b=0; b<5; b++) {
                    if(b == 3) {
                        continue;
                    }
                    System.out.println(a + ", "+b);
                }

            }

    }
}
