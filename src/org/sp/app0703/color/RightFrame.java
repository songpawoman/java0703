package org.sp.app0703.color;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RightFrame extends JFrame{
	//현재 프레임이 버튼들을 보유하고 있다..
	JButton bt_green;
	JButton bt_blue;
	JButton bt_pink;
	JPanel p; //용도: 색상을 부여하기 위함
	
	//has a 관계로 부품을 가지고 있다는 것은, 이 본체가 태어날때 
	//부품들도 함께 생성되어야 한다..따라서 초기화할 이유가 있다..
	//생성자 메서드를 적극 활용해보자
	public RightFrame() {
		//부품들을 생성하자 
		bt_green = new JButton("green");
		bt_blue = new JButton("blue");
		bt_pink = new JButton("pink");
		p = new JPanel();
		
		//버튼들에 배경색을 적용하기 
		bt_green.setBackground(Color.GREEN);
		bt_blue.setBackground(Color.BLUE);
		bt_pink.setBackground(Color.PINK);
		p.setPreferredSize(new Dimension(280, 300));
		
		this.setLayout(new FlowLayout());//배치관리자 변경 적용
		
		add(bt_green);
		add(bt_blue);
		add(bt_pink);
		add(p);
		
		setVisible(true);
		setBounds(400, 200, 300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}





