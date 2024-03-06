import java.util.Arrays;

public class JavaString2 {

    public static void main(String[] args) {
        String str1 = "Java Study";
        // Study를 못 찾으면 변경하지 않고 원본 그대로 둠
        System.out.println(str1.replace("Study", "공부"));

        // 두번째 파라미터로 사용된 인덱스는 포함되지 않음 (0 <= 범위 < 5) 범위 앞은 포함, 뒤는 제외
        System.out.println(str1.substring(0,5));

        // 연산자를 이용하여 ':'와 '.'기준으로 분리시킴
        // split 메소드의 리턴형은 String[] 문자열의 배열이다
        String[] strArray = "abc/def-ghi jkl".split("/|-| ");
        System.out.println(Arrays.toString(strArray));


        // 앞뒤 공백 제거
        System.out.println("    ab c    ".trim());
        System.out.println();
        // 모든 공백 제거
        String _str1 = "    ab c    ";
        System.out.println(_str1.replaceAll(" ", ""));

        // 문자 지우기
        String str = "tom";
                str = "";

        System.out.println();

        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("java");

        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str4 == str2);

        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));







    }
}
