package ChapterNine;

public class CreditCardInformation extends BillingInformation{

    private int cardCVV;
    private int CardExpirationMonth;
    private int cardExpirationYear;
    private int cardCardNumber;
    private String cardName;
    private String CardType;

    public enum CardType{MASTERCARD, VISA_CARD, VERVE, AMERICA_EXPRESS}

}
