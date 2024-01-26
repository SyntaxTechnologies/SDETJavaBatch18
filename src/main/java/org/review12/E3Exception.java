package org.review12;

public class E3Exception {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(10/0);
            int [] arr=new int[2];
            arr[5]=10;
        }
        catch (ArrayIndexOutOfBoundsException a)
        {
        a.printStackTrace();
        }catch (ArithmeticException a){
            a.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(3);
    }
}
