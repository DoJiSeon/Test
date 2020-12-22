package study1;

import java.awt.event.MouseAdapter;

public class MouseEvent extends MouseAdapter{
	FirstFrame frame;

	public MouseEvent(FirstFrame frame) {
		this.frame = frame;
	}
	
	public void mouseClicked(java.awt.event.MouseEvent e) {
		frame.textResult.append("Mouse Clicked!!/n");
	}
	
	public void mouseEntered(java.awt.event.MouseEvent e) {
		frame.textResult.append("Mouse Entered!!/n");
	}
	public void mouseExited(java.awt.event.MouseEvent e) {
		frame.textResult.append("Mouse Exited!!/n");
	}

}
