import javax.swing.*;
public class LAb303_1 {

	public static void main(String[] args) {
		int count = 0;

		String sentence = JOptionPane.showInputDialog(null, "Input a sentence : ","Input",JOptionPane.QUESTION_MESSAGE);
		while(!sentence.endsWith(".")) {
			sentence = JOptionPane.showInputDialog(null,"Input a sentence, again : ","Input",JOptionPane.QUESTION_MESSAGE);
			
	  }
		for(int i = 0 ; i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				count++;
			}
		}
		String message = "This sentence has "+count+ " spacebar.\nThis sentence has "+(count+1)+ " word.";
		JOptionPane.showMessageDialog(null,message);
	}

	}


