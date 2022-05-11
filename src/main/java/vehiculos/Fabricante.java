package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	private int contador=0;
	
	public void setContador() {
		contador++;}
	public int getContador() {
		return contador;
	}
	
	public Fabricante() {}
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		Fabricante.fabricantes.add(this);
	}
	public String getNombre() {
		return nombre;}
	public void setNombre(String nom) {
		nombre=nom;}
	
	
	public Pais getPais() {
		return pais;}
	public void setPais(Pais pais) {
		this.pais = pais;}
	
	public static Fabricante fabricaMayorVentas() {
		int m=-1;
		for (Fabricante p:fabricantes) {
			if(p.getContador()>m) {
				Fabricante v=p;
				m=p.getContador();}
		}
		for (Fabricante p:fabricantes) {
			if (p.getContador()==m){
				return p;
			}
			return (new Fabricante());
		}
		return new Fabricante();}
	

	

}
