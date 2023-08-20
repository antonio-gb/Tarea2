
class Libro {
    private String titulo;
    private String autor;
    private String ISBN;

    public Libro(String titulo, String autor, String ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    // Getters, Setters y el método toString()...
    protected String getTitulo() {
    	return titulo;
    }
    
    protected void setTitulo(String titulo) {
    	this.titulo = titulo;
    }
    
    protected String getAutor() {
    	return autor;
    }
    
    protected void setAutor(String autor) {
    	this.autor = autor;
    }
    
    protected String getISBN() {
    	return ISBN;
    }
    
    protected void setISBN(String ISBN) {
    	this.ISBN = ISBN;
    }
    
    protected String getLibro() {
    	return titulo + "por " + autor + " - ISBN: " + ISBN;
    }
}