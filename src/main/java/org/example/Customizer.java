package org.example;

@FunctionalInterface
public interface Customizer<T> {
    T customize(T t);
}
