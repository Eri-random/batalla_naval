package ar.edu.unlam.pb2.eva03;

import java.util.LinkedList;
import java.util.List;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class Batalla {
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	private String nombre;
	private List<Vehiculo> vehiculosEnLaBatalla;

	public Batalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.latitud = latitud;
		this.longitud = longitud;
		this.vehiculosEnLaBatalla = new LinkedList<>();
	}

	public boolean agregarVehiculo(Vehiculo vehiculo) {
		if (this.tipo.equals(TipoDeBatalla.TERRESTRE)) {
			if (vehiculo instanceof Terrestre) {
				this.vehiculosEnLaBatalla.add(vehiculo);
				return true;
			}
		}
		if (this.tipo.equals(TipoDeBatalla.NAVAL)) {
			if (vehiculo instanceof Acuatico) {
				this.vehiculosEnLaBatalla.add(vehiculo);
				return true;
			}
		}

		if (this.tipo.equals(TipoDeBatalla.AEREA)) {
			if (vehiculo instanceof Volador) {
				this.vehiculosEnLaBatalla.add(vehiculo);
				return true;
			}
		}
		return false;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public TipoDeBatalla getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
