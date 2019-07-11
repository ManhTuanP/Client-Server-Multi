package Giaodien;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;
public class Danhsachbanbe extends Exception{
	//static ArrayList<String> list = new ArrayList<String>();
	
	static danhSach[] list = new danhSach[1];
	static Scanner scanner = new Scanner(System.in);
	public static void themBanBe(){
		
		for(int i = 0; i<= list.length ;i++) {
			System.out.println("Usename:");
			String Name = scanner.next();
			System.out.println("Ip:");
			String ip = scanner.next();
//socket.getRemoteSocketAddress()
			System.out.println("Port:");
			int port = scanner.nextInt();
//socket.getLocalPort()
			list[i] = new danhSach(Name, ip, port);
		}
	}
	public static void xuat() {
		int size=list.length;
		if(size<1) {
			System.out.println("Ban chua nhap du lieu !");
        }else {
        	System.out.println("-----------------");
        	System.out.println("Danh sach ban be:");
        	for (int i = 0; i < list.length; i++) {
				System.out.print(list[i].getName() + "\n");
				//System.out.print(list[i].getIpNumber() + ":" + list[i].getPortNumber());
        	}
        	System.out.println("-----------------");
        }
	}
	public static void main(String[] args) {
		//try {
				System.out.println("1- Them ban be.\n2- Ds ban be.\n3- Ket thuc.");
			while(true) {	
				System.out.print("Lua Chon:");
				int temb;
				//temb=scanner.nextInt();
			
				//if(temb == 1 ) {
					themBanBe();
				//}
				//if(temb == 2 ) {
					xuat();
				//}
				//if(temb == 3 ) {
				//	break;
				//}
			}
		//}catch(Exception e) {
		//System.out.println("Ban nhap sai du lieu !");
		//}
			//System.out.println("----END----");
	}
}


