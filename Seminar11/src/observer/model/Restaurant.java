package observer.model;

import observer.model.IClient;
import observer.model.IRestaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant {
    private String nume;
    private List<IClient> listaClienti;

    public Restaurant(String nume) {
        this.nume = nume;
        this.listaClienti = new ArrayList<>();
    }

    @Override
    public void abonareClient(IClient client) {
        this.listaClienti.add(client);
    }

    @Override
    public void dezabonareClient(IClient client) {
        this.listaClienti.remove(client);
    }

    @Override
    public void noticareClient(String mesaj) {
        for (IClient client: this.listaClienti) {
            client.primesteNotificare(mesaj);
        }
    }

    public void introduceOfertaNoua() {
        noticareClient(this.nume + " a introdus o oferta noua");
    }

    public void adaugaDiscount(int discount) {
        noticareClient(this.nume + " a introdus un discount de " + discount + "%");
    }
}
