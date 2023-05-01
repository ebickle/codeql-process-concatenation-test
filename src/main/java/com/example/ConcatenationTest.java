package com.example;

import java.io.File;
import java.io.IOException;

public class ConcatenationTest
{
	private void execute() throws IOException
	{
		// Set File object to a static path without user-controlled input.
		File inputFile = new File("/tmp/example.jpg");

		// Start Process using string concatenation and file.getAbsolutePath().
		Runtime.getRuntime().exec("python test.py --file " + inputFile.getAbsolutePath());
	}
}