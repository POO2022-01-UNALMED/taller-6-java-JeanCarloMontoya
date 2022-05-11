package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	private static int cantidad=0;
	
	public Automovil(String placa,String nombre,int precio,int peso,Fabricante f,int asientos) {
		super(placa,4,100,nombre,precio,peso,"FWD",f);
		puestos=asientos;
		cantidad++;}
	public static int getCantidad() {
		return cantidad;}
	
	
	public int getPuestos() {
		return puestos;}
	public void setPuestos(int puestos) {
		this.puestos = puestos;}
	
	

}
