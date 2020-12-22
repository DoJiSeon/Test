package Q2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;

public class FirstFrame extends Frame {
	//기본(디폴트) 생성자 메소드
	public FirstFrame() {
		setVisible(true);
		setTitle("Basic Window");
		setSize(400,400);
		
		setLayout(new BorderLayout());
		add(new Button("North"), BorderLayout.NORTH);
		add(new Button("South"), BorderLayout.SOUTH);
		add(new Button("East"), BorderLayout.EAST);
		add(new Button("West"), BorderLayout.WEST);
		add(new Button("Center"), BorderLayout.CENTER);
	}
	
	//사용자 정의 생성자 메소드
	public FirstFrame(int width, int height) {
		setVisible(true);
		setSize(width, height);
		
		setLayout(new FlowLayout());
		add(new Button("Button1"));
		add(new Button("Button1"));
		add(new Button("Button1"));
		add(new Button("Button1"));
		add(new Button("Button1"));
		add(new Button("Button1"));
		add(new Button("Button1"));
		add(new Button("Button1"));
	}
	
	//사용자 정의 생성자 메소드
	public FirstFrame(String title) {
		setVisible(true);
		setTitle(title);
		
		setLayout(new GridLayout(3, 3));
		add(new Button("Button1"));
		add(new Button("Button2"));
		add(new Button("Button3"));
		add(new Button("Button4"));
		add(new Button("Button5"));
		add(new Button("Button6"));
		add(new Button("Button7"));
		add(new Button("Button8"));
		add(new Button("Button9"));
	}
}

