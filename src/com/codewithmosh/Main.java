package com.codewithmosh;

public class Main {

    public static void main(String[] args) {
        CharacterFinder finder = new CharacterFinder();
        var ch = finder.findFirstRepeatingChar("a green apple");
        System.out.println(ch);
    }
}
