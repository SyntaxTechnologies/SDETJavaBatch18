package org.class27;

public class E1Exception {
    public static void main(String[] args) {

        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
       // System.out.println(10 / 0);
        try {

            String name=null;
            System.out.println(name.length());
        } catch (ArithmeticException e) {

            System.out.println("Please don't try to divide by zero it s not allowed in java");
        }catch (NullPointerException npe){
            System.out.println("Make sure your object is initialed properly");
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Make sure your index is greater than 0 and less than the size");
        }catch (Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
    }
}
