package com.oopconcepts.solidprinciples.interfacesegregation;

public class Butterfly implements Insect {
    @Override
    public void sting() {
        System.out.println("I'm a butterfly and I don't sting");
    }

    @Override
    public void eat() {}

    @Override
    public void reproduce() {

    }

    public static class SPrinciple { }
}
