package claseAbstract;

public class EjerciciosAbstraccion {

	 public static void main(String[] args) {
		 
		 	//---Se instancia libroreal junto con su constructor
	        Libro libroreal = new LibroReal("Libro de Mormon", "Jose Smith", 1930, 642);
	        //---Se declara el metodo abstracto para el objeto libroreal
	        libroreal.mostrarInformacion();

	      //---Se instancia librodigital junto con su constructor
	        Libro librodigital = new LibroDigital("Biblia", "Muchas personas", 600, "PDF");
	        //---Se declara el metodo abstracto para el objeto librodigital
	        librodigital.mostrarInformacion();
	    }
	}

	//---Se declara la clase abstracta Libro
	abstract class Libro{
		
		//---Declaracion de atributos de la clase abstracta
	    protected String titulo;
	    protected String autor;
	    protected int anioPublicacion;

	    //---Se crea el constructor de la clase abstracta libro
	    public Libro(String titulo, String autor, int anioPublicacion) {
	        this.titulo = titulo;
	        this.autor = autor;
	        this.anioPublicacion = anioPublicacion;
	    }
	    
	    //---Se crea el metodo abstracto mostrarInformacion para adaptarlo segun nuestras necesidades
	    public abstract void mostrarInformacion();
	}

	//---Se crea la clase libroreal que hereda atributos de la clase abstracta Libro
	class LibroReal extends Libro{
		
		//---Se añade atributo numeroPaginas
	    private int numeroPaginas;

	    //---Se declara el constructor de LibroReal añadiendo el nuevo atributo
	    public LibroReal(String titulo, String autor, int anioPublicacion, int numeroPaginas) {
	        super(titulo, autor, anioPublicacion);
	        this.numeroPaginas = numeroPaginas;
	    }

	    //---Se declara el metodo mostrarinformacion para adaptarlo a esta clase con el atributo numeroPaginas
	    @Override
	    public void mostrarInformacion() {
	        System.out.println("El libro es: ");
	        System.out.println("Titulo: " + titulo);
	        System.out.println("Autor: " + autor);
	        System.out.println("Año de publicación: " +anioPublicacion);
	        System.out.println("Número de páginas: " + numeroPaginas);

	    }
	}

	//---Se crea la clase librodigital que hereda atributos de la clase abstracta Libro
	class LibroDigital extends Libro{
		//---Se añade atributo formato
	    private String formato;

	  //---Se declara el constructor de LibroDigital añadiendo el nuevo atributo
	    public LibroDigital(String titulo, String autor, int anioPublicacion, String formato) {
	        super(titulo, autor, anioPublicacion);
	        this.formato = formato;
	    }

	    //---Se declara el metodo mostrarinformacion para adaptarlo a esta clase con el atributo formato
	    @Override
	    public void mostrarInformacion() {
	        System.out.println("El libro es: ");
	        System.out.println("Titulo: " + titulo);
	        System.out.println("Autor: " + autor);
	        System.out.println("Año de publicación: " +anioPublicacion);
	        System.out.println("Formato: " + formato);

	    }
	}
