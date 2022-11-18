package POO_13_ColegioAlumnos;

public class Alumno {
   
	private Colegio nombreColegio;
	private String nombreAlumno;
	private double notaMedia;
	private static int numeroAlumno = 1;
	private int nAlumno;
		
	//constructor
	public Alumno(Colegio nombreColegio, String nombreAlumno, double notaMedia) {		
		this.nombreColegio = nombreColegio;
		this.nombreAlumno = nombreAlumno;
		this.notaMedia = notaMedia;
		this.nAlumno = numeroAlumno;
		numeroAlumno++;
	}

	// metodos accesores
	protected void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}


	public String getNombreColegioAlumno() {
		return this.nombreColegio.getNombreColegio();
	}

	protected String getNombreAlumno() {
		return nombreAlumno;
	}

	@Override
	public String toString() {
		return "Nombre alumno: " + nombreAlumno +"\nColegio: " + this.getNombreColegioAlumno() +"\nNº alumno: " +
	            nAlumno + "\nNota media: " + notaMedia;
	}
	

	
 

	

	
	
	
	
	
	
}
