package ar.edu.unlam.pb2.eva03;

public class HidroAvion extends Vehiculo implements Volador, Acuatico {
	
	private Double profundidad=0.0;
	private Double altura=0.0;

	public HidroAvion(Integer id, String modelo) {
		super(id, modelo);
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

	@Override
	public Double getAltura() {
		return this.altura;
	}
}
