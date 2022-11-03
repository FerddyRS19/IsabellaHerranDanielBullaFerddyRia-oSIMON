package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Mecanica;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{
	private Mecanica m;
	private View v;
	private String ningresado = "";
	
	public Controller() {
		m = new Mecanica();
		v = new View(this);
		v.setVisible(true);
		funcionar();
	}
	
	public void funcionar() {
		m.generarNumeroAleatorio();
		v.getPanelNumeros().setNaleatorio1(m.getNaleatorio1());
		v.getPanelNumeros().setNaleatorio2(m.getNaleatorio2());
		v.getPanelNumeros().setNaleatorio3(m.getNaleatorio3());
		v.getPanelNumeros().setNaleatorio4(m.getNaleatorio4());
		v.getPanelNumeros().asignarEtiqueta();
		v.borrarNumero();
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getActionCommand().equals(v.getPanelBotones().Numero1)){
			ningresado = ningresado + "1";
			m.setNingresado(ningresado);
			m.probarNumeroMayor();
			if(m.getResultado() == 2) {
				v.mostrarError("Ingeniero, son solo 4 numeros!");
				System.exit(0);
			}
		}
		if(evento.getActionCommand().equals(v.getPanelBotones().Numero2)){
			ningresado = ningresado + "2";
			m.setNingresado(ningresado);
			m.probarNumeroMayor();
			if(m.getResultado() == 2) {
				v.mostrarError("Ingeniero, son solo 4 numeros!");
				System.exit(0);
			}
		}
		if(evento.getActionCommand().equals(v.getPanelBotones().Numero3)){
			ningresado = ningresado + "3";
			m.setNingresado(ningresado);
			m.probarNumeroMayor();
			if(m.getResultado() == 2) {
				v.mostrarError("Ingeniero, son solo 4 numeros!");
				System.exit(0);
			}
		}
		if(evento.getActionCommand().equals(v.getPanelBotones().Numero4)){
			ningresado = ningresado + "4";
			m.setNingresado(ningresado);
			m.probarNumeroMayor();
			if(m.getResultado() == 2) {
				v.mostrarError("Ingeniero, son solo 4 numeros!");
				System.exit(0);
			}
		}
		if(evento.getActionCommand().equals(v.getPanelTerminar().TERMINAR)){
			if(ningresado == "") {
				v.mostrarError("Ingeniero, hay que introducir algo!");
				System.exit(0);
			}
			m.setNingresado(ningresado);
			m.compararNumeros();
			if(m.getResultado() == 1) {
				v.mostrarInformacion("Secuencia exitosa!");
				System.exit(0);
			}else {
				v.mostrarError("Fallaste!");
				System.exit(0);
			}
		}	
	}
	
	
	
	
}
