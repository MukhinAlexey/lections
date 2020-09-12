package com.samples.collections.collection;

/**
 * Пример, который показывает как можно реализовать интерфейс Collection самому
 */
public class Main {

    public static void main(String[] args) {
        CollectionInterfaceImpl<Object> collectionInterface = new CollectionInterfaceImpl<>();
        collectionInterface.add(new Object());
    }
}
