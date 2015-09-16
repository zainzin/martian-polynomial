package p4_martianpolynomial;
/* IMPORTANT:  THIS CLASS HAS BEEN WRITTEN FOR YOU.  DO NOT MODIFY IT!
 * 
 * This driver displays a dialog box for the user to make choices about how 
 * they would like to display the Polynomial.  It then creates the graph 
 * displaying the polynomial using your implementation of the polynomial.
 * However, due to the fictional nature of this type of polynomial, this
 * really doesn't provide useful feedback, so it's currently all commented
 * out so you can build and test your class little by little using the
 * JUnit test approach.
 */
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.GeneralPath;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import p4_utility.MyDouble;


	

















/**
 * Main testing program for Polynomial including simple UI for
 * entering coefficients and plotting the resulting polynomial
 * and splee.
 * 
 * @author Ben Bederson, Evan Golub
 * @date March 2010, October 2013, October 2014
 */


/* Uncomment this when you are ready to test the GUI - note that you will need
 * to have implemented many parts of your project before you can do this.  To
 * test things as you build, use JUnit tests.
 */

/*
public class MartianPolynomialDriver {
	public static void main(String[] args) {
		MartianPolynomialFrame polyFrame = new MartianPolynomialFrame();
		polyFrame.createAndShowGUI();
	}
}

class MartianPolynomialFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField a = new JTextField();
	private JTextField b = new JTextField();
	private JTextField c = new JTextField();
	private MartianPolynomialGrapher grapher = null;
	
	void createAndShowGUI() {
		setTitle("Martian Polynomial Tester");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		JPanel textPanel = new JPanel();
		textPanel.setPreferredSize(new Dimension(600, 50));
		
		textPanel.add(new JLabel("Enter Martian polynomial coefficients - a:"));
		a.setPreferredSize(new Dimension(100, 20));
		textPanel.add(a);
		textPanel.add(new JLabel("b:"));
		b.setPreferredSize(new Dimension(100, 20));
		textPanel.add(b);
		textPanel.add(new JLabel("c:"));
		c.setPreferredSize(new Dimension(100, 20));
		textPanel.add(c);
		textPanel.add(new JLabel("Specified Martian polynomial (a*x^2 + b*x + c) in red, splee in blue"));
		
		KeyListener textListener = new KeyListener() {
			public void keyPressed(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {
				double aNum = 0, bNum = 0, cNum = 0;
				try {
					aNum = Double.parseDouble(a.getText());
				} catch (Exception ex) {}				
				try {
					bNum = Double.parseDouble(b.getText());	
				} catch (Exception ex) {}				
				try {
					cNum = Double.parseDouble(c.getText());
				} catch (Exception ex) {}				
				grapher.updatePolynomial(aNum, bNum, cNum);
			}
			public void keyTyped(KeyEvent e) {}
		};
		a.addKeyListener(textListener);
		b.addKeyListener(textListener);
		c.addKeyListener(textListener);
		
		grapher = new MartianPolynomialGrapher();
		
		cp.add(textPanel, BorderLayout.NORTH);
		cp.add(grapher, BorderLayout.CENTER);

		this.setPreferredSize(new Dimension(600, 400));
		pack();
		setVisible(true);
	}
}

class MartianPolynomialGrapher extends JPanel {
	private static final long serialVersionUID = 1L;
	private MartianPolynomial poly;
	
	public MartianPolynomialGrapher() {
		poly = new MartianPolynomial();
	}
	
	public void updatePolynomial(double a, double b, double c) {
		poly = new MartianPolynomial(new MyDouble(a), new MyDouble(b), new MyDouble(c));
		this.repaint();
	}

	public void paint(Graphics g) {
		int w = getWidth();
		int h = getHeight();
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.white);
		g2.fillRect(0, 0, w, h);
		
		// Plot axes
		g2.setColor(Color.gray);
		g2.setStroke(new BasicStroke(1));
		g2.drawLine(0, h/2, w, h/2);
		g2.drawLine(w/2, 0, w/2, h);
		
		// Draw polynomials
		g2.setColor(Color.red);
		plotMartianPolynomial(g2, poly);
		g2.setColor(Color.blue);
		plotMartianPolynomial(g2, poly.splee());
	}

	// Draw specified polynomial in current color
	private void plotMartianPolynomial(Graphics2D g2, MartianPolynomial p) {
		int w = getWidth();
		int h = getHeight();
		GeneralPath path = new GeneralPath();
		boolean firstPoint = true;
		float minX = -100;
		float maxX = 100;
		for (float x = minX; x <= maxX; x++) {
			float y = (float)MyDoubleVal(p.eval(new MyDouble(x)));
			float xScale = w / (maxX - minX);
			float plotX = (x - minX) * xScale;
			float plotY = h/2 - y;
			if (firstPoint) {
				path.moveTo(plotX, plotY);
				firstPoint = false;
			} else {
				path.lineTo(plotX, plotY);
			}
		}
		g2.setStroke(new BasicStroke(2));
		g2.draw(path);		
	}
	
	private double MyDoubleVal(MyDouble d) {
		return Double.parseDouble(d.toString());
	}
}

*/