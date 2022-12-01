package com.ibm.cloud.codeengine.test

import java.io.IOException
import java.nio.charset.Charset
import org.apache.commons.io.IOUtils

fun main(args : Array<String>) {
    println("Hello there!")
    IOUtils.write("Here is the Main class..\n", System.out, Charset.forName("UTF-8"));
}
