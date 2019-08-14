package View;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Optic extends JFrame {
	private JButton startButton = new JButton("Start");
	private JButton tuer = new JButton();
	private JButton lampe = new JButton();
	private JButton roehre = new JButton();
	
	public Optic () {
		this.device = new deviceController();

		initDevice();
		pack();
	}

	private initDevice() {
		JPanel sub = new JPanel(new Gridlayout(3, 1));
		JPanel main = new JPanel(new Gridlayout(2, 1));

		sub.add(startButton);
		sub.add(lampe);
		sub.add(roehre);
		main.add(sub);
		main.add(tuer);

		startButton.addActionListener(new actionListener(){
			public void actionPerformed(final ActionEvent e){
				if(!this.device.isTuerZu()){
					this.device.starten();
				}
			}
		});
	}
}
