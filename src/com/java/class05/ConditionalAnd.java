package com.java.class05;

public class ConditionalAnd {

    public static void main(String[] args) {

        //to issue certificate I want students to have gpa more than 3.5
        //and I want students to have less than 3 missed classes;
        boolean giveSezimCertificate = false;

        double sezimGPA = 4.0;
        int sezimMissedClasses = 3;

        giveSezimCertificate = sezimGPA>3.5 && sezimMissedClasses < 3;
        System.out.println(giveSezimCertificate);

        System.out.println("==============================");

        boolean giveCertificate = false;

        double bakytGPA = 4.0;
        int bakytMissedClasses = 0;

        giveCertificate = bakytGPA>3.5 && bakytMissedClasses < 3;
        System.out.println(giveCertificate);

        System.out.println("==============================================");

        boolean issueDriverLicense = false;

        int age = 24;
        boolean passport = true;

        issueDriverLicense = age>16 && passport;
        System.out.println(issueDriverLicense);




    }
}
