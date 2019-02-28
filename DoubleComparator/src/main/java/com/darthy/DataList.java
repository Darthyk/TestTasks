package com.darthy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DataList {
    public static Collection<DataClass> getSomeDataList() {
        List<DataClass> list = new ArrayList<DataClass>();
        list.add(new DataClass().builder()
                .number(1)
                .name("C")
                .build());
        list.add(new DataClass().builder()
                .number(1)
                .name("A")
                .build());
        list.add(new DataClass().builder()
                .number(2)
                .name("D")
                .build());
        list.add(new DataClass().builder()
                .number(1)
                .name("E")
                .build());
        list.add(new DataClass().builder()
                .number(2)
                .name("B")
                .build());
        list.add(new DataClass().builder()
                .number(3)
                .name("A")
                .build());
        list.add(new DataClass().builder()
                .number(2)
                .name("K")
                .build());

        return list;
    }
}
