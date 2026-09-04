package pe.edu.tecsup.lab03.repositories;

public class StudentRepository {

    public void save(String name) {
        System.out.println("Guardando estudiante en StudentRepository: " + name);
        System.out.println("Estudiante registrado correctamente.");
    }
}