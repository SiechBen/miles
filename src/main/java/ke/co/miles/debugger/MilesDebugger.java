/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.miles.debugger;

/**
 *
 * @author siech
 */
public class MilesDebugger {

    public static void debug(int object) {

        System.out.println("<<----------------------------------------------------------->>");
        System.out.println(object);
        System.out.println("<<----------------------------------------------------------->>");
    }

    public static void debug(Integer object) {

        System.out.println("<<----------------------------------------------------------->>");
        System.out.println(object);
        System.out.println("<<----------------------------------------------------------->>");
    }

    public static void debug(String object) {

        System.out.println("<<----------------------------------------------------------->>");
        System.out.println(object);
        System.out.println("<<----------------------------------------------------------->>");
    }

    public static void debug(float object) {

        System.out.println("<<----------------------------------------------------------->>");
        System.out.println(object);
        System.out.println("<<----------------------------------------------------------->>");
    }

    public static void debug(Float object) {

        System.out.println("<<----------------------------------------------------------->>");
        System.out.println(object);
        System.out.println("<<----------------------------------------------------------->>");
    }

    public static void debug(Number object) {

        System.out.println("<<----------------------------------------------------------->>");
        System.out.println(object);
        System.out.println("<<----------------------------------------------------------->>");
    }

    public static void debug(double object) {

        System.out.println("<<----------------------------------------------------------->>");
        System.out.println(object);
        System.out.println("<<----------------------------------------------------------->>");
    }

    public static void debug(Double object) {

        System.out.println("<<----------------------------------------------------------->>");
        System.out.println(object);
        System.out.println("<<----------------------------------------------------------->>");
    }

    public static void debug(boolean object) {

        System.out.println("<<----------------------------------------------------------->>");
        System.out.println(object);
        System.out.println("<<----------------------------------------------------------->>");
    }

    public static void debug(Boolean object) {

        System.out.println("<<----------------------------------------------------------->>");
        System.out.println(object);
        System.out.println("<<----------------------------------------------------------->>");
    }

    public static void debug(Object object) {

        System.out.println("<<----------------------------------------------------------->>");
        System.out.println(object);
        System.out.println("<<----------------------------------------------------------->>");
    }

    public static void debug(Throwable object) {

        System.out.println("<<----------------------------------------------------------->>");
        System.out.println(object);
        System.out.println("<<----------------------------------------------------------->>");
    }

    public static void debug(Object... objects) {

        for (Object object : objects) {
            debug(object);
        }
    }

}
