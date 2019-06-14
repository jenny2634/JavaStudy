package ch07;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window {
	public Window() {//생성자
		
	}
	
	public Window(int a) {
		
	}
	
	public static void main(String[] args) {
		//생성자 호출 -> 인스턴스 생성 -> 클래스를 사용하기 위해서
		Window w = new Window();
		
		JFrame frame = new JFrame("윈도우");
		//frame.setTitle("윈도우@@@");
		
		// 색상 바꾸기
		JButton btn = new JButton();
		btn.setText("버튼");
		btn.setBackground(Color.RED);
		
		frame.add(btn);
		
		frame.setBounds(200, 200, 200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

		frame.setVisible(true);
	}
}