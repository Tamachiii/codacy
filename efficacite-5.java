package main.java.eraser;

import java.lang.reflect.Array;

public class Eraser {
    public static String erase(String str) {
        char[] message=str.toCharArray();
		int longueur=message.length;
		str="";
		char val;
		
		for(int i=0;i<longueur; i=i+1) {
			val=Array.getChar(message, i);
			if(val==' ') {
				if(i==0) {
					if(message[i+1]==' ') {
						str=str+val;
					}
				}
				else {
					if(i==longueur-1) {
						if(message[i-1]==' ') {
							str=str+val;
						}
					}
					else {
						if(message[i+1]==' '||message[i-1]==' ') {
							str=str+val;
						}
					}
				}
				
			}
			else {
				str=str+message[i];
			}
		}
		
		
		
		
		
		
		return str;

    }
}
