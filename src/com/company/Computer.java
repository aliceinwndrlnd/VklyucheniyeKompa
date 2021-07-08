package com.company;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    int cpu;
    int ram;
    int hardd;
    int cycle;

    public void description() {
        System.out.println("Характеристики компьютера (CPU,RAM,size of HARD disk, count of life cycle): " + cpu + "," + ram + "," + hardd + "," + cycle);
    }

    public void switchon() {
        Random rnd = new Random();
        int onn = rnd.nextInt(2);
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число от 0 до 1");
        int on = scan.nextInt();
        if (on == onn) {
            System.out.println("Компьютер включился");
        } else if (on != onn) {
            System.out.println("Компьютер сгорел");
        }
    }


    public void switchoff() {
        Random rnd = new Random();
        int of = rnd.nextInt(2);
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число от 0 до 1");
        int off = scan.nextInt();
        if (off == of) {
            System.out.println("Компьютер выключился");
        } else if (off != of){
            System.out.println("Компьютер сгорел");}

    }
    public void lifecycle (int cycle) {
        if (cycle > 1000) {
            System.out.println("Компьютер сгорел, превышен лимит ресурса");
        }
    }
}

