package study1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FirstFrame extends Frame{

	TextArea textResult;
	Button mouseButton;
	
	public FirstFrame() {
		
		init();
		
		setTitle("Basic Window");
		setSize(400, 400);
		setVisible(true);
		
		setLayout(new BorderLayout());
		add(mouseButton, BorderLayout.NORTH);
		add(textResult, BorderLayout.CENTER);
		
		MouseEvent event = new MouseEvent(this);
		mouseButton.addMouseListener(event);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	private void init() {
		textResult = new TextArea();
		mouseButton = new Button("MouseEvent Button");
	}
}
