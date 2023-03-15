package org.bguerra.ejemplo;

import org.bguerra.pooherencia.Alumno;
import org.bguerra.pooherencia.AlumnoInternacional;
import org.bguerra.pooherencia.Persona;
import org.bguerra.pooherencia.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {
        //Alumno alumno = new Alumno();
        System.out.println("==========Creando instancia ==============");
        Persona alumno = new Alumno();
        System.out.println("==========Creando instancia ==============");
        Profesor profesor = new Profesor();
        System.out.println("==========Creando instancia ==============");
        Alumno alumno1 = new Alumno();
        System.out.println("==========Creando instancia ==============");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();

        alumno.setNombre("Brian");
        alumno.setApellido("Guerra");
        ((Alumno) alumno).setInstitucion("Instituto Tecnologico de Aguascalientes");

        alumno1.setNombre("Martin");
        alumno1.setApellido("Guerra");
        alumno1.setInstitucion("UPA");
        alumno1.setNotaCastellano(5.5);
        alumno1.setNotaHistoria(6.3);
        alumno1.setNotaMatematicas(4.9);

        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Mexicano");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematicas(6.5);

        profesor.setNombre("Luci");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Matematicas");

        System.out.println("======================================================");
        System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " " + ((Alumno) alumno).getInstitucion());
        System.out.println(alumnoInt.getNombre() + " " + alumnoInt.getInstitucion() + " " + alumnoInt.getPais());
        System.out.println("Profesor: " + profesor.getAsignatura() + ": " +
                profesor.getNombre() + " " + profesor.getApellido());

        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es la clase hija de la clase padre: " + padre);
            clase = clase.getSuperclass();
        }
    }
}
