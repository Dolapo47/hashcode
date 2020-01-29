package com.dolapo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static com.dolapo.readWithNIO.readWithNIO;

public class Main {

    public static void main(String[] args) {
	// write your code here

        readWithNIO();
    }
}
