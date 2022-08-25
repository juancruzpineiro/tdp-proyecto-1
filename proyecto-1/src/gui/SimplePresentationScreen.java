package gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JLabel labelLU;
	private JTextField textFieldLU;
	private JTextField textFieldApellido;
	private JTextField textFieldNombre;
	private JTextField textFieldEmail;
	private JTextField textFieldGithub;
	private JLabel lblNewLabel;

	public SimplePresentationScreen(Student studentData) {
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(674, 325));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 21, 430, 224);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		tabInformation.setLayout(null);
		
		labelLU = new JLabel("L.U.:");
		labelLU.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelLU.setBounds(10, 22, 67, 25);
		tabInformation.add(labelLU);
		
		
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		
		textFieldLU = new JTextField(studentData.getId()+ "");
		textFieldLU.setBounds(100, 26, 315, 19);
		tabInformation.add(textFieldLU);
		textFieldLU.setColumns(10);
		
		JLabel labelApellido = new JLabel("Apellido:");
		labelApellido.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelApellido.setBounds(10, 57, 67, 25);
		tabInformation.add(labelApellido);
		
		JLabel labelNombre = new JLabel("Nombre:");
		labelNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelNombre.setBounds(10, 92, 67, 25);
		tabInformation.add(labelNombre);
		
		JLabel labelEmail = new JLabel("E-Mail:");
		labelEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelEmail.setBounds(10, 127, 67, 25);
		tabInformation.add(labelEmail);
		
		JLabel labelGithub = new JLabel("GitHub URL:");
		labelGithub.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelGithub.setBounds(10, 162, 88, 25);
		tabInformation.add(labelGithub);
		
		textFieldApellido = new JTextField(studentData.getLastName());
		textFieldApellido.setColumns(10);
		textFieldApellido.setBounds(100, 61, 315, 19);
		tabInformation.add(textFieldApellido);
		
		textFieldNombre = new JTextField(studentData.getFirstName());
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(100, 96, 315, 19);
		tabInformation.add(textFieldNombre);
		
		textFieldEmail = new JTextField(studentData.getMail());
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(100, 131, 315, 19);
		tabInformation.add(textFieldEmail);
		
		textFieldGithub = new JTextField(studentData.getGithubURL());
		textFieldGithub.setColumns(10);
		textFieldGithub.setBounds(100, 166, 315, 19);
		tabInformation.add(textFieldGithub);
		contentPane.add(tabbedPane);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource("/images/WIN_20220825_11_16_11_Pro (4).jpg")));
		lblNewLabel.setBounds(445, 32, 250, 224);
		contentPane.add(lblNewLabel);
		
		JLabel labelFechayHora = new JLabel("Esta ventana fue generada el " + fechaActual() + " a las " + horaActual());
		labelFechayHora.setFont(new Font("Tahoma", Font.ITALIC, 12));
		labelFechayHora.setBounds(15, 255, 390, 13);
		contentPane.add(labelFechayHora);
		
		
	}
	
	private String horaActual() {
		LocalTime hora= LocalTime.now();
		
		DateTimeFormatter formatoFechayHora = DateTimeFormatter.ofPattern("HH:mm:ss");

	   return hora.format(formatoFechayHora);
	}
	
	
	private String fechaActual() {
		LocalDate fecha= LocalDate.now();
		
		DateTimeFormatter formatoFechayHora = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	    return fecha.format(formatoFechayHora);
	}
}
