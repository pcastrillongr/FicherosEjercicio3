package clase;

public class Ayuntamiento {
	
	int personas;
	String nombre;
	
	public Ayuntamiento(int personas, String nombre) {
		super();
		this.personas = personas;
		this.nombre = nombre;
	}

	public Ayuntamiento() {
		// TODO Auto-generated constructor stub
	}

	public int getPersonas() {
		return personas;
	}

	public void setPersonas(int personas) {
		this.personas = personas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Ayuntamiento [personas=" + personas + ", nombre=" + nombre + "]";
	}
	
	
	
	

}
