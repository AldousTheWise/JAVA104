package Modelos;

import interfaces.IActividad;

public class Alumno extends Miembro implements IActividad {
	protected String hobby;
	protected Profesor profesor;

	public Alumno(String nombre, int id, Profesor profesor, String hobby) {
		super(nombre, id);
		this.profesor = profesor;
		this.hobby = hobby;
	}
           
	public String getNombre() { return nombre; }
	public int getId() { return id; }
	public Profesor getProfesor() { return profesor; }
	
	
	@Override
	public void leer() {
		System.out.println(this.nombre + " está leyendo.");
		
	}

	@Override
	public void hacerEjercicio() {
		System.out.println(this.nombre + " está haciendo ejercicios.");
		
	}
	
	@Override
	public String toString() {
		return "Alumno [ nombre = " + this.getNombre() + ", id = " + this.id + ", " + this.profesor + ", hobby = " + this.hobby + " ]";
	}

}
