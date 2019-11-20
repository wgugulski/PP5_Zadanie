package pl.krakow.uek.pp5.jkan.creditcardapp.model;

public interface CreditCardStorage {
    void add(CreditCard card);

    CreditCard load(String creditCardNumber);
}
