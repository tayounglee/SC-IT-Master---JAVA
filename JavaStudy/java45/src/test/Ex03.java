package test;

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
/*
		Ex.3 (20점)
		[ 애국가 타자연습 PRORGRAM ]
		애국가의 가사를 4단계로 나누어 입력받는 속도와 정확도를 계산한다.
		  - 속도		= 문자열길이 * 60(초) * 1000 / 입력시간
		  - 정확도	= 일치하는 개수 / 문자열길이 * 100(백분율)
		  
		hint.
		1.	System.currentTimeMillis() : 밀리세컨드(1/1000초) 값을 반환
				↑ 위의 메서드를 이용하여 문자열을 입력받기 전, 후의 시간차로 속도 계산
		2.	String 클래스의 toCharArray()를 이용하여 
				애국가와 입력받은 문자열의 문자 하나하나를 비교하여 정확도를 계산
 */
		Scanner scan = new Scanner(System.in);
		int index = 4;
		String lyric[] = new String[index];
		lyric[0] = "동해물과 백두산이 마르고 닳도록";
		lyric[1] = "하느님이 보우하사 우리나라 만세";
		lyric[2] = "무궁화 삼천리 화려강산 대한사람";
		lyric[3] = "대한으로 길이 보전하세";
		String input[] = new String[index];
		
		for (int i = 0; i < lyric.length; i++) {
			int speed = 0;
			int cnt = 0;
			double accuracy = 0.0;
			System.out.println("( " + (i + 1) + " / 4 )");
			System.out.println(lyric[i]);
			
			long start = System.currentTimeMillis();
			input[i] = scan.nextLine();
			long end = System.currentTimeMillis();
			
			//타자속도
			speed = lyric[i].length() * 60000 / (int)(end - start);

			//정확도(input의 길이가 lyric보다 짧을 경우 입력 안한만큼 정확도 깎음)
			int blank = Math.min(lyric[i].length(), input[i].length());
			char[] arr = lyric[i].toCharArray();
			char[] arr2 = input[i].toCharArray();
			
			for(int j = 0; j < blank; j++) {
				if(arr[j] == arr2[j]) {
					cnt++;
				}
			}
			
			accuracy = Math.round((double) cnt / lyric[i].length() * 100);
			
			//결과 출력
			System.out.println("■타자속도 : " + speed + "타 /분  ■정확도 : " + accuracy + "%");
			
		}
	}
}