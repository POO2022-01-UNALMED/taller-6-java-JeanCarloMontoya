package vehiculos;

public class Camion extends Vehiculo {
	private int ejes;
	private static int cantidad=0;
	
	public Camion(String placa,String nombre,int precio,int peso,Fabricante f,int ej) {
		super(placa,2,80,nombre,precio,peso,"4X2",f);
		ejes=ej;cantidad++;}
	
	
	public static int getCantidad() {
		return cantidad;}
	
	
	public int getEjes() {
		return ejes;}
	public void setEjes(int ejes) {
		this.ejes = ejes;}
	

}
