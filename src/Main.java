import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
        int mestovib = 0;
        String fio = "";
        Scanner scan = new Scanner(System.in);
        Object[][] bus = new Object[5][2];

        // Для примера заполнение
        bus[0][0]=1;
        bus[0][1]="Кузнецов Андрей";

        bus[1][0]=1;
        bus[1][1]="Одожий Миша";

        bus[2][0]=1;
        bus[2][1]="Заматевский Данила";

        bus[3][0]=0;
        bus[3][1]="Свободно";

        bus[4][0]=1;
        bus[4][1]="Гречко Артем";



        while (true) {
            System.out.println("\nВыберите действие: 1.забронировать   2.Заменить бронь    3.Информация");
            switch (scan.nextInt()) {

// Бронирование
                case (1):
                    System.out.println("Выберите место: ");
                    mestovib = scan.nextInt() -1;

                    if (bus[mestovib][0].equals(0)) {
                        bus[mestovib][0] = 1;
                        System.out.println("Введите ваше Фио: ");
                        fio = scan.next();
                        bus[mestovib][1] = fio;
                        System.out.println("Место забронировано!");

                    } else {
                        System.out.println("Место занято!");
                    }
                    break;
 // Замена брони
                case (2):
                    System.out.println("Выберите место которое хотите заменить: ");
                    int mestovibz = scan.nextInt() -1;
                    bus[mestovibz][0] = 0;
                    System.out.println("Выберите место которое хотите забронировать: ");
                    mestovib = scan.nextInt()-1;
                    if (bus[mestovib][0].equals(0)) {
                        bus[mestovib][0] = 1;
                        bus[mestovib][1] = bus[mestovibz][1];
                        bus[mestovibz][1] = "Свободно";
                        System.out.println("Место забронировано!");

                    } else
                    {
                        System.out.println("Место занято!");
                    }
                    break;


// Информация
                case (3):
                    int i = 0;
                    int m = 1;
                    while (i<=4)
                    {
                        int j=0;
                        System.out.print("Место: "+m+ " " +bus[i][j] +" ");
                        j =1;
                        System.out.print(bus[i][j]+"\n");
                        i++;
                        m++;
                    }
                    break;
            }
        }
    }catch (Exception e)
        {
            System.out.println("Блин /()_()/ Ошибка");
        }
    }
}