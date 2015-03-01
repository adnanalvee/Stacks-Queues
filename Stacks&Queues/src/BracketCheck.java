import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BracketCheck {

	private String input;
	
	public BracketCheck(String in) {
		in = input;
	}
	
	public void check() {
		int stackSize = input.length();
		SimpleStack a1 = new SimpleStack(stackSize);
		
		for (int j = 0; j<input.length(); j++) {
			char ch = input.charAt(j);
		switch(ch) 
		{
		case '{':
		case '[':
		case '(':
			a1.push(ch);
			break;
		case '}':
		case ']':
		case ')':			
		
			if (!a1.isEmpty()) {							
				char chk = (char) a1.pop();  //pop and check
				if ( (ch == '}' && chk!= '{') || (ch == ']' && chk!= '[' || ch== ')' && chk!= '(')) 
					System.out.println("Error: " + ch+ " at " + j);
				}
			else 
				System.out.println("Error: " + ch+ " at " + j);
				break;				
			default:
			break;	
		
			} //end switch
		} //end for
		if (!a1.isEmpty()) {
			System.out.println("Error: missing right delimiter");
		}
	} //end
	
	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();		
		return s;	
	}
	
	public static void main(String[] args) throws IOException {
		
		String input;
		while(true) {
			System.out.print("Enter sring containing delimiters");
			System.out.flush();
			
			input = getString();
			if (input.equals("")) 
				break;
			
			BracketCheck theChecker = new BracketCheck(input);
			theChecker.check();
			
		}
	}

}
