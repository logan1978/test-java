package ru.home;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author s.khovansky on 02.01.2025
 */
public class Test {
    public static void main(String[] args) {
        Set<String> positions = new LinkedHashSet<>();
        positions.add("junior");
        positions.add("junior");
        positions.add("middle");
        positions.add("senior");
        positions.add("team lead");
        positions.add("architect");
        System.out.println(positions);
        TreeSet<String> treeSet = new TreeSet<>(positions);
        System.out.println(treeSet);
    }
}
