package ru.pereval88;

public class Main {
    public static void main(String[] args) {

        byte varByte0 = 10;
        varByte0 += 116;
        System.out.println(varByte0 + " " + "Byte");
        System.out.println(((byte) (varByte0 + 5) + " " + "Byte false"));

        short varShort = 10;
        varShort += 150;
        System.out.println(varShort + " " + "Shot");

        int varInt = varByte0 * varShort;
        System.out.println(varInt + " " + "Int");

        long varLong = varShort * varByte0 - varInt / 3;
        System.out.println(varLong + " " + "Long");

        double varDouble = 1.14;
        System.out.println(varLong / varDouble + " " + "Double");

        float varFloat = 19.23f;
        System.out.println(varFloat % varDouble + " " + "Float");

    }
}