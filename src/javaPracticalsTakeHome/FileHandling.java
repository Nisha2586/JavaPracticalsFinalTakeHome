package javaPracticalsTakeHome;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandling {
	static String path ="./" +"DataFolder//Dictionary.txt";
	
	public static void doesFileExist(String path) throws IOException {
		try {	
			File f1 = new File(path);
			if(f1.exists()!=true) {
			f1.createNewFile();
				System.out.println("File has been created.");
			} 
			else if(!f1.exists()) {
				throw new FileNotFoundException();
		}
			else {
				System.out.println("File exist.");
		}
			}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File does not exist.");

		}
	}

	public static void main(String[] args)throws IOException {
		
		doesFileExist(path);
		
		File f4 = new File(path);	
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
			for(int i =0; i<readerList.size();i++) {	
				System.out.println("Word"+(i+1)+"     : " + readerList.get(i).split("-")[0]);
				System.out.println("Meaning 1 : " + readerList.get(i).split("-")[1].split(",")[0]);
				if(i<(readerList.size()-1)){
				System.out.println("Meaning 2 : " + readerList.get(i).split("-")[1].split(",")[1]);
				}
			}
	}
}

//FileInputStream/BufferInputStream-as a file-RawData/BinaryData--can be used for txt file also
//FileOutputStream/BufferOtuputStream-as a file-RawData/BinaryData
//FileReader(will read char by char not by readLine)/BufferReader--.txtFile
//FileWriter(cant write newLine)/BufferWriter--.txtFile

//System.out.println(readerList.get(0).substring(6,13));
//for(String s :readerList) {
//	System.out.println(s);
//}
//File f1 = new File(path);
//if(f1.exists()!=true) {
//f1.mkdir();
//}
//	if(f1.exists()!=true) {
//f1.mkdir();
//}
//File f2 = new File(path + "\\FinalTestFolder\\folder1\\Dict");
//if(f2.exists()!=true) {
//	f2.mkdirs();
//}
//this.path = path;//this will work only for instance method and constructor
//FileWriter fw = new FileWriter(obj.path + "\\FinalTestFolder\\folder1\\Dict\\Dictionary.txt");//both ways are same.
//fw.write("Apple-a fruit,a tech firm");
//fw.flush();
//fw.close();



