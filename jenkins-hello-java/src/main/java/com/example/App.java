package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        JustPayApp app = new JustPayApp();
        System.out.println(app.gerPaneName());
        app.doAction("READ_BARCODE");
        System.out.println(app.gerPaneName());
        app.doAction("CANCEL_BUTTON");
        System.out.println(app.gerPaneName());
    }
}
