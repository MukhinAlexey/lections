package com.samples.collections;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Collection;

public class CustomCollectionTest {

    private Collection<String> myOwnCollection;

    @BeforeEach
    public void init() {
        myOwnCollection = new ArrayList<>();
    }

    @Test
    public void testAddElement() {

    }
}
