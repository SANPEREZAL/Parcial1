/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

import java.util.*;
import java.io.*;

public class Biblioteca {

    static List<String> registrousuario = new ArrayList<>();
    static List<String> registrolibros = new ArrayList<>();
    static String[] libros = {"Ciencias", "Matematicas", "Literatura"};
    static File archivo1 = new File("usuarios.txt");
    static File archivo2 = new File("libros.txt");
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Bienvenido a la biblioteca POO");
            System.out.println("1. Registrar nuevo usuario");
            System.out.println("2. Registrar nuevos libros");
            System.out.println("3. Ver categorias de libros");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1 :
                    registroUsuario(scanner);
                    break;
                case 2 :
                    registroLibros(scanner);
                case 3 :
                    System.out.println("Las categorias de libros son: Ciencias, Literatura, Matematicas");
                default:
                    System.out.println("Opcion no valida.");    
            }
        } while ( opcion !=4 );
    }
    
    static void registroUsuario(Scanner scanner) {
        System.out.println("Escriba su nombre y su cargo (estudiante o profesor):");
        scanner.next();
        scanner.nextLine();
        }
    }
     
    static void registroLibros(Scanner scanner) {
        System.out.println("Escriba el nombre de su libro:");
        if (registrolibros.isEmpty()) {
            System.out.println("No hay libros regitrados.");
        } else {
            System.out.println("Libros registrados");
            for (String p : registrolibros) {
                System.out.println(p);
            }
        }
    }
    
    static void guardarUsuario(String usuario) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo1, true))) {
            writer.write(usuario);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar usuario.");
        }
    }
    
    static void guardarLibro(String libro) {
        try (BufferedWriter writer1 = new BufferedWriter(new FileWriter (archivo2, true))) {
            writer1.write(libro);
            writer1.newLine();
        } catch (IOExpection e) {
            System.out.println("Error al guardar libro.");
        
    }
}





