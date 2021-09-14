package ChapterTen;

public class FX {
    public static void main(String[] args) {
        CreditCard cc = new MasterCard();
        System.out.println(cc.someThings(70));

        Fish azu = new Fish();
        VisaCard visaCard = new VisaCard();
        azu.method(2);
    }
}
