package vehiculos;


public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private  static int cantidadVehiculos=0;
	
	public Vehiculo(String pl,int puer,int vel,String nom,int pre,int pes,String tracc,Fabricante f) {
		placa=pl; puertas=puer; velocidadMaxima=vel; nombre=nom; precio=pre;
		peso=pes; traccion=tracc; fabricante=f;
		cantidadVehiculos++;
		f.setContador();
		f.getPais().setContador();}

	public static void setCantidadVehiculos(int s){
		cantidadVehiculos=s;}
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;}
	
	public static String vehiculosPorTipo() {
		return "Automoviles: "+Automovil.getCantidad()+"\n" + 
				"Camionetas: "+Camion.getCantidad()+"\n" + 
				"Camiones: "+Camion.getCantidad();}
	public String getPlaca() {
		return placa;}
	public void setPlaca(String placa) {
		this.placa = placa;}

	
	public int getPuertas() {
		return puertas;}
	public void setPuertas(int puertas) {
		this.puertas = puertas;}

	
	public int getVelocidadMaxima() {
		return velocidadMaxima;}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;}

	
	public String getNombre() {
		return nombre;}
	public void setNombre(String nombre) {
		this.nombre = nombre;}

	
	public int getPrecio() {
		return precio;}
	public void setPrecio(int precio) {
		this.precio = precio;}

	
	public int getPeso() {
		return peso;}
	public void setPeso(int peso) {
		this.peso = peso;}

	
	public String getTraccion() {
		return traccion;}
	public void setTraccion(String traccion) {
		this.traccion = traccion;}

	
	public Fabricante getFabricante() {
		return fabricante;}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;}
	
	
	




}
