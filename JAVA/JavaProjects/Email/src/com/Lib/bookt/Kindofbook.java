package com.Lib.bookt;


import java.io.File;

/*PDF (.pdf)  - A very popular eBook format from Adobe which most eReaders support.
EPUB (.epub) - An open eBook standard created by the International Digital Publishing Forum (IDPF). It features reflowable text, inline images and the ability to use Digital Rights Management (DRM) such as Adobe Digital Editions.
Kindle (.azw) - Native format for Amazon's Kindle products which typically comes with DRM protection to limit sharing.
MobiPocket (.mobi) - A format primarily designed for PDAs and older mobile devices. Also used on the Kindle.
Text (.txt) - A basic plain text format which is easy to create, but cannot contain images.*/
public class Kindofbook {
    //1 We need to check the folder for the kind of book we have

    public void readBookname(){
        File book = new File("F:/Temp/Test/");
        String[] bookList = book.list();
        for (String x : bookList) {
            bookExtension(x);
            System.out.println(x);
        }
    }

    public String bookExtension(String fn){
    int dotIndex =fn.lastIndexOf(".");
    return(dotIndex==-1)?"unknown":fn.substring(dotIndex+1);
    }


    public static void main(String[] args) {
        Kindofbook kb= new Kindofbook();
        kb.readBookname();
//        kb.bookExtension();
    }
}
