package observer.model;

public interface IRestaurant {
    void abonareClient(IClient client);
    void dezabonareClient(IClient client);
    void noticareClient(String mesaj);
}
