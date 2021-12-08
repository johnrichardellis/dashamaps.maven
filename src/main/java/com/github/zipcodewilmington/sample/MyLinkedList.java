package com.github.zipcodewilmington.sample;

public class MyLinkedList<E,T> {

    private MyNode head;
    private MyNode tail;


    private class MyNode<E,T> {

        public E k;
        public Integer v;
        private MyNode next;
        private MyNode<E,T> data;

        public MyNode(E k, Integer v){
            this.k = k;
            this.v = v;


        }

        public MyNode(E k) {
            this.k = k;
        }

        public void setK(E k) {
            this.k = k;
        }

        public void setV(Integer v) {
            this.v = v;
        }

        public void setNext(MyNode next) {
            this.next = next;
        }

        public E getK() {
            return k;
        }

        public Integer getV() {
            return v;
        }



        public MyNode getNext() {
            return next;
        }

    }

    public void add(E k, Integer v){
        MyNode node = new MyNode(k,v);
        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }

    }

    public void remove(Integer k){
        MyNode<E,T> currentNode = head, previousNode = null;
        int currentIndex = 0;
        //check if the current node exist
        while (currentNode != null && currentIndex != k) {
            //keeping track of the previous node
            previousNode = currentNode;
            //continuing the iteration
            currentNode = currentNode.next;
            //iterate through the next node
            currentIndex++;
        }
        //remove the index
        if (currentIndex == k) {
            //checking if the previous node is not null
            if (previousNode != null) {
                //then we can add the previous node to the node after
                previousNode.next = currentNode.next;
            }
            //checking that the current node is the head
            if (currentNode == head) {
                //and also if the current node is null
                if (currentNode == null || currentNode.next == null) {
                    //return head as null;
                    head = null;
                } else {
                    //the new head will be the next node
                    head = currentNode.next;
                }
                //current is the tail
            } else if (currentNode == tail) {
                //the tail is the previous node
                tail = previousNode;
            }

        }

    }

    public int find(E k){

        int currentIndex = 0;
        MyNode<E,T> currentNode = head;
        while (currentNode != null) {
            if (currentNode.data != k) {
                currentNode = currentNode.next;
                currentIndex++;
            }
            if (currentNode.data == k) {
                return currentIndex;
            }
        }

        return -1;
    }

    public Boolean contains(E k){

        MyNode<E,T> currentNode = head;
        while (currentNode != null) {
            if (currentNode.data != k) {
                currentNode = currentNode.next;
            } else {
                return true;
            }
        }
        return false;

    }

    public int size(){

        int currentIndex = 0;
        MyNode<E,T> currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.next;
            currentIndex++;
        }

        return currentIndex;
    }

    public E get(E k){
        Integer currentIndex = 0;
        MyNode<E,T> currentNode = head;
        while (currentNode != null && currentIndex != k) {
            currentNode = currentNode.next;
            currentIndex++;
        }
        if (currentIndex == k && currentNode != null) {
            return currentNode.getK();
        }

        return null;
    }

    public void set(MyLinkedList newNode){

    }


    public MyLinkedList<E,T> copy(){

        MyLinkedList<E,T> newList = new MyLinkedList<>();
        MyNode<E,T> currentNode = head;

        while (currentNode != null){
            newList.add(currentNode.getK(), currentNode.getV());
            currentNode = currentNode.next;
        }

        return newList;

    }

    public void sort(){

    }
}