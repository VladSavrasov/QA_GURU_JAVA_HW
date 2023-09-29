package ru.vladivikovich.hw7;

import java.util.*;

public class HashSetClass {
    HashSet<String> strings = new HashSet<>();

    public void stringsAdd(String str) {
        strings.add(str);
    }

    public void stringsDelete(String str) {
        strings.remove(str);
    }

    public boolean stringsContains(String str) {
        return strings.contains(str);
    }

    public void showAllElements(HashSetClass set) {
        Iterator i = iterator(set);
        while (i.hasNext())
            System.out.println(i.next());
    }

    private Iterator<String> iterator(HashSetClass set) {
        HashSet<String> strings = new HashSet<>((Collection) set);
        Iterator<String> i = strings.iterator();
        return i;
    }
}
