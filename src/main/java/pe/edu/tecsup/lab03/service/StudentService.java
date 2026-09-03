package pe.edu.tecsup.lab03.service;

import pe.edu.tecsup.lab03.repositories.StudentRepository;

public class StudentService {

    private final StudentRepository repository = new StudentRepository();

    // Método principal del Service
    public void registerStudent(String name) {
        System.out.println("Procesando registro en StudentService para: " + name);
        repository.save(name);
    }
}