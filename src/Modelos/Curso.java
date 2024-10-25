package Modelos;

import java.util.ArrayList;
import java.util.List;
import interfaces.IActividad;

public class Curso {

	
	/* Se utiliza como parámetro la interfaz IActividad en List<> como un factor
	 * común entre las clases Profesor y Alumno, las cuales deben ser
	 * integradas dentro List<IActividad> integrantes. */
	private List<IActividad> integrantes;
	
	public Curso() { integrantes = new ArrayList<>(); }
	
	/* Método que agrega integrantes al curso */
	public void agregarIntegrante(IActividad integrante) {
		integrantes.add(integrante);
	}
	
	public void listarIntegrantes() {
		for (IActividad integrante : integrantes) {
			System.out.println(integrante.toString());
		}
	}		
}
