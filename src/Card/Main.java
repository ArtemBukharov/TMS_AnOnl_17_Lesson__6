package Card;

import Card.CreditCard;

public class Main {

    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(123123,100);
        CreditCard card2 = new CreditCard(456456,200);
        CreditCard card3 = new CreditCard(789789,300);

card1.minusCurentSumm(20);
        card2.plusCurentSumm(50);
        card3.minusCurentSumm(100);
        card1.NowCardInformayion();
        card2.NowCardInformayion();
        card3.NowCardInformayion();
    }
}