package ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class v1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblSegundoNmero;
	private JLabel lblTercerNmero;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;
	private JButton btnNewButton;
	private JButton btnSumaEnteros;
	private JButton btnSumaReales;
	private JScrollPane scrollPane;
	private JTextArea TXTs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					v1 frame = new v1();
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
	public v1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("primer número");
			lblNewLabel.setBounds(10, 11, 82, 33);
			contentPane.add(lblNewLabel);
		}
		{
			lblSegundoNmero = new JLabel("segundo número");
			lblSegundoNmero.setBounds(10, 55, 82, 25);
			contentPane.add(lblSegundoNmero);
		}
		{
			lblTercerNmero = new JLabel("tercer número (opcional)");
			lblTercerNmero.setBounds(10, 91, 133, 25);
			contentPane.add(lblTercerNmero);
		}
		{
			txtN1 = new JTextField();
			txtN1.setBounds(171, 17, 86, 20);
			contentPane.add(txtN1);
			txtN1.setColumns(10);
		}
		{
			txtN2 = new JTextField();
			txtN2.setColumns(10);
			txtN2.setBounds(171, 57, 86, 20);
			contentPane.add(txtN2);
		}
		{
			txtN3 = new JTextField();
			txtN3.setColumns(10);
			txtN3.setBounds(171, 93, 86, 20);
			contentPane.add(txtN3);
		}
		{
			btnNewButton = new JButton("suma 2 enteros");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(120, 127, 183, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnSumaEnteros = new JButton("suma 3 enteros");
			btnSumaEnteros.addActionListener(this);
			btnSumaEnteros.setBounds(120, 165, 183, 23);
			contentPane.add(btnSumaEnteros);
		}
		{
			btnSumaReales = new JButton("suma 2 reales");
			btnSumaReales.addActionListener(this);
			btnSumaReales.setBounds(120, 199, 183, 23);
			contentPane.add(btnSumaReales);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(31, 236, 373, 127);
			contentPane.add(scrollPane);
			{
				TXTs = new JTextArea();
				TXTs.setText("verificando");
				scrollPane.setViewportView(TXTs);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSumaReales) {
			do_btnSumaReales_actionPerformed(e);
		}
		if (e.getSource() == btnSumaEnteros) {
			do_btnSumaEnteros_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		try {
		int n1 = Integer.parseInt(txtN1.getText());
		int n2 = Integer.parseInt(txtN2.getText());
		calculadora c = new calculadora(n1, n2);
		TXTs.setText("");
		TXTs.append("La suma de dos enteros es: "+c.Sumar(n1, n2));
	} catch (Exception e2) {
		JOptionPane.showMessageDialog(this, "Ingrese Números enteros");
		txtN1.setText("");
		txtN2.setText("");
	}
		
	}
	
	protected void do_btnSumaEnteros_actionPerformed(ActionEvent e) {
		try {
		int n1 = Integer.parseInt(txtN1.getText());
		int n2 = Integer.parseInt(txtN2.getText());
		int n3 = Integer.parseInt(txtN3.getText());
		calculadora cal = new calculadora(n1, n2);
		TXTs.setText("");
		TXTs.append("La suma de dos enteros es: "+cal.Sumar(n1, n2, n3));
	}catch (Exception e2) {
		JOptionPane.showMessageDialog(this, "Ingrese Números enteros");
		txtN1.setText("");
		txtN2.setText("");
		txtN3.setText("");
		
		}
		}
	protected void do_btnSumaReales_actionPerformed(ActionEvent e) {
	    try {
	        double num1 = Double.parseDouble(txtN1.getText());
	        double num2 = Double.parseDouble(txtN2.getText());
	        calculadora cr = new calculadora(num1, num2);
	        TXTs.setText("");
	        TXTs.append("La suma de dos reales es: " + cr.Sumar(num1, num2));
	    } catch (Exception e2) {
	        JOptionPane.showMessageDialog(this, "Ingrese números reales válidos");
	        txtN1.setText("");
	        txtN2.setText("");
	    }
	}

	}
