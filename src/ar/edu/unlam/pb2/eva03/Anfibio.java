package ar.edu.unlam.pb2.eva03;

public class Anfibio extends Vehiculo implements Acuatico, Terrestre {
	
	private Double velocidad=0.0;
	private Double profundidad=0.0;
	
	public Anfibio(Integer id,String modelo) {
		super(id, modelo);
	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

}
