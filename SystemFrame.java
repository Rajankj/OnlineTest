import javax.swing.JFrame;
			
public class SystemFrame extends JFrame implements SystemConstants{
	SystemFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(SWIDTH,SHEIGHT);
		setTitle(TITLE);
		setLocationRelativeTo(null);
		Board board = new Board();
		add(board);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		SystemFrame frame = new SystemFrame();
	}

}
