package com.company;

import java.util.Scanner;

/* Варіант 3. Клас «Проїздний квиток»
1. Закриті поля класу:
- Номер місця;
- Номер вагону;
- Номер потягу;
Відкриті методи класу:
- Ініціалізація (введення через аргументи функції інформації у поля класу);
- Виведення на екран інформації збереженної в полях.
2. Модернізувати клас таким чином, щоб роботу по ініціалізації даних виконував конструктор.
*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfSit;
        int numOfCarriage;
        int numOfTrain;

        //get info about ticket
        System.out.print("Insert your number of your sit: ");
        numOfSit = scanner.nextInt();

        System.out.print("Insert your number of your carriage: ");
        numOfCarriage = scanner.nextInt();

        System.out.print("Insert your number of your train: ");
        numOfTrain = scanner.nextInt();

        // putting info in Ticket.java
        Ticket ticket = new Ticket(numOfSit, numOfCarriage, numOfTrain);
        //ticket.setTicket(numOfSit, numOfCarriage, numOfTrain);

        //getting info about ticket from Ticket.java
        ticket.printTicket();

        System.out.println(ticket);

    }
}
