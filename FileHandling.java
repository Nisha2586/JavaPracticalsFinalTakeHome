package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandling {
	String path = "C:\\Users\\NISHA\\Desktop\\Techfios october2021";
	
	public void doesFileExist(String path) {
		File f1 = new File(path + "\\FinalTestFolder");
		if(f1.exists()!=true) {
		f1.mkdir();
		}
		File f2 = new File(path + "\\FinalTestFolder\\folder1\\Dict");
		if(f2.exists()!=true) {
			f2.mkdirs();
		}
		File f3 = new File(path + "\\FinalTestFolder\\folder1\\Dict\\Dictionary.txt");
		if(f3.exists()!=true) {
			try {
				f3.createNewFile();
				System.out.println("File has been created.File exist");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			else if(f3.exists()== false) {
		}
			else {
				System.out.println("File exist.");
		}
	}

	public static void main(String[] args)throws IOException {
		FileHandling obj = new FileHandling();
		obj.doesFileExist(obj.path);
		
		File f4 = new File(obj.path + "\\FinalTestFolder\\folder1\\Dict\\Dictionary.txt");	
		System.out.println("Created File Name is : " +f4.getName());	
		
		FileWriter fw = new FileWriter(f4);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Apple-a fruit,a tech firm");
		bw.newLine();
		bw.write("Table-an object,contains rows and columns when used in context of computers");
		bw.newLine();
		bw.write("orange-a fruit");
		bw.newLine();
		bw.close();
		
		
		List<String> readerList = new ArrayList<String>();
		FileReader fr = new FileReader(f4);
		BufferedReader br = new BufferedReader(fr);
		String line ="";
		while((line = br.readLine())!=null) {
			readerList.add(line);
		}
			
		System.out.println(readerList.get(0).split("-")[0]);
		System.out.println(readerList.get(0).split("-")[1].split(",")[0]);
		System.out.println(readerList.get(1).split("-")[0]);
		System.out.println(readerList.get(1).split("-")[1].split(",")[0]);
		System.out.println(readerList.get(2).split("-")[0]);
	}

	

}

//FileInputStream/BufferInputStream-as a file-RawData/BinaryData--can be used for txt file also
//FileOutputStream/BufferOtuputStream-as a file-RawData/BinaryData
//FileReader/BufferReader--.txtFile
//FileWriter/BufferWriter--.txtFile

//System.out.println(readerList.get(0).substring(6,13));
//for(String s :readerList) {
//	System.out.println(s);
//}
//this.path = path;//this will work only for instance method and constructor
//FileWriter fw = new FileWriter(obj.path + "\\FinalTestFolder\\folder1\\Dict\\Dictionary.txt");//both ways are same.
//fw.write("Apple-a fruit,a tech firm");
//fw.flush();
//fw.close();



