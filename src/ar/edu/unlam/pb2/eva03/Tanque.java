package ar.edu.unlam.pb2.eva03;

public class Tanque extends Vehiculo implements Terrestre {

	private Double velocidad=0.0;
	
	public Tanque(Integer id, String modelo) {
		super(id, modelo);
	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}

}
