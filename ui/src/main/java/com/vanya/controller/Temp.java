package com.vanya.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Temp<A,B> {
    A a;

    public void print(){
        System.out.println(a);
    }
    public void setA(A a){
        System.out.println(a);
        this.a=a;
    }
}
