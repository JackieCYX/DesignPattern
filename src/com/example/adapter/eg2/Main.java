package com.example.adapter.eg2;

import com.example.adapter.eg1.Print;
import com.example.adapter.eg1.PrintBanner;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
