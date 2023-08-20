
import java.util.ArrayList;

class AdministradorLibros {
    private ArrayList<Libro> biblioteca = new ArrayList<>();

    // Métodos agregarLibro, eliminarLibroPorISBN, mostrarLibros...
    public void agregarLibro(Libro libro) {
    	biblioteca.add(libro);
    }

    public boolean eliminarLibroPorISBN(String ISBN) {
		boolean eliminar = false;
    	for(Libro libro : biblioteca) {
    		if(libro.getISBN().equals(ISBN)) {
				
    			biblioteca.remove(libro);
				eliminar = true;
				break;
    		}else{
				eliminar = false;

			}

    	}
    	return eliminar;
    	
    }

    public String mostrarLibros() {
    	String libros= null;

		
		if(biblioteca.size() == 0){
			
		}else{
    	for(Libro libro : biblioteca) {
			if(libros == null){
				libros = libro.getLibro() + "\n";
			}else{
    		libros = libros + libro.getLibro() + "\n";
			
		}
    		}
		}
		
    	return libros;
    
	}
}