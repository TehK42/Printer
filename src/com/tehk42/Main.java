package com.tehk42;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(50, false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed = " + pagesPrinted + ", Total amount of pages = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed = " + pagesPrinted + ", Total amount of pages = " + printer.getPagesPrinted());




    }
}
