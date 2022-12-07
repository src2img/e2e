package com.ibm.cloud.codeengine.test;

import java.io.IOException;
import java.nio.charset.Charset;
import org.apache.commons.io.*;


public class Main {
    
    public static void main(String[] args) throws IOException {
        //System.out.println("Here is the Main class");
        // We do the following to use something from commons-io
    IOUtils.write("Here is the Main class\n", System.out, Charset.forName("UTF-8"));
    }
}
