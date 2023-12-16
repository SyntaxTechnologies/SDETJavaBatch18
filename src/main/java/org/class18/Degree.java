package org.class18;

public class Degree {

   public void getPreReq(){
        System.out.println("To Get a Degree we need to have a School diploma");
    }
}

class Master extends Degree{

   public void getPreReq(){
       System.out.println("To get a Masters degree we need to have Bachelors Degree");
    }
}

class Bachelors extends Degree{

}

class DegreeTester{
    public static void main(String[] args) {
        Master m=new Master();
        m.getPreReq();
        Bachelors b=new Bachelors();
        b.getPreReq();
    }
}