package com.ibc.ex1;

import java.util.List;

public class FirstExAPIImpl implements FirstExAPI {

    @Override
    public <E> String collectString(List<E> objects, String delimiter) {
        ObjectsToStringBuilder<E> builder = new ObjectsToStringBuilder<>(delimiter);

        for (E obj : objects) {
            builder.add(obj);
        }

        return builder.toString();
    }
}
