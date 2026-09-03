package pe.edu.tecsup.lab03.repositories;

public class StudentRepository {

    public void save(String name) {
        System.out.println("Estudiante guardado en StudentRepository: " + name);
    }

    public void update(String name) {
        System.out.println("Estudiante actualizado en StudentRepository: " + name);
    }
}