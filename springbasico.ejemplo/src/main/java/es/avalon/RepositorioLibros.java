package es.avalon;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.avalon.jpa.negocio.Libro;

@Component
public class RepositorioLibros {
	
	@Autowired
	RepositorioLibros repolibros;
	
	
	
	public RepositorioLibros getLista() {
		ArrayList<Libro> lista = null;
		return repolibros;
		
		
	}

}
