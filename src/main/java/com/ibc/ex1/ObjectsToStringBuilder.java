package com.ibc.ex1;

import java.util.ArrayList;
import java.util.Objects;

public class ObjectsToStringBuilder<T> {
    private final String delimiter;
    private final ArrayList<T> arrayList;

    public ObjectsToStringBuilder(String delimiter) {
        this.delimiter = delimiter;
        this.arrayList = new ArrayList<>();
    }

    public void add(T item) {
        arrayList.add(item);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectsToStringBuilder<?> that = (ObjectsToStringBuilder<?>) o;
        return Objects.equals(delimiter, that.delimiter) && Objects.equals(arrayList, that.arrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(delimiter, arrayList);
    }

    @Override
    public String toString() {
        String resultString = "";

        for (T item : arrayList) {
            if (resultString.isBlank()) {
                resultString = resultString.concat(item.toString());
            } else {
                resultString = resultString.concat(delimiter).concat(item.toString());
            }
        }
        return resultString;
    }
}
