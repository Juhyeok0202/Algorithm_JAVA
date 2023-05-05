import java.util.Scanner;

public class   Main{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        String str= in.next();  //문자열 입력 받기

        int arr[] = new int[26];    //영문자는 총 26개. 존재하는 영문자의 개수를 카운팅 할 배열

        for (int i=0; i<str.length();++i){  //입력된 단어를 검사
            if(65<=str.charAt(i) && str.charAt(i)<=90){ //대문자일 경우 65를 빼준다.
                arr[str.charAt(i)-65]++;
            }

            else{
                arr[str.charAt(i)-97]++;    //소문자일 경우 97을 빼준다.
            }
        }

        //최댓값을 가진 arr의 원소를 최대값으로.
        int max=0;
        char ch=' ';
        int arrSize = arr.length;

        for (int i = 0; i < arrSize; ++i) {
            if(arr[i]>max){
                max=arr[i];
                ch = (char)(i+65); //askii 코드 접근법이다. 대문자로 출력해야하므로 +65
            }
            else if(arr[i]==max){
                ch='?';
            }
        }

        System.out.println(ch);
    }
}
