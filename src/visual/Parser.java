package visual;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;


public class Parser extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar mnbBar;
	private JMenu mnArchivo;;
	private JMenuItem mntmAbrirArchivo, mntmSalir;
	private JTextPane txtpnOutput;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parser frame = new Parser();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Parser() {
		super("Parser");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		setResizable(false);
		

		setContentPane();
		setMenu();
		setTexTPane();
		
	}
	private void setContentPane(){
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
	}
	
	private void setMenu(){
		mnbBar = new JMenuBar();
		mnbBar.setBounds(0, 0, 600, 20);
		contentPane.add(mnbBar);
		
		mnArchivo = new JMenu("Archivo");
		mnbBar.add(mnArchivo);
		
		mntmAbrirArchivo = new JMenuItem("Abrir Archivo");
		mntmAbrirArchivo.addActionListener(this);
		mnArchivo.add(mntmAbrirArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
	}
	
	private void setTexTPane(){
		txtpnOutput = new JTextPane();
		txtpnOutput.setEditable(false);
		txtpnOutput.setBounds(40, 40, 510, 300);
		contentPane.add(txtpnOutput);
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == mntmAbrirArchivo){
			System.out.println("abrir");
			txtpnOutput.setText("Inicializando Parser");
		}
		else if( e.getSource() == mntmSalir){
			dispose();
		}
	}
}
