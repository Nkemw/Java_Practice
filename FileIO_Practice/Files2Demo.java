package project;

import java.io.*;
import java.nio.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Files2Demo {
	public static void main(String[] args) throws Exception{
		Charset cs = Charset.defaultCharset();
		Path p = new File("C:\\Temp\\new.txt").toPath();
		if(Files.notExists(p)) {
			Files.createFile(p);
		}
		
		byte[] data = "좋은 아침!\n잘 가세요!\n".getBytes();
		Files.write(p,  data, StandardOpenOption.APPEND);
		
		try {
			List<String> lines = Files.readAllLines(p, cs);
			
			for(String line : lines)
				System.out.println(line);
		} catch (IOException e) {
			
		}
		
	}
}
