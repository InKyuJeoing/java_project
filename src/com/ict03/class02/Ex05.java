package com.ict03.class02;

public class Ex05 {
	public static void main(String[] args) {
		// StringBuffer ,  StringBulider
		
		String msg = "hello";
		System.out.println(msg);
		
		msg = msg + " java";
		System.out.println(msg);
		
		StringBuffer sb = new StringBuffer("welcome");
		System.out.println(sb.toString());
		
		// ������ �߰��Ҷ� (append("���ڿ�");
		sb.append("JAVA");
		
		System.out.println(sb.toString());
		
		
	}
}
