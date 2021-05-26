package ar.edu.unlam.pb2.eva03;

public class Portaviones extends Vehiculo implements Acuatico {
	
	private Double profundidad=0.0;
	
	public Portaviones(Integer id, String modelo) {
		super(id, modelo);
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

}
