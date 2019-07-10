package Giaodien;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Danhsachbanbe extends Exception{
	//static ArrayList list = new ArrayList list;
	static danhSach list = new danhSach();
	static Scanner scanner = new Scanner(System.in);
	public static void themBanBe(){
		System.out.println("Usename:");
		list.name = scanner.next();
		list.portNumber = socket.getLocalPort());
		list.ipNumber = socket.getRemoteSocketAddress();
	}
	public static void xuat() {
		int size = list.size();
		if(size<1) {
			System.out.println("Ban chua nhap du lieu !");
        }else {
        	System.out.println("-----------------");
        	System.out.println("Danh sach ban be:");
        	for (int i = 0; i < size; i++) {
				System.out.print(list.get(i) + "\n");
        	}
        	System.out.println("-----------------");
        }
	}
	public static void main(String[] args) {
		try {
				System.out.println("1- Them ban be.\n2- Ds ban be.\n3- Ket thuc.");
			while(true) {	
				System.out.print("Lua Chon:");
				int temb;
				temb=scanner.nextInt();
			
				if(temb == 1 ) {
					themBanBe();
				}
				if(temb == 2 ) {
					xuat();
				}
				if(temb == 3 ) {
					break;
				}
			}
		}catch(Exception e) {
			System.out.println("Ban nhap sai du lieu !");
		}
		System.out.println("----END----");
	}
}
class danhSach{
	public String name;
	public int portNumber;
	public String ipNumber;
}

