package com.hardy.chapter05.section07;

import java.util.Scanner;

/**
 * TODO
 *
 * @author LiuWei
 * @version V1.0.0
 * @Package com.hardy.chapter05.section07
 * @create 2021-02-22 16:41
 */
public class ReflectionTest
{
    public static void main(String[] args)
    {
        String class_name;
        if (args.length != 0) {
            class_name = args[0];
        } else {
            System.out.println("please input the name of class (e.g. java.util.Date) ");
            Scanner scanner = new Scanner(System.in);
            class_name = scanner.nextLine();
        }

        try {
            Class clazz = Class.forName(class_name);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
