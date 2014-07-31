package com.ks.hashmap;

public interface KeyValuePair<K, V> {
    public K getKey();
    public V getValue();
    public KeyValuePair getNext();
    public void setNext(KeyValuePair<K, V> keyValuePair);
}
