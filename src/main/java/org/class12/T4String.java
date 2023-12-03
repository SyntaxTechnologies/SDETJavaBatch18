package org.class12;

public class T4String {
    public static void main(String[] args) {
        String fatherName="Carlos";
        String motherName="Ana";
        boolean isBoy=false;

        if(isBoy){
            String fatherFirstPart=fatherName.substring(0,fatherName.length()/2);
            String motherLastPart=motherName.substring(motherName.length()/2,motherName.length());
            System.out.println(fatherFirstPart.trim()+motherLastPart.trim());
        }else {
            String motherFirstPart=motherName.substring(0,motherName.length()/2);
            String fatherLastPart=fatherName.substring(fatherName.length()/2,fatherName.length());
            System.out.println(motherFirstPart.trim()+fatherLastPart.trim());

        }
    }
}
