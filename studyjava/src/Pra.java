public class Pra {
    public static void main(String[] args) {
        System.out.println();
        //멀티 조건식
        for (int a = 0, b = 0; a < 5 || b < 5; a++, b++) {
            System.out.print(a + "_" + b + " ");
        }
    }

    {
        System.out.println();

        //while문
        int count = 0; //초기식
        while (count < 5) { //조건식
            System.out.print(count + " ");
            count++; //증감식
        }
    }
}