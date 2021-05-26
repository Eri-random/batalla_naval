package ar.edu.unlam.pb2.eva03;

public class Camion extends Vehiculo implements Terrestre{

	private Double velocidad=0.0;
	
	public Camion (Integer id, String modelo) {
		super(id, modelo);
	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}
}
