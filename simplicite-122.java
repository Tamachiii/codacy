package eraser;

public class Eraser {
    public static String erase(String str) {
		String message = "";
		int count = 0;
		for(char lettre : str.toCharArray()) {
			
			if(lettre == ' ') {
				count++;
			} else {
				if(count >= 2) {
					while(count > 0) {
						message += " ";
						count--;
					}
					message += lettre;
				} else {
					message += lettre;
					count = 0;
				}
				
			}
			
		}
        return message;
    }
}
