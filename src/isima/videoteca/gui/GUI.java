package isima.videoteca.gui;

import isima.videoteca.control.Sistema;
import isima.videoteca.negocio.*;

import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class GUI implements ActionListener{

	private JFrame ventana;
	private GridLayout tabla;
	private JMenuBar barraMenu;
	private JMenu menuBusqueda;
	private JMenu menuSalir;
	private JMenuItem jmiNombre;
	private JMenuItem jmiTema;
	private JMenuItem jmiSalir;
	private JPanel panelTema;
	private JComboBox cbTema;
	private JComboBox cbProgramaEducativo;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private TextField tfUsuario;
	private JButton btnRegistrarPrestamo;
	private Sistema sistema;
	public Sistema getSistema(){
		return this.sistema;
	}
	public void setSistema(Sistema sistema){
		this.sistema = sistema;
	}
public void inizializar(){
	ventana = new  JFrame();
	barraMenu = new JMenuBar();
	menuBusqueda = new JMenu("Busqueda");
	menuSalir = new JMenu("Salir");
	jmiNombre = new JMenuItem("Nombre");
	jmiTema = new JMenuItem("Tema");
	jmiSalir = new JMenuItem("Salir del sistema");
	menuBusqueda.add(jmiNombre);
	menuBusqueda.add(jmiTema);
	menuSalir.add(jmiSalir);
	barraMenu.add(menuBusqueda);
	barraMenu.add(menuSalir);
	jmiTema.addActionListener(this);
	jmiSalir.addActionListener(this);
	
	panelTema = new JPanel();
	label1 = new JLabel("Seleccione un tema");
	panelTema.add(label1);
	Object[] elementos = {"Formacion Basica","Automotriz","Salud","Turismo","Electronica y Telecomunicaciones","Comercio y simom"};
	cbTema = new JComboBox(elementos);
	cbProgramaEducativo = new JComboBox();
	panelTema.add(cbTema);
	panelTema.add(cbProgramaEducativo);
	label3 = new JLabel("No. de Usuario");
	panelTema.add(label3);
	label3.setVisible(false);
	tfUsuario =new TextField(10);
	panelTema.add(tfUsuario);
	tfUsuario.setVisible(false);
	btnRegistrarPrestamo= new JButton("Registrar");
	panelTema.add(btnRegistrarPrestamo);
	btnRegistrarPrestamo.setVisible(false);
	btnRegistrarPrestamo.addActionListener(this);
	jmiTema.addActionListener(this);
	
	
	cbProgramaEducativo.setVisible(false);
	cbTema.addActionListener(this);

	
	ventana.setLayout(new GridLayout(0, 1));
	ventana.setJMenuBar(barraMenu);
	ventana.setSize(new Dimension (400,400));
	ventana.setVisible(true);
	}

@Override
public void actionPerformed(ActionEvent arg0) {

	if (arg0.getSource().equals(jmiSalir))
	System.exit(0);

	else if(arg0.getSource().equals(jmiTema)){
		
		ventana.setContentPane(panelTema);
		ventana.setVisible(true);
	}else if (arg0.getActionCommand().equals(cbProgramaEducativo)){
		if(arg0.getActionCommand().equals("ComboBoxCharged")){
			label3.setVisible(true);
			tfUsuario.setVisible(true);
			btnRegistrarPrestamo.setVisible(true);
			ventana.setVisible(true);
		}
	}
	else if(arg0.getSource().equals(btnRegistrarPrestamo)){
		int noUsuario = new Integer(tfUsuario.getText()).intValue();
		Usuario usuario = new Usuario();
		usuario.setClave(noUsuario);
		ProgramaEducativo pe =new ProgramaEducativo();
		pe.setNombre ((String)cbProgramaEducativo.getSelectedItem());
		Prestamo prestamo = new Prestamo();
		prestamo.setFecha(Calendar.getInstance());
		prestamo.setUsuario(usuario);
		prestamo.setProgramaEducativo(pe);
		prestamo.setNumeroPrestamo(1);
		sistema.registroPrestamo(prestamo);
	}
}


private Tema obtenerTema(String nombre){
Tema tema = new Tema();

if(nombre.equals("Formacion Basica")){
tema.setClave(1);
tema.setNombre("Formacion Basica");
}
else if (nombre.equals("Automotriz")){
	tema.setClave(2);
	tema.setNombre("Automotriz");
}	
else if (nombre.equals("Salud")){
	tema.setClave(3);
	tema.setNombre("Salud");
}
else if (nombre.equals("Turismo")){
		tema.setClave(4);
		tema.setNombre("Turismo");
}
else if (nombre.equals("Electronica y Telecomunicaciones")){
	tema.setClave(5);
	tema.setNombre("Electronica y Telecomunicaciones");
}
else if (nombre.equals("Comercio y Administracion")){
	tema.setClave(6);
	tema.setNombre("Comercio y Administracion");
}

return tema;
}
	




}









