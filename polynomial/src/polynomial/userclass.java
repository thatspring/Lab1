//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : userclass.java
//  @ Date : 2016/12/1
//  @ Author : 
//
//

package polynomial;

import java.util.Scanner;

public class userclass {
    private String Input_str;
    private String Output_str;
    int flag;
    public void Input() {
    	System.out.print('>');
		Scanner sc = new Scanner(System.in);
		String str_in = null;
		str_in=sc.nextLine();
		String temp_com=null;
		String value[]=null;
		String valuename;
		Input_str=str_in;
		while(!str_in.equals("!exit")){
			
			processexpclass in = null;
			Output_str=in.ProcessExp(Input_str,flag);
			
		}
		sc.close();
	}
    
    public void Output() {
    	
    }
    
    private void ProcessExp() {
    	System.out.println(Output_str);
    }
}
