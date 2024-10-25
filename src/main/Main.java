package main;

import Modelos.Alumno;
import Modelos.Curso;
import Modelos.Profesor;

public class Main {

	public static void main(String[] args) {
	    Profesor profesor = new Profesor("Darío Valenzuela", 101, "Programación");
        
	    Alumno alumno1 = new Alumno("Tomás Bravo", 201, profesor, "Ser lindo y ayudar a los compañeros" );
	    Alumno alumno2 = new Alumno("Felipe Villegas", 202, profesor, "Aumentar la moral");
	    Alumno alumno3 = new Alumno("Lorena Moreno", 203, profesor, "Ser el brazo operativo");
	    
	    Curso java063 = new Curso();
	    java063.agregarIntegrante(profesor);
	    java063.agregarIntegrante(alumno1);
	    java063.agregarIntegrante(alumno2);
	    java063.agregarIntegrante(alumno3);
	    
	    System.out.println("El curso está compuesto por: ");
	    java063.listarIntegrantes();
	}

}
