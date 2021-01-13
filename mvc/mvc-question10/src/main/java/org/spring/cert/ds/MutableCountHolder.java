package org.spring.cert.ds;

public class MutableCountHolder {
    private int count;

    public int get() {
        return count;
    }

    public int increment() {
        return ++count;
    }
}
