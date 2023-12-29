package org.review9;

public  interface WashAble {

  public static final   int AGE=20;
    void wash();
}

interface TrustAble{

    void trust();
}

class Horse implements WashAble,TrustAble{

    @Override
    public void wash() {
        System.out.println("Washing the Horse");
    }

    @Override
    public void trust() {
        System.out.println("Horses can b trusted they are loyal");
    }
}

class Car implements WashAble,TrustAble{

  public void trust(){
      System.out.println("you can Trust Toyota cars");
    }

    @Override
    public void wash() {
        System.out.println("Washing the car");
    }
}
class Laptop{

}