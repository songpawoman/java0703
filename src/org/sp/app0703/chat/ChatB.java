package org.sp.app0703.chat;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatB extends JFrame{
	JTextArea area;
	JScrollPane scroll;
	JPanel p;
	JTextField t;
	
	public ChatB() {
		area = new JTextArea();
		scroll = new JScrollPane(area);
		p = new JPanel(); 
		t=new JTextField(20);
		 
		add(scroll);//센터에 부착
		p.add(t);//패널에 부착

		add(p, BorderLayout.SOUTH);//남쪽에 패널 부착
		
		setBounds(500, 100, 300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}






