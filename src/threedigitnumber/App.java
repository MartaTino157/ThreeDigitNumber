/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threedigitnumber;

import java.util.Scanner;

/**
 *
 * @author Alice
 */
public class App {
    public void run(){
        System.out.print("Введите любое трехзначное число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Число единиц: " + number%10);
        System.out.println("Число десятков: " + number/10%10);
        System.out.println("Сумма цифр = " + ((number/100)+((number/10)%10)+(number%10)));
    }
}
