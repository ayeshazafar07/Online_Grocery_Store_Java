package DataStoringLayer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class database_Handler {

	public boolean login_verifier(String user, String pass) throws IOException {
		Boolean flag = false;
		String line, id, username, password;
		BufferedReader br = new BufferedReader(new FileReader("src/DataStoringLayer/loginInfo.txt"));
		while( (line = br.readLine() )!= null) {
			String[] arr = line.split(" ");    
			if(arr[1].equals(user) && arr[2].equals(pass)) {
				id = arr[0];
				username = arr[1];
				password = arr[2];
				flag = true;
				break;
			}			
		}	
		return flag;
	}

	
	public String[] getItem(int ID, int q) throws IOException {

		String line, id, name, price;
		id = Integer.toString(ID);
		BufferedReader br = new BufferedReader(new FileReader("src/DataStoringLayer/items.txt"));
		while( (line = br.readLine() )!= null) {
			String[] arr = line.split(" ");    
	
			if(arr[0].equals(id)) {
				name = arr[1];
				price = arr[2];
				int qtyInInventory = Integer.parseInt(arr[3]);
				if(q <= qtyInInventory)
					return arr; //TOTAL MAI SAY q MINUS KARDENA
				else {
					
				}
			}			
		}	

		String[] b = null;
		return b;
	}

	

}
