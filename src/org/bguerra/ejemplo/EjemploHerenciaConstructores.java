package org.bguerra.ejemplo;

import org.bguerra.pooherencia.Alumno;
import org.bguerra.pooherencia.AlumnoInternacional;
import org.bguerra.pooherencia.Persona;
import org.bguerra.pooherencia.Profesor;

public class EjemploHerenciaConstructores {
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
        System.out.println("Imprimiendo datos en comun del tipo persona: ");
        System.out.println("Nombre: " + persona.getNombre() + " ,Apellido " + persona.getApellido() +
                " ,Edad: " + persona.getEdad() + " ,Email: " + persona.getEmail());
        if (persona instanceof Alumno) {
            System.out.println("Imprimiendo los datos del tipo Alumno");
            System.out.println("Institucion: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota Matematicas: " + ((Alumno) persona).getNotaMatematicas());
            System.out.println("Nota Historia" + ((Alumno) persona).getNotaMatematicas());
            System.out.println("Nota Castellano: " + ((Alumno) persona).getNotaCastellano());
            if (persona instanceof AlumnoInternacional) {
                System.out.println("Imprimiendo los datos del tipo AlumnoInternacional:");
                System.out.println("Nota idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("========= sobre escritura promedio ==============");
            System.out.println(((Alumno) persona).calcularPromedio());
        }
        if (persona instanceof Profesor) {
            System.out.println("Imprimiendo los datos del tipo Profesor:");
            System.out.println("Asisgnatura: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("========= sobre escritura saludar ==============");
        System.out.println(persona.saludar());
    }
}
