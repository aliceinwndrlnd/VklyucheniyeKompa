package com.company;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    int cpu;
    int ram;
    int hardd;
    int cycle;
    boolean worked = true;

    public void description() {
        System.out.println("Характеристики компьютера (CPU,RAM,size of HARD disk, count of life cycle): " + cpu + "," + ram + "," + hardd + "," + cycle);
    }

    public void switchon() {
        if (cycle <= 0 || !worked) {
            System.out.println("Компьютеру конец!");
            return;
        }
        System.out.println("Попробуйте включить компьютер. Введите число от 0 до 1");
        Scanner scan = new Scanner(System.in);
        int on = scan.nextInt();
        Random rnd = new Random();
        int onn = rnd.nextInt(2);
        System.out.println("Выпало число " + onn);
        if (on == onn) {
            System.out.println("Компьютер включился");
        } else if (on != onn) {
            System.out.println("Компьютер сгорел");
            worked = false;
        }
        cycle--;
    }


    public void switchoff() {
        if (cycle <= 0 || !worked) {
            System.out.println("Компьютеру конец!");
            return;
        }
        System.out.println("Попробуйте выключить компьютер.Введите число от 0 до 1");
        Scanner scan = new Scanner(System.in);
        int off = scan.nextInt();
        Random rnd = new Random();
        int of = rnd.nextInt(2);
        System.out.println("Выпало число " + of);
        if (off == of) {
            System.out.println("Компьютер выключился");
        } else if (off != of) {
            System.out.println("Компьютер сгорел");
            worked = false;
        }
        cycle--;
    }
}

