package v9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class Main
{
    public static void main(String[] args) throws IOException
    {
        // V9 Price objects removed

        Customer who = new Customer("Barack Obama");

        // VNew: Instancia o Preço diretamente no construtor do Filme
        // (Passa 'true' para filmes blue-ray)
        Movie m1 = new Movie("Life of Amalia", new RegularPrice(false));
        Movie m2 = new Movie("Peter Pan", new ChildrensPrice(true)); // <-- Blue-Ray
        Movie m3 = new Movie("Donna del Lago", new NewReleasePrice(false));
        // VNew: Adiciona filme BestPrice
        Movie m4 = new Movie("The Martian", new BestPrice(true)); // <-- BestPrice e Blue-Ray

        who.addRental(new Rental(m1, 1));
        who.addRental(new Rental(m2, 2));
        who.addRental(new Rental(m3, 3));
        who.addRental(new Rental(m4, 4)); // Adiciona novo filme ao aluguer

        System.out.println( who.statement());

        PrintWriter html = new PrintWriter(new FileWriter("webPages/statement.html"));
        html.println(who.htmlStatement());
        html.close();
    }

}