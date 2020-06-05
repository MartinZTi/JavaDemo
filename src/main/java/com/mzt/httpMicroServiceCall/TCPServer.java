package com.mzt.httpMicroServiceCall;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(8888);
		Socket socket = server.accept();
		InputStream is = socket.getInputStream();
		byte[] bytes = new byte[1024];
		int len = is.read(bytes);
		System.out.println(new String(bytes,0,len));
		OutputStream os = socket.getOutputStream();
		os.write("返回的数据".getBytes("utf-8"));
	}
}
