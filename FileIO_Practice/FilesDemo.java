package project;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FilesDemo {

	public static void main(String[] args) throws Exception {
		File f1 = new File("C:\\Temp\\org.txt");
		File f2 = new File("C:\\Temp");
		
		System.out.println("org.txt�� ����? " + Files.isDirectory(f1.toPath()));
		System.out.println("Temp�� ����? " + Files.isDirectory(f2.toPath()));
		System.out.println("org.txt�� ���� �� �ִ� ����? " + Files.isReadable(f1.toPath()));
		System.out.println("org.txt�� ũ��? " + Files.size(f1.toPath()));

	}

}
