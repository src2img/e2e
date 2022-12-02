package com.ibm.cloud.codeengine.test

import java.nio.charset.Charset
import java.io.IOException

import org.apache.commons.io.IOUtils

object App {
    def main(args: Array[String]) = {
        println("Hello there!!!!!")
        IOUtils.write("Here is the Main class....\n", System.out, Charset.forName("UTF-8"));
    }
}