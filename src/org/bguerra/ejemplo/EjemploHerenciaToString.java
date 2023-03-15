package org.bguerra.ejemplo;

import org.bguerra.pooherencia.Alumno;
import org.bguerra.pooherencia.AlumnoInternacional;
import org.bguerra.pooherencia.Persona;
import org.bguerra.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {
        //Alumno alumno = new Alumno();
        System.out.println("==========Creando instancia ==============");
        Alumno alumno = new Alumno("Brian", "Guerra", 26, "Instituto de Aguascalientes");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematicas(4.9);
        alumno.setEmail("Brian@correo.com");
        System.out.println("==========Creando instancia ==============");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Intututo de Mexico");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematicas(6.5);
        alumnoInt.setEmail("Peter@correo.com");
        System.out.println("==========Creando instancia ==============");
        Profesor profesor = new Profesor("Luci", "Perez", "Matematicas");
        profesor.setEdad(37);
        profesor.setEmail("profesor.luci@colegio.com");


        System.out.println("======================================================");
        imprimir(alumno);
        System.out.println("======================================================");
        imprimir(alumnoInt);
        System.out.println("======================================================");
        imprimir(profesor);
    }

    public static void imprimir(Persona persona) {
        System.out.println(persona);
    }
}
