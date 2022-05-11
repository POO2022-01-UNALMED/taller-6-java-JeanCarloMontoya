package vehiculos;

public class Camioneta extends Vehiculo{
	private boolean volco;
	private static int cantidad=0;
	public Camioneta(String placa,int puertas,String nombre,int precio,int peso,Fabricante f,boolean vol) {
		super(placa,puertas,90,nombre,precio,peso,"4X4",f);
		volco=vol;cantidad++;}
	
	public static int getCantidad() {
		return cantidad;}

	
	public boolean isVolco() {
		return volco;}
	public void setVolco(boolean volco) {
		this.volco = volco;}
	

}
