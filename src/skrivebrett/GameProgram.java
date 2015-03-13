package skrivebrett;

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

	}

	private static void load(InputStream stream, Board board) throws IOException {
		//..
	}

	private static void save(OutputStream stream, Board board) throws IOException {
		//..
	}
	
}
