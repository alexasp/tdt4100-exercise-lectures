package skrivingavbrett;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;


public class GameProgram {

	public static void main(String[] args){
		
		Board board = new Board(10, 10);
		
		System.out.println(board.toString());
		
		
		try(OutputStream stream = new FileOutputStream("save.txt")){
			
			save(stream, board);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try(InputStream stream = new FileInputStream("save.txt")){
			
			load(stream, board);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try(PrintWriter writer = new PrintWriter(new FileWriter("save2.txt"))){
			writer.write(board.toString());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		try(Scanner scanner = new Scanner(new FileReader("save2.txt"))){
			while(scanner.hasNext()){
				//..
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		

	}

	private static void load(InputStream stream, Board board) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
		StringBuilder builder = new StringBuilder();
		String line;
		while((line = reader.readLine()) != null){
			builder.append(line);
		}
		board.init(builder.toString());
	}

	private static void save(OutputStream stream, Board board) throws IOException {
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(stream));
		writer.write(board.toString());
		writer.flush();
	}
	
}
