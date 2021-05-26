package ar.edu.unlam.pb2.eva03;

public class Vehiculo {
	
	private Integer id;
	private String modelo;

	public Vehiculo(Integer id, String modelo) {
		this.id=id;
		this.modelo=modelo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setMarca(String modelo) {
		this.modelo = modelo;
	}
	
}
