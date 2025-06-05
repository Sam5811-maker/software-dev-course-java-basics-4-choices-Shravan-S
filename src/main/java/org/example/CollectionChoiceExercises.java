package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// For these exercises, you need to declare a single variable
// in each function that uses the appropriate collection type
// (Array, ArrayList, HashSet, HashMap)
//
// You do not need to populate this array or add any additional code.
// If you get stuck, refer to the java basics 4 (arrays and collections) curriculum
public class CollectionChoiceExercises {
    public void MakeColorCollection() {
        // EXAMPLE:
        // Create an appropriate variable for holding a collection
        // of three strings that are known ahead of time to be "Red", "Green" and "Blue"
        // and will not change during program execution.

        String[] colors = {"Red", "Green", "Blue"};
        for (String color : colors) System.out.println(color);
    }

    public void MakeStudentCollection() {
        // Create an appropriate collection variable for holding a list of student names
        // that will be added to and removed from during program execution.
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("John");
        studentNames.add("Sam");
        System.out.println(studentNames);
//        return studentNames;
    }

    public void MakeLoggedInUsersCollection() {
        // Create an appropriate collection variable for holding a set of
        // unique logged in usernames where adding a username that's already
        // present is ignored and checking if a user is in the collection can
        // be done very quickly.
        HashSet<String> userNames = new HashSet<>();
        userNames.add("Jhasbd1232");
        userNames.add("Usdjbcj1234");
        System.out.println(userNames);
    }

    public void MakeEmployeeAccessCodesCollection() {
        // Create an appropriate collection variable for holding a set of
        // key-value pairs where they key is an employee name (String) and the
        // value is an employee access code (String.)

        HashMap<String, String> employeeInfo = new HashMap<>();
            employeeInfo.put("Sam", "HJSDCV");
        System.out.println("EmployeeInfo" + employeeInfo);
    }
}
