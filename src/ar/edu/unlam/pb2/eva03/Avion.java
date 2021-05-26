package ar.edu.unlam.pb2.eva03;

public class Avion extends Vehiculo implements Volador {

	private Double altura=0.0;
	
	public Avion (Integer id, String modelo){
		super(id, modelo);
	}

	@Override
	public Double getAltura() {
		return this.altura;
	}


}
