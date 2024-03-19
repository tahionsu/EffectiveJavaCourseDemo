package com.ibc.ex1;

import java.util.List;

public interface FirstExAPI {
    <E> String collectString(List<E> objects, String delimiter);
}
