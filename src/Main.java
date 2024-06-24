
public class Main {
    public static void main(String[] args) {
        //Задание 2
        //tarberak 1

        int inBalance = 100; //у клиента на счету //current balance
        int rechargeInBalance = 1100;// Сумма пополнения

        int bonus;
        if (rechargeInBalance > 1000) {
            bonus = 1100 / 100;
        } else {
            bonus = 0;
        }
        int totalBalance = inBalance + rechargeInBalance + bonus;
        System.out.println("Итоговый счёт клиента " + totalBalance + " руб.");
        System.out.println("Бонусные рубли " + bonus + " руб.");
        // կամ
        //tarberak 2

        int balance = 100;
        int addedAmount = 1100;


        if (addedAmount + balance < 1000) {
            bonus = addedAmount / 100;
        }
        if (addedAmount + balance < 1000) {
            bonus = 0;

        }
        int clientBalance = balance + bonus + addedAmount;
        System.out.println("Итоговый счёт клиента:" + clientBalance);


        //Задание 1

        int inTicket = 20500; // Стоимость билета
        int miles = 20500 / 20;

        System.out.println("Количество миль " +   miles);

        }
    }



