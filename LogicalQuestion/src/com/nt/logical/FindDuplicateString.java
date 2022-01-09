package com.nt.logical;

public class FindDuplicateString {

    public static void main(String[] args) {
    findDuplicate("ABCDEFGHIJKLMNM");
    }
    public static void findDuplicate(String str){
        char listString[]=str.toCharArray();
        for(int i=0;i< str.length();i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (listString[i] == listString[j]) {
                    System.out.println(listString[j]);
                }
            }

        }
    }
}
