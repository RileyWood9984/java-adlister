import java.util.ArrayList;
public class BeanTest {
    public static void main(String[] args){
        Album album1 = new Album(1,"bingus","boingus",9999,20.2, "transendence");
        Album album2 = new Album(2,"yingus","gus",9996,20.6, "transendence");
        Album album3 = new Album(3,"tingus","boi",9990,27.2, "transendence");
        ArrayList<Album> albums= new ArrayList<>();
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);

        Author author1 = new Author(1,"Yelvis","Screamly");
        Author author2 = new Author(2,"Manish","Danish");
        Author author3 = new Author(3,"Writer","Spokenly");
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(author1);
        authors.add(author2);
        authors.add(author3);

        Quotes quote1 = new Quotes(1, author1,"YOU AINT NOTHING BUT A HOUND DOG!");
        Quotes quote2 =new Quotes(2,author2,"Canish, panish then vanish.");
        Quotes quote3 =new Quotes(3, author3,"Eloquently spoke gibberish, is profoundly unintelligible.");
        ArrayList<Quotes> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);

        for(Album album:albums){
            System.out.println(album.toString());
        }
        for(Author author:authors){
            System.out.println(author.toString());
        }for(Quotes quote:quotes){
            System.out.println(quote.toString());
        }
    }
}
