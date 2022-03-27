package taller3.televisores;

public class TV {
	private Marca marca;
	public int canal = 1;
	private int precio = 500;
	public boolean estado;
	public int volumen = 1;
	public Control control;
	private static int numTV;
	
	public TV(Marca marca,boolean estado) {
		
		this.marca = marca;
		this.estado = estado;
		
	}
	
	public String getMarca() {
		 return marca.getNombre();
	 }
	public Control getControl() {
		 return control;
	 }
	public int getPrecio() {
		 return precio;
	 }
	public int getVolumen() {
		 return volumen;
	 }
	public int getCanal() {
		 return canal;
	 }
	public void setMarca(Marca marca) {
		 this.marca=marca;
	 }
	public void setControl(Control control) {
		 this.control=control;
	 }
	public void setPrecio(int precio) {
		 this.precio=precio;
	 }
	public void setVolumen(int volumen) {
		if(this.estado==true &&this.volumen >=0 && this.volumen <=120) {
		this.volumen=volumen;
		}
	 }
	public void setCanal(int canal) {
		 if(this.estado==true &&this.canal >=1 && this.canal <=120) {
		 this.canal=canal; 
		 }
	 }
	
	public static int getnumTV() {
		return numTV;
	}
	
	public void turnOn() {
		this.estado = false;
	}
     public void turnOff() {
    	 this.estado = true;
	}
	public boolean getEstado() {
		return estado;
	}

}
