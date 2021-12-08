package com.github.zipcodewilmington.sample;

import com.github.zipcodewilmington.HashMapX;

public class DashaMapTwo <E, T> implements HashMapX {

    public DashaMapTwo() {
    }

    private String HashFunctionTwo(String input) {
        if (input.length() > 0) {
            return (String.valueOf(input.charAt(1)).toLowerCase());
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
    public String get(String key) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public long size() {
        return 0;
    }

    @Override
    public boolean bucketSize(Object key) {
        return false;
    }
}
