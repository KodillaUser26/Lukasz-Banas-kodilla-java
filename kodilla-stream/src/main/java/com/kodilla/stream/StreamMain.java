package com.kodilla.stream;                                                   // [1]


import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {


        //PoemBeautifier
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("dupa", text -> text + "aaa");
        poemBeautifier.beautify("dupa", String::toUpperCase);
        poemBeautifier.beautify("dupa", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("dupa", text -> text.replace("dupa","abc"));

    }
}