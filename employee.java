public class employee {
    // Example 10.4: Employee.java
 2 // Employee abstract superclass.
         3
         4 public abstract class Employee
 5 {
        6 private String firstName;
        7 private String lastName;
        8 private String socialSecurityNumber;
        9
        10 // three-argument constructor
        11 public Employee( String first, String last, String ssn )
        12 {
            13 firstName = first;
            14 lastName = last;
            15 socialSecurityNumber = ssn;
            16 } // end three-argument Employee constructor
        17
        18 // set first name
        19 public void setFirstName( String first )
        20 {
            21 firstName = first;
            22 } // end method setFirstName
        23
        24 // return first name
        25 public String getFirstName()
        26 {
            27 return firstName;
            28 } // end method getFirstName
        29
        30 // set last name
        31 public void setLastName( String last )
        32 {
            33 lastName = last;
            34 } // end method setLastName
        35
        36 // return last name
        37 public String getLastName()
        38 {
            39 return lastName;
            40 } // end method getLastName
        41
        42 // set social security number
        43 public void setSocialSecurityNumber( String ssn )
        44 {
            45 socialSecurityNumber = ssn; // should validate
            46 } // end method setSocialSecurityNumber
        47
        48 // return social security number
        49 public String getSocialSecurityNumber()
        50 {
            51 return socialSecurityNumber;
            52 } // end method getSocialSecurityNumber
        53
        54 // return String representation of Employee object
        55 public String toString()
        56 {
            57 return String.format( "%s %s\nsocial security number: %s",
                    58 getFirstName(), getLastName(), getSocialSecurityNumber() );
            59 } // end method toString
        60
        61 // abstract method overridden by subclasses
        62 public abstract double earnings(); // no implementation here
        63 } // end abstract class Employee
}
