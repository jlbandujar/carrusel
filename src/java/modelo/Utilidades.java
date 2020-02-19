/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/**
 *
 * @author Usuario1
 */
public class Utilidades {
    
    	public static ArrayList<String> getArchivos(String sDirectorio) throws IOException{
		ArrayList<String> archivos = new ArrayList<String>();
		
                File dir = new File(sDirectorio);
                String[] ficheros = dir.list();
                if (ficheros != null) { 
                        for (int x=0;x<ficheros.length;x++){
                            if ( ficheros[x].endsWith(".jpg") || ficheros[x].endsWith(".png") ||
                                    ficheros[x].endsWith(".gif") ){
                                String fichero="carrusel"+File.separator+ficheros[x];
                                archivos.add(fichero);
                            }
                        }
                }
		return archivos;		
	}
    
}
