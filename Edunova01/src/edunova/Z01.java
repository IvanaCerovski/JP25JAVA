package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	
	// Program učitava dva cijela broja i ispisuje njihovu razliku
	
	public static void main(String[] args) {
		int a;
		a = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		
	    int b;
	    b = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
	    
	    int c;
	    c = a - b;
	    
	    System.out.println(c);
		
	}

}
