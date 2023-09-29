package ru.vladivikovich.hw7;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListClass {
    ArrayList<String> array = new ArrayList<>();

    public void arrayAdd(String str) {
        array.add(str);
    }

    public void arrayAdd(String str, int index) {
        array.add(index, str);
    }

    public void arrayremove(Object o) {
        array.remove(o);
    }

    public int arrayFindIndexOfElement(String str) {
        return array.indexOf(str);
    }

    public String arrayFindElement(int i) {
        return array.get(i);
    }

    public void showAllElements(ArrayListClass arr) {
        ArrayList<String> arrayList = new ArrayList<>((Collection) arr);
        for (String element : arrayList) {
            System.out.println(element);
        }
    }
}
