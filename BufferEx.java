package com.edubrige;

public class BufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  StringBuffer sb=new StringBuffer("my name is Riya");
		  StringBuffer sb1=new StringBuffer("my name is Riya");
		  
		  System.out.println(sb==sb1);
		   System.out.println(sb.append(" shinde"));
		   System.out.println(sb.length());
		   System.out.println(sb.insert(0, "red "));
		   System.out.println(sb.replace(0, 1, "Me"));
		   System.out.println(sb.delete(0, 4));
		   System.out.println("deleted String :"+sb);
		   System.out.println(sb.reverse());
		   System.out.println(sb.charAt(8));
		   System.out.println(sb.substring(2));
		   System.out.println(sb.substring(0, 7));
		   //ensureCapacity return void
		  // System.out.print(sb.ensureCapacity(12));
		   
	}

}
