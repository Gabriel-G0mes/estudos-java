package entities;

public class Books {
    public String title;
    public String author;
    public String genre;
    public int numberPages;
    public String itRead;

    public String toString() {
        return "--------------------------\n"
                + "NOVO LIVRO ADICIONADO"
                + "\nTítulo: " + title
                + "\nAutor: " + author
                + "\nGênero: " + genre
                + "\nQuantidade de Páginas: " + numberPages
                + "\nJá foi lido? " + itRead
                + "\n--------------------------";
    }
}
