package pe.edu.tecsup.lab03.service;

import pe.edu.tecsup.lab03.repository.StudentRepository;
import java.util.List;

public class StudentService {
    private final StudentRepository repository = new StudentRepository();

    public void addStudent(String studentName) {
        if (studentName == null || studentName.isBlank()) {
            throw new IllegalArgumentException("El nombre del estudiante no puede estar vacío.");
        }
        repository.save(studentName);
    }

    public List<String> getAllStudents() {
        return repository.findAll();
    }
}