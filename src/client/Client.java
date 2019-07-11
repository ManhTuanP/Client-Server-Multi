// place this file the path such ends with: ChatServer/client/Client.java

package client;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static final String host = "localhost";
    //khai báo ip
    private static final int portNumber = 4444;
    //khai báo số port	
    private String userName;
    private String serverHost;
    private int serverPort;
    private Scanner userInputScanner;

    public static void main(String[] args){
        String readName = null; 
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input username:");
        while(readName == null || readName.trim().equals("")){ //Nhập tên trước khi kết nối server
            readName = scan.nextLine();
            if(readName.trim().equals("")){
                System.out.println("Invalid. Please enter again:");
            }
        }

        Client client = new Client(readName, host, portNumber); // gán giá trị tên/ip/port tới opject Client
        client.startClient(scan); //gọi startClient để bắt gói tin từ server 
    }
    //Setter
    private Client(String userName, String host, int portNumber){
        this.userName = userName;
        this.serverHost = host;
        this.serverPort = portNumber;
    }

    private void startClient(Scanner scan){
        try{
            Socket socket = new Socket(serverHost, serverPort);//kết nối đến server
            Thread.sleep(1000); //Ngủ 1 giây
            ServerThread serverThread = new ServerThread(socket, userName); 
            Thread serverAccessThread = new Thread(serverThread);
            serverAccessThread.start(); // Chạy luồng nhận dưc liệu từ server
            while(serverAccessThread.isAlive()){ // Trong khi luồng nhận dữ liệu còn chạy
                if(scan.hasNextLine()){				// Nếu dữ liệu từ server vẫn còn	
                    serverThread.addNextMessage(scan.nextLine()); 
                }
            }
        }catch(IOException ex){
            System.err.println("Fatal Connection error!");
            ex.printStackTrace();
        }catch(InterruptedException ex){
            System.out.println("Interrupted");
        }
    }
}