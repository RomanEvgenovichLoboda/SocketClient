
import Models.MyData;
import Models.User;
import org.json.JSONObject;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketClientExample {

    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException{
        //get the localhost IP address, if server is running on some other IP, you need to use that
        InetAddress host = InetAddress.getLocalHost();
        Socket socket = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        Scanner consol = new Scanner(System.in);
        while (true){
            System.out.print("\n\t\tMenu\n\t1 = Autorisation\n\t2 = Registration\n\t0 = Exit ");
            String menu = consol.nextLine();
            socket = new Socket(host.getHostName(), 9876);
            switch (menu){
                case "1"->{
                    System.out.print("Enter Login: ");
                    String log = consol.nextLine();
                    System.out.print("Enter Password: ");
                    String pass = consol.nextLine();
                    MyData mD = new MyData(new User(log,pass),false);
                    var myDjo = new JSONObject(mD);
                    String str = myDjo.toString();
                    oos = new ObjectOutputStream(socket.getOutputStream());
                    oos.writeObject(str);
                    ois = new ObjectInputStream(socket.getInputStream());
                    String message = (String) ois.readObject();
                    System.out.println("\nMessage: " + message);
                    ois.close();
                    oos.close();
                }
                case "2"->{
                    System.out.print("Enter Login: ");
                    String log = consol.nextLine();
                    System.out.print("Enter Password: ");
                    String pass = consol.nextLine();
                    User us = new User(log,pass);
                    MyData mD = new MyData(us,true);
                    var myDjo = new JSONObject(mD);
                    String str = myDjo.toString();
                    oos = new ObjectOutputStream(socket.getOutputStream());
                    oos.writeObject(str);
                    ois = new ObjectInputStream(socket.getInputStream());
                    String message = (String) ois.readObject();
                    System.out.println("\nMessage: " + message);
                    ois.close();
                    oos.close();
                }
                case "0"->{
                    oos = new ObjectOutputStream(socket.getOutputStream());
                    oos.writeObject("exit");
                    oos.close();
                    return;
                }
            }
        }
    }
}