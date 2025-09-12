package _2025_09_06_DesignPattern._2025_09_11_02_Abstraction;

public class MailService {
    public void sendMail(){
        connect(1);
        authenticate();
        //send mail
        disconnect();

    }

    private void connect(int timeout){
        System.out.println("Connect");
    }

    private void disconnect(){
        System.out.println("Disconnect");
    }

    private void authenticate(){
        System.out.println("Authenticate");
    }
}
