package br.edu.empresa.model;

public class Retangulo {

	private double base;
	private double altura;
	
	public void setBase (double base) {
		this.base = base;
	}
	
	public double getBase(double base ) {
		return this.base = base;
	}
	
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public double CalcularArea() {
		return this.base * this.altura;
		
	}	
	
		public double calcularPerimetro() {
			return 2 *(this.base + this.altura);
		}
}
