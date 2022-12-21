package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {//ilya


    boolean theSameAs(T anotherItem);


    @Override
    boolean equals(Object o);
}