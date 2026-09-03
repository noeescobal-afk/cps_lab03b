package pe.edu.tecsup.lab03.controller;

import pe.edu.tecsup.lab03.service.StudentService;

public class StudentController {

    private final StudentService service = new StudentService();

    public void registerStudent(String name) {
        System.out.println("Procesando registro en StudentController para: " + name);
        service.registerStudent(name);
    }

    public boolean validateAndRegister(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Nombre invalido en StudentController");
            return false;
        }
        registerStudent(name);
        return true;
    }
}