// Redundancy, but it compiles
//import java.lang.System;
//import java.lang.*;

// Wildcards
//import java.nio.*; // NO GOOD – a wildcard only matches class names, not packages
//import java.nio.*.*; // NO GOOD – you can only have one wildcard and it must be at the end
//import java.nio.files.Paths.*; // NO GOOD – you cannot import methods only class names

// The type Date is ambiguous
//import java.util.*;
//import java.sql.*; // DOES NOT COMPILE

// When you specify a class, it will take precedence over any wildcard, java.util.Date will be used
import java.util.ArrayList;
import java.util.Date;
import java.sql.*;
import java.util.stream.Collectors;

// A type with the same simple name is already defined by the single-type-import of java.util.Date
//import java.util.Date;
//import java.sql.Date; // DOES NOT COMPILE

public class ImportPackages {
//    public static void main (String[] args) {
//        Date date = new Date();
//        System.out.println("Success: " + date.toString());
//
//        // We still can use classes with the same name if we use the fully qualified name
//        java.sql.Date date2 = new java.sql.Date(999999999999L);
//        System.out.println("Success: " + date2.toString());
//    }

    static class Category {
        String code;

        Category(String s) {
            code = s;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
    }

    public static void main (String[] args) {
        String t = "abcde";
        System.out.println("Success: " + t.substring(0, 4));




        ArrayList<Category> treeA = new ArrayList<>();
        treeA.add(new Category("a"));
        treeA.add(new Category("b"));
        treeA.add(new Category("c"));

        ArrayList<Category> treeB = new ArrayList<>();
        treeB.add(new Category("b"));

        treeA.removeAll(treeB);

//        categoryTreeB.addAll(null);

        String categoryCodes = treeA.stream().map(Category::getCode).collect(Collectors.joining("|"));

        System.out.println("Success: " + categoryCodes);
    }
}
