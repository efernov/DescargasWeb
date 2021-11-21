package mdef;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Utils {

//	private static final Comparator<Fichero> COMPARADOR_ID = new Comparator<Fichero>() {
//
//		@Override
//		public int compare(Fichero f1, Fichero f2) {
//			return f1.getObra().getId().compareTo(f2.getObra().getId()) ;
//		}
//		
//	};
	
	public static float sumaMegas(Collection<Fichero> ficheros) {
		float acumulador = 0;
		for (Fichero fichero : ficheros) {
			acumulador += fichero.getTamano();			
		}
		
		return acumulador;
	}
	
	public static float sumaMegas(Fichero[] ficheros) { 
		return sumaMegas(Arrays.asList(ficheros));
	}
	
//	public static String emitirInforme(List<Fichero> listaFicheros, Conexion conexion) {
//		String informe = "Lista ordenada por id:";
//		listaFicheros.sort(COMPARADOR_ID);
//		for (Fichero fichero : listaFicheros) {
//			informe += System.lineSeparator() + fichero.toString();
//		}
//		float megasTotales = sumaMegas(listaFicheros);
//		informe += System.lineSeparator() + "Tamaño total: " + megasTotales + " MB";
//		informe += System.lineSeparator() + "Tiempo de descarga: " + conexion.tiempoDeDescarga(megasTotales) + " s";
//		
//		return informe;
//	}
	
}
