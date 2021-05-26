package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class FuerzaArmada {

	private List<Vehiculo> convoy;
	private List<Batalla> batallas;
	
	public FuerzaArmada () {
		this.convoy= new ArrayList<>();
		this.batallas= new ArrayList<>();
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		if(this.buscarVehiculo(vehiculo.getId()) == null) {
			this.convoy.add(vehiculo);
		}
	}
	
	public void crearBatalla(String nombre, TipoDeBatalla tipo, double latitud, double longitud) {
		Batalla batalla = new Batalla(nombre, tipo, latitud, longitud);
		this.batallas.add(batalla);
	}
	
	
	public boolean enviarALaBatalla(String nombre, Integer id) {
		Batalla batalla = this.buscarBatalla(nombre);
		Vehiculo vehiculo = this.buscarVehiculo(id);
		
		if(batalla!=null && vehiculo!=null) {
			if(batalla.agregarVehiculo(vehiculo)) {
				return true;
			}
		}
		return false;
	} 
	
	public Batalla getBatalla(String nombre) {
		return this.buscarBatalla(nombre);
	}

	public Integer getCapacidadDeDefensa() {
		return this.convoy.size();
	}
	
	private Batalla buscarBatalla(String nombre) {
		for (Batalla batalla : batallas) {
			if(batalla.getNombre().equals(nombre)) {
				return batalla;
			}
		}
		return null;
	}
	
	private Vehiculo buscarVehiculo(Integer id) {
		for (Vehiculo convoy : convoy) {
			if(convoy.getId().equals(id)) {
				return convoy;
			}
		}
		return null;
	}
	

}
