import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

import clase.Ayuntamiento;

public class Fichero3Jose {

	public static void main(String[] args) {

		File fichero=new File("/Users/cristinavilas/Desktop/ejercicio.txt");
		String manolo="";
		ArrayList<Ayuntamiento> lista=new ArrayList<Ayuntamiento>();
		
		try{
			Scanner sc=new Scanner (fichero);
			
		
			
			while(sc.hasNextLine())
			{
			/**
			 * Cargamos el archivo al Strin creado
			 */
				
				manolo=sc.nextLine();
				
				
				
			}
			/**
			 * He dividido el fichero en Tokens salvo en la barra baja para no separar el nombre
			 */
			StringTokenizer st=new StringTokenizer(manolo,"[; .%]");
			while(st.hasMoreTokens())
			{
				/**
				 * 
				 * le encuentro la logica al fichero y hago el proceso de añadir personas y nombre de empresa 
				 * cada vez que se encuentre con un nuevo token
				 */
				Ayuntamiento x=new Ayuntamiento();
				x.setPersonas(Integer.parseInt(st.nextToken()));
				x.setNombre(st.nextToken());
				lista.add(x);
				
			}
			
			Collections.sort(lista, new Comparator<Ayuntamiento>() {
				@Override
				/**
				 * Utilizom un comparator para ordenar por el numero de personas que tiene cada ayuntamiento
				 */
				public int compare(Ayuntamiento o1, Ayuntamiento o2) {
					return o2.getPersonas() - o1.getPersonas();
				}
			});
			for(Ayuntamiento y:lista)
			
			{
				/**
				 * El ultimo paso es editar los nombres haciendo un replace por un espacio
				 */
				y.setNombre(y.getNombre().replaceAll("_"," "));
				System.out.println(y);
			}
			
			
			
		
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
