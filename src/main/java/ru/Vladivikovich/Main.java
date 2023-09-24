package ru.vladivikovich;

public class Main {
    public static void main(String[] args) {
        String str = "Hi teacher";
        boolean trueB = true;
        boolean falseB = false;
        byte maxB = Byte.MAX_VALUE;
        byte minB = Byte.MIN_VALUE;
        short maxS = Short.MAX_VALUE;
        short minS = Short.MIN_VALUE;
        int maxI = Integer.MAX_VALUE;
        int minI = Integer.MIN_VALUE;
        long maxL = Long.MAX_VALUE;
        long minL = Long.MIN_VALUE;
        float maxF = Float.MAX_VALUE;
        float minF = Float.MIN_VALUE;
        double maxD = Double.MAX_VALUE;
        double minD = Double.MIN_VALUE;





        System.out.println("maxInteger + minInteger = " + (maxI + minI));
        System.out.println("maxShort + minShort = " + (maxS + minS));
        System.out.println("maxInteger * minFloat = " + (maxI * minF));
        System.out.println("maxLong / minInt = " + (maxL / minI));
        System.out.println("maxInteger % minInteger = " + (maxI % minI));
        System.out.println("maxInt - minDouble =" + (maxI + minD));
        System.out.println("minInt - manDouble =" + (minI - maxD));
        System.out.println("maxFloat - minLong = " + (maxF - minL));
        System.out.println("minDouble - maxFloat = " + (minD - maxF));
        System.out.println("String: " + (str + " ;)"));

        System.out.println("Overflow: " + (byte) (maxB + 1));
        System.out.println("Overflow: " + (byte) (minB - 1));

        System.out.println("True || False = " + (trueB || falseB));
        System.out.println("True && False = " + (trueB && falseB));
    }
}
