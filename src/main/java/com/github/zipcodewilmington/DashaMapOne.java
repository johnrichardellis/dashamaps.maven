package com.github.zipcodewilmington;

import com.github.zipcodewilmington.sample.MyLinkedList;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMapOne<E,T> implements HashMapX {

    MyLinkedList[] nodeArray;

    public DashaMapOne (){

        nodeArray = new MyLinkedList[26];

    }

    //TODO
    //utilize the method from the interface against the array of 26 letters

    private String HashFunctionOne(String input) {
        if (input.length() > 0) {
            return String.valueOf(input.charAt(0)).toLowerCase();
        }
        return null;
    }

    //.set is equivalent to a .add function of an arraylist


//    @Override
//    public void set(String key, Integer value) {
//        MyNode newNode = new MyNode(key, value);
//        int emptyNode = 0;
//        for (int i = 0; i < nodeArray.length; i++) {
//            if (nodeArray[i].getNext() == null){
//                emptyNode = i;
//                break;
//            }
//        }
//
//        nodeArray[emptyNode].setNext(newNode);
//
//        nodeArray[emptyNode+1] = newNode;
//
//    }

    @Override
    public void set(Object key, Object value) {

        MyLinkedList newNode = new MyLinkedList();
        Integer emptyNode = 0;
        for (Integer i = 0; i < nodeArray.length; i++) {
            if (nodeArray[i+1].get(key) == null){
                emptyNode = i;
                break;
            }
        }

        nodeArray[emptyNode].set(newNode);

        nodeArray[emptyNode] = newNode;

    }

    @Override
    public E delete(Object key) {

        MyLinkedList newNode = new MyLinkedList<>();


        return null;
    }

    @Override
    public E get(Object key) {
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