package logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ManejaArchivo {
	
	private ArrayList<String> file_loaded;
	
	
	
	
	public ManejaArchivo(){
		file_loaded = new ArrayList<String>();
		
	}
	
	/**
	 * Método encargado de cargar el Archivo .chi del código
	 * Lo carga y lo guarda divididio en líneas
	 * 
	 * @param ruta String La ruta del archivo a cargar
	 * @return boolean True si carga el archivo sin problemas, false en caso contrario
	 * 
	 * */
	public boolean cargaArchivo(String ruta){
		try{
			BufferedReader entrada = new BufferedReader(new FileReader(ruta));
			String lectura = "";
			
			while( (lectura = entrada.readLine()) != null ){
				file_loaded.add(lectura);
			}
			entrada.close();
			
			return true;
			
		}catch (IOException e){
			e.printStackTrace();
			return false;
		}

	}
	
	public ArrayList<String> getFileLoaded(){
		return this.file_loaded;
	}
	

}
