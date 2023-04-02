package OOP.Workshops.WP5_1.network.src.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.charset.Charset;

public class TCPConnection {
    private final Socket socket;
    private final Thread rxThread;
    private final TCPConnectionListener eventListener;
    private final BufferedReader in;
    private final BufferedWriter out;

    public TCPConnection(Socket socket) throws IOException{
        this.eventListener = eventListener;
        this.socket = socket;
        in = new BufferedReader(new InputStreamReader(socket.getInputStream(), Charset.forName("UTF-8")));
        out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), Charset.forName("utf-8")));
        rxThread = new Thread(new Runnable() {
            @Override
            public void run(){
                try{
                    eventListener.onConnectionReady(TCPConnection.this);
                    while (!rxThread.isInterrupted()){}
                        eventListener.onReceiveString(TCPConnection.this, in.readLine());
                        // String msg = in.readLine();
                } catch (IOException e){

                } finally {

                }
            }
        });
        rxThread.start();
    }

    public synchronized void sendString(String value){
        try{
            out.write(value);
        } catch (IOException e){
            
        }
    }

    public synchronized void disconnect(){
        rxThread.interrupt();
        try {
            socket.close();
        } catch (IOException e) {
            eventListener.onException(TCPConnection.this, e);
        }
    }
    

}
