package Card;

/*
1. Создать класс CreditCard с полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке.
Напишите программу, которая создает три объекта класса CreditCard y которых заданы номер счета и начальная сумма
Тестовый сценарий для проверки:
Положите деньги на первые две карточки и снимите с третьей.
Выведите на экран текущее состояние всех трех карточек.
*/

public class CreditCard {


    public int accauntnumber;

    public int curentsumm;
    public int initialsumm;

    public CreditCard(int accauntnumber,int initialsumm)
    {
        this.initialsumm=initialsumm;
        this.accauntnumber=accauntnumber;
        this.curentsumm=curentsumm;
    }

    public void minusCurentSumm(int maney )
    {
       this.curentsumm = this.initialsumm - maney;
       System.out.println("Сняты денежные средства в размере"+ maney);
    }

    public void plusCurentSumm(int maney )
    {
        this.curentsumm = this.initialsumm + maney;
        System.out.println("Начислены денежные средства в размере"+ maney);
    }
    public void NowCardInformayion()
    {
        System.out.println("Текущая информация о карте " + accauntnumber + " " + this.curentsumm);
    }

}