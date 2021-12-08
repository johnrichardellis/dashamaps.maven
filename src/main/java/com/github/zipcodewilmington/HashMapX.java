package com.github.zipcodewilmington;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public interface HashMapX<E, T> {
    // fundamentals
    void set(E key, T value);
    E delete(E key);
    E get(E key);
    boolean isEmpty();
    long size();

    // testing access
    boolean bucketSize(E key); // used for tests
}

