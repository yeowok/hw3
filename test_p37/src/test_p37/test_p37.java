package test_p37;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p37 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("��J�^��r��");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
				
		String str=br.readLine();
		
		String stru=str.toUpperCase();
		String strl=str.toLowerCase();
		
		System.out.println("�ഫ���j�g��"+stru);
		System.out.println("�ഫ���p�g��"+strl);
	}

}
