package com.hardy.chapter05.section06;

import java.util.Scanner;

/**
 * TODO
 *
 * @author LiuWei
 * @version V1.0.0
 * @Package com.hardy.chapter05.section06
 * @create 2021-02-22 15:20
 */
public class EnumTest
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        Size s = Enum.valueOf(Size.class, inputStr);
        System.out.println("size = " + s);
        System.out.println("info = " + s.getInfo());
        if (s == Size.EXTRA_LARGE) {
            System.out.println("you paid attention to the " + Size.EXTRA_LARGE.getInfo());
        }
    }

}

enum Size{
    SMALL("s"), MIDDLE("m"),LARGE("l"),EXTRA_LARGE("xl");

    private String info;

    private Size(String info) {
        this.info = info;
    }

    public String getInfo() {
        return this.info;
    }
}
