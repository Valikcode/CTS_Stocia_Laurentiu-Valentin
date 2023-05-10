package observer.main;

import observer.model.Client;
import observer.model.IClient;
import observer.model.Restaurant;

public class Main {
    public static void main(String[] args) {
        IClient client1 = new Client("Vali");
        IClient client2 = new Client("Gica");
        IClient client3 = new Client("Iusti");

        Restaurant restaurant = new Restaurant("Tratoria");

        restaurant.introduceOfertaNoua();

        restaurant.abonareClient(client1);

        restaurant.adaugaDiscount(25);

        restaurant.abonareClient(client2);
        restaurant.abonareClient(client3);
        restaurant.dezabonareClient(client1);

        restaurant.introduceOfertaNoua();
    }
}