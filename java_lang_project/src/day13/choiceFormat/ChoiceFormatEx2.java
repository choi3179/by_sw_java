package day13.choiceFormat;

import java.text.ChoiceFormat;

public class ChoiceFormatEx2 {
	public static void main(String[] args) {
			String pattern = "50#F|60#D|70#C|80#B|90#A" ;		// 패턴에는 무조건 낮은 순서대로 입력
			
			int[] score = { 100, 95, 70, 55, 60, 70 };
			
			ChoiceFormat  form = new ChoiceFormat(pattern);
			for(int i=0; i < score.length; i++) {
				System.out.println(score[i] + " : " + form.format(score[i]));
			}
	}
}
