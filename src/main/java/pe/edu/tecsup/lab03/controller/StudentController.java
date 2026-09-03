package pe.edu.tecsup.lab03.controller;

import pe.edu.tecsup.lab03.service.StudentService;

public class StudentController {

    private final StudentService service = new StudentService();

    public void registerStudent(String name) {
        System.out.println("Procesando registro en StudentController para: " + name);
        service.registerStudent(name);
    }
}