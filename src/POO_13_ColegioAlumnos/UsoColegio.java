package POO_13_ColegioAlumnos;

public class UsoColegio {

	public static void main(String[] args) {
		
		Colegio SanJavier = new Colegio("San Javier", 200);
		Colegio Cervantes = new Colegio("Cervantes", 300);
		
		SanJavier.nuevoAlumno("Juan", 8.5);
		SanJavier.nuevoAlumno("Sara", 9);
		SanJavier.getTodosAlumnos();
		
		Cervantes.nuevoAlumno("Ana", 5);
		Cervantes.nuevoAlumno("Antonio", 7);
		Cervantes.nuevoAlumno("Maria", 3);
		Cervantes.expulsarAlumno("Antonio");
		Cervantes.setNotaMedia("Maria", 8);
		Cervantes.getTodosAlumnos();
	}

}
