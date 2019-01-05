package sw1221;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Properties;

public class SW1221_V2 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int tc = Integer.parseInt(br.readLine());		//10

		
		for(int tcn=1; tcn<=tc; tcn++) {
			String[ ] nm = br.readLine().split(" "); // #2 334 
			String tcsharp =  nm[0]; //#1
			int num = Integer.parseInt(nm[1]); //7041
			String[ ] str = br.readLine().split(" ");	
			String[ ] ss = new String[num];
			for(int i=0; i<num; i++) {
				StringBuffer sb =new StringBuffer();
				switch(str[i]) {
					
					case "ZRO":
						sb.append("0ZRO");
						ss[i] = sb.toString();
						break;
			
					case "ONE":
						sb.append("1ONE");
						ss[i] = sb.toString();
						break;
			
					case "TWO":
						sb.append("2TWO");
						ss[i] = sb.toString();
						break;
		
					case "THR":
						sb.append("3THR");
						ss[i] = sb.toString();
						break;

					case "FOR":
						sb.append("4FOR");
						ss[i] = sb.toString();
						break;
			
					case "FIV":
						sb.append("5FIV");
						ss[i] = sb.toString();
						break;

					case "SIX":
						sb.append("6SIX");
						ss[i] = sb.toString();
						break;

					case "SVN":
						sb.append("7SVN");
						ss[i] = sb.toString();
						break;

					case "EGT":
						sb.append("8EGT");
						ss[i] = sb.toString();
						break;

					case "NIN":
						sb.append("9NIN");
						ss[i] = sb.toString();
						break;
				}//switch
			}//for
			
		Arrays.sort(ss);	
		System.out.println(tcsharp);
		for(int i=0; i<num; i++) {
			System.out.print(ss[i].substring(1)+ " ");
		}
		System.out.println();
	}//for
	}
}
	


