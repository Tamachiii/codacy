package eraser;

public class Eraser {
	public static String erase(String str) {
		String[] res=str.split(" ");
		String rep="";
		int size=res.length;
		for (int i=0;i<size-1;i++) {
			if (res[i].equals("") && !res[i+1].equals("")) {
				rep+=" "+res[i];
			}
			if (i>0 && res[i].equals("") && !res[i+1].equals(" ")){
				rep+=" "+res[i];
			}
			else {
				rep+=""+res[i];
			}
		}
		rep+=""+res[size-1];
		return rep;
	}
}
