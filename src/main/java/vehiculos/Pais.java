package vehiculos;
import java.util.ArrayList;
public class Pais {
	private String nombre;
	private static ArrayList<Pais> paises = new ArrayList<Pais>();
	private int contador=0;

	public void setContador() {
		contador++;}
	public int getContador() {
		return contador;
	}
	public String getNombre() {
		return nombre;}
	public void setNombre(String nom) {
		nombre=nom;}
	
	public Pais() {}
	public Pais(String nombre) {
		this.nombre = nombre;
		Pais.paises.add(this);}
	
	public static Pais paisMasVendedor() {
		int m=-1;
		for (Pais p:paises) {
			if(p.getContador()>m) {
				Pais v=p;
				m=p.getContador();}
		}
		for (Pais p:paises) {
			if (p.getContador()==m){
				return p;
			}
			return (new Pais());
		}
		return new Pais();}

			
			
		
		
	}
	


