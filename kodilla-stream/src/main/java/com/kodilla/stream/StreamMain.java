package com.kodilla.stream;                                                   // [1]


import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {


        //PoemBeautifier
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("abcd", text -> text + "aaa");
        poemBeautifier.beautify("abcd", text -> text.toUpperCase());
        poemBeautifier.beautify("abcd", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("abcd", text -> text.replace("dupa","abc"));
        poemBeautifier.beautify("abcd", text -> text.substring(3));
    }
}