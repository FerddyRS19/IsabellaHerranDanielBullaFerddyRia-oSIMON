package co.edu.unbosque.model;

import java.util.Random;

public class Mecanica {
	
	private int naleatorio1;
	private int naleatorio2;
	private int naleatorio3;
	private int naleatorio4;
	private int resultado;
	private String ngenerado = "";
	private String ningresado = "";
	
	public Mecanica() {
		
	}
	
	public void generarNumeroAleatorio() {
		Random numale = new Random();
		naleatorio1 = numale.nextInt(4)+1;
		naleatorio2 = numale.nextInt(4)+1;
		naleatorio3 = numale.nextInt(4)+1;
		naleatorio4 = numale.nextInt(4)+1;
		ngenerado = String.valueOf(naleatorio1) + String.valueOf(naleatorio2) + String.valueOf(naleatorio3) + String.valueOf(naleatorio4);
	}
	
	public void probarNumeroMayor() {
		if(Integer.parseInt(ningresado) > 4444) {
			resultado = 2;
		}
	}
	
	public void compararNumeros() {
		if(Integer.parseInt(ningresado) == Integer.parseInt(ngenerado)) {
			resultado = 1;
		}else {
			resultado = 0;
		}
	}

	public int getNaleatorio1() {
		return naleatorio1;
	}

	public void setNaleatorio1(int naleatorio1) {
		this.naleatorio1 = naleatorio1;
	}

	public int getNaleatorio2() {
		return naleatorio2;
	}

	public void setNaleatorio2(int naleatorio2) {
		this.naleatorio2 = naleatorio2;
	}

	public int getNaleatorio3() {
		return naleatorio3;
	}

	public void setNaleatorio3(int naleatorio3) {
		this.naleatorio3 = naleatorio3;
	}

	public int getNaleatorio4() {
		return naleatorio4;
	}

	public void setNaleatorio4(int naleatorio4) {
		this.naleatorio4 = naleatorio4;
	}

	public String getNgenerado() {
		return ngenerado;
	}

	public void setNgenerado(String ngenerado) {
		this.ngenerado = ngenerado;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public String getNingresado() {
		return ningresado;
	}

	public void setNingresado(String ningresado) {
		this.ningresado = ningresado;
	}
	
}
