![image](https://github.com/user-attachments/assets/1c4823d8-b735-4dac-8e9a-3279416c4c2f)El programa comienza importando java.util para clases como Scanner, ArrayList, etc, y tambien importamos java.io para clases de salida y entrada de archivos como BufferedWritter, FileWriter, etc. Luego definimos l  a clase principal llamada Biblioteca, creamos dos listas
llamadas "registrousuarios" y "registrolibros" que será en las que respectivamente se almacenaran las entradas del usuario respecto a libros y nombre con ocupación. Luego creamos los archivos en los que se guardaran respectivamente los usuarios y libros
Creamos el objeto scanner dentro de la Clase Scanner para que luego mediante el ciclo do-while, al usuario se le entregue un menú en el que dispondrá de 4 opciones
![image](https://github.com/user-attachments/assets/db7482ee-e707-425a-9259-6e44078bec40)
Después de que el usuario insertara su opción, por medio de la estructura "switch" determinaremos que trozo de código o que método de clase se ejecutará 
![image](https://github.com/user-attachments/assets/7243b6aa-bbdc-4e89-a11b-36c383157d7b)
Método registroUsuario en el que simplemente el scanner lee el input con nuestro nombre seguido de nuestra ocupación
![image](https://github.com/user-attachments/assets/e39b8334-b233-4ee1-b026-e03c23b6609c)
Método registroLibros, igual que el método de arriba  
![image](https://github.com/user-attachments/assets/2d2f7289-ab63-490f-9f42-89e3a0dc2c1f)
Y para finalizar, guardamos en los archivos .txt respectivos (libros y registro de usuarios)
![image](https://github.com/user-attachments/assets/fb87ccca-5bd4-4980-be10-cb676acbe9b8)
Gracias a el ciclo do-while y el "default", el menú seguirá estando disponible para el usuario incluso si este elige una opción inválida o si ya eligió algo, a menos de que el mismo decida cerrarlo




