package com.darthy;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleComparator {
    public static void main(String... args) {
        List<DataClass> list = (List<DataClass>) DataList.getSomeDataList();
        System.out.println("Before sort : " + list);
        Comparator<DataClass> comparator = Comparator.comparing(data -> data.getNumber());
        comparator = comparator.thenComparing(data -> data.getName());
        List<DataClass> sortedList = list.stream().sorted(comparator).collect(Collectors.toList());
        System.out.println("After sort : " + sortedList );
    }
}
