package assignment1;
import java.io.*;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Act2
{
	public static void main(String[] args) throws Throwable
	{
		PrintWriter pw = new PrintWriter("C:\\Users\\lenovo\\Java File concept\\Movies.csv");
		StringBuilder s = new StringBuilder();
		
		s.append("Movies_names");
		s.append(",");
		s.append("Hero_names");
		s.append(",");
		s.append("Heroine_names");
		s.append("\n");
		
		s.append("Thupakki");
		s.append(",");
		s.append("Vijay");
		s.append(",");
		s.append("Kajal");
		s.append("\n");
		
		s.append("Raja Rani");
		s.append(",");
		s.append("Arya");
		s.append(",");
		s.append("Nazriya");
		s.append("\n");
		
		s.append("Theri");
		s.append(",");
		s.append("Vijay");
		s.append(",");
		s.append("Samantha");
		s.append("\n");
		
		s.append("24");
		s.append(",");
		s.append("Surya");
		s.append(",");
		s.append("Samantha");
		s.append("\n");
		
		s.append("Geetha Govindham");
		s.append(",");
		s.append("Vijay Deverkonda");
		s.append(",");
		s.append("Rashmika");
		s.append("\n");
		
		pw.write(s.toString());
		pw.close();
		System.out.println("created sucessfully");
	}}