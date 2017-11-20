package com.github.hyla.util.function;

@FunctionalInterface
public interface Function2<T1, T2, R> {

    R apply(T1 t1, T2 t2);
}

