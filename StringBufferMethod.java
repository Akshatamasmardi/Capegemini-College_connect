package com.edu.methods;

public class StringBufferMethod {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("hello world");
		
		System.out.println(sb.append("stry"));
		System.out.println(sb.insert(1, "sdhj"));
		System.out.println(sb.replace(1, 3, "stry"));
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
		System.out.println(sb.delete('1','e'));
		System.out.println(sb.length());
		System.out.println(sb.charAt(3));
		System.out.println(sb.substring(2));
		
		
				
		
	}

}
