package ex;
import java.util.Scanner;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 1050210XX 周永振老師
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入度數");
		float i = scn.nextFloat();
		if (i>=0 && i <=120){
			System.out.println(i*2.10);
			System.out.println(i*2.10);
			}
		else if (i>=121 && i<=330){
			System.out.println(120*2.10+((i-120)*3.02));
			System.out.println(120*2.10+((i-120)*2.68));
		}
		else if (i>=331 && i<=500){
			System.out.println(120*2.10+210*3.02+((i-330)*4.39));
			System.out.println(120*2.10+210*2.68+((i-330)*3.61));
		}
		else if (i>=501 && i<=700){
			System.out.println(120*2.10+210*3.02+170*4.39+((i-500)*4.97));
			System.out.println(120*2.10+210*2.68+170*3.61+((i-500)*4.01));
		}
		else if (i>=701){
			System.out.println(120*2.10+210*3.02+170*4.39+200*4.97+((i-700)*5.63));
			System.out.println(120*2.10+210*2.68+170*3.61+200*4.01+((i-500)*4.50));
		}
}
}
