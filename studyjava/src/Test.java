import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String[] fruitList = {"배", "사과", "바나나", "딸기", "사과", "수박"};
        int count = 0;
        for (int i = 0; i < fruitList.length; i++) {
            if (fruitList[i] == "사과") {
                count = count + 1;
            }
        }
System.out.println(count);
        //자바에서 입력값을 받는 방법
        Scanner sc = new Scanner(System.in);
        System.out.print("0~6까지 숫자를 입력해주세요 : ");
        int inputNumber = sc.nextInt();
        System.out.println(inputNumber);
    }
}
