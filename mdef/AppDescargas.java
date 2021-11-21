package mdef;

import static mdef.Utils.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import civil.externo.Library;

public class AppDescargas {

	public static void main(String[] args) {
		Pelicula pelicula1 = new Pelicula("1", "Terminator");
		Pelicula pelicula2 = new Pelicula("2", "Terminator 2");
		Fichero fichero1 = new Fichero(800, pelicula1);
		Libro libro = new Libro("977878-476-3", "Don Quijote");
		
		Collection<Fichero> ficheros = new ArrayList<>();
		ficheros.add(new Fichero(2000, pelicula2));
		ficheros.add(fichero1);
		ficheros.add(new Fichero(30, libro));
		
		List<Fichero> listaFicheros = (List<Fichero>)ficheros;
		Conexion conexion = new Conexion(2);
//		System.out.println(emitirInforme(listaFicheros, conexion));
		
		Library libreria = new Library();
		libreria.addContent(libro);
		libreria.addContent(pelicula1);
		
		System.out.println(libreria.getContents());
		
		pelicula1.setDirector(new Director(13210, "Cameron"));
		
//		pelicula1.setActores(new NombrableImpl[2]);
//		pelicula1.getActores()[0] = new Actor("Juan");
//		pelicula1.getActores()[1] = new Actor("Pepe");
		
//		pelicula1.setActores(new NombrableImpl[] { new Actor("Juan"), new Actor("Pepe") });
		
		pelicula1.setActores(new Actor(1351, "Juan"), new Actor(253, "Pepe"));
		
		System.out.println(pelicula1.getDetalleObra());
		
		// Imprimo los participantes para ver el id Integer
		pelicula1.getParticipantes().forEach(System.out::println);
	}
	
}
