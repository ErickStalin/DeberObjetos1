import java.util.Scanner;

public class DeberObjetos1 {

    public static void main(String[] args) {
        String autor, genero, titulo;
        int anio, nroPaginas;
        Scanner entrada = new Scanner(System.in);
        libros libro1 = new libros();
        System.out.print("Ingrese autor del libro: ");
        autor = entrada.nextLine();
        libro1.setAutor(autor);
        System.out.print("\nIngrese el genero del libro: ");
        genero = entrada.nextLine();
        libro1.setGenero(genero);
        System.out.print("\nIngrese el titulo del libro: ");
        titulo = entrada.nextLine();
        libro1.setTitulo(titulo);
        System.out.print("\nIngrese la año en que se escribio el libro: ");
        anio = entrada.nextInt();
        libro1.setAnio(anio);
        System.out.print("\nIngrese el numero de paginas del libro: ");
        nroPaginas = entrada.nextInt();
        libro1.setNroPaginas(nroPaginas);
        System.out.print("\nDATOS DEL LIBRO");
        System.out.println("\nAUTOR: " + libro1.getAutor());
        System.out.println("\nGENERO: " + libro1.getGenero());
        System.out.println("\nTITULO: " + libro1.getTitulo());
        System.out.println("\nAÑO: " + libro1.getAnio());
        System.out.println("\nNUMERO DE PAGINAS: " + libro1.getNroPaginas());
    }
}