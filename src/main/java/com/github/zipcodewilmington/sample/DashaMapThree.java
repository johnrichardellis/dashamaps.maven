package com.github.zipcodewilmington.sample;

import com.github.zipcodewilmington.HashMapX;

public class DashaMapThree<E, T> implements HashMapX {

    private String HashFunctionThree(String input) {
        if (input.length() > 1) {
            return (String.valueOf(input.charAt(0) + input.charAt(1)).toLowerCase());
        }
        return null;
    }




    @Override
    public void set(Object key, Object value) {

    }

    @Override
    public E delete(Object key) {
        return null;
    }

    @Override
    public E get(Object key) {
        return null;
    }

    @Override
    public boolean bucketSize() {
        return false;
    }

    @Override
    public long size() {
        return 0;
    }

    @Override
    public boolean bucketSize(String key) {
        return false;
    }
}
