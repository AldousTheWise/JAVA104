package Modelos;

import interfaces.IActividad;

public class Profesor extends Miembro implements IActividad {
    protected String especialidad;

	
	public Profesor(String nombre, int id, String especialidad) {
		super(nombre, id);
		this.especialidad = especialidad;
	}

	public String getNombre() { return nombre; }
	public int getId() { return id; }
	public String getEspecialidad() { return especialidad; }
	
	public void setNombre(String nombre) { this.nombre = nombre; }
	public void setId(int id) { this.id = id; }
	public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
	
	
	
	@Override
	public void leer() {
	    System.out.println(this.nombre + " está leyendo las tareas de los alumnos.");	
	}

	@Override
	public void hacerEjercicio() {
		System.out.println(this.nombre + " haciendo ejercicios para los alumnos");
	}
	
	@Override
	public String toString() {
		return "Profesor [ nombre = " + this.getNombre() + ", id = " + this.getId() + ", especialidad = " + this.getEspecialidad() + " ]";
	}

}
