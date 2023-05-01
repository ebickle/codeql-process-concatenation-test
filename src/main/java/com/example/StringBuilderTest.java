package com.example;

import java.io.File;
import java.io.IOException;

public class StringBuilderTest
{
	private void execute() throws IOException
	{
		// Set File object to a static path without user-controlled input.
		File inputFile = new File("/tmp/example.jpg");

		//File inputFile = File.createTempFile("img", "tmp", TMP_DIR);
        
		// Start Process using string concatenation and file.getAbsolutePath().
		// Use StringBuilder as an intermediary step.
		StringBuilder sb = new StringBuilder("python test.py --file " + inputFile.getAbsolutePath());
        Runtime.getRuntime().exec(sb.toString());
	}
}