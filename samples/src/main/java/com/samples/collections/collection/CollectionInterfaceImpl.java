package com.samples.collections.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Пример показывающий возможность реализации интерфейса Collection
 * @param <ObjectType> Generic тип объекта, с которым работает наша коллекция
 */
public class CollectionInterfaceImpl<ObjectType> implements Collection<ObjectType> {

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<ObjectType> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return null;
    }

    /**
     * Добавим собственную реализацию метода Add
     * @param o - объект, который мы хотим добавить
     * @return значение boolean переменной, которая означает успешно ли добавился объект или нет
     */
    @Override
    public boolean add(ObjectType o) {
        System.out.println("Был вызван метод public boolean add(Object o) из реализации интерфейса Collection");
        // Тут может быть написана логика добавления объекта к нашей коллекции объектов
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends ObjectType> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeIf(Predicate<? super ObjectType> filter) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Spliterator<ObjectType> spliterator() {
        return null;
    }

    @Override
    public Stream<ObjectType> stream() {
        return null;
    }

    @Override
    public Stream<ObjectType> parallelStream() {
        return null;
    }
}
