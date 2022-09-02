package kh.java.func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class TcpServer {

	public void tcpServer() {
		Scanner sc = new Scanner(System.in);
		//1. 서버에서 사용할 포트번호 지정
		//2. 0 ~ 65535 번호사이에 1개를 사용
		//0 ~ 1000 사이 번호는 사용중인 번호가 많으므로 1000번 이후를 사용

		int port = 7777;

		// 반환할 객체 미리 선언
		// 서버에서 포트를 열기위한 객체
		ServerSocket server = null;

		// 데이터 주고받기위한 보조스트림

		DataOutputStream dos = null;
		DataInputStream dis = null;

		try {
			//2. 서버소켓객체 생성
			// 생성자 매개변수로 전달한 포트번호가 열리면서 서버 대기 상태
			server = new ServerSocket(port);
			System.out.println("[서버 준비 완료]");
			System.out.println("클라이언트 접속 요청 대기중.....");

			//3. server.accept() : 클라이언트 접속 요청 대기
			//4. 접속요청이 들어오면 수락해서 통신할 객체를 생성
			Socket client = server.accept();
			System.out.println("클라이언트 접속 완료 !!");

			//5. 데이터를 주고받기 위한 스트림 추출
			// 소켓안에 이미 스트림이 존재(양방향)
			OutputStream out = client.getOutputStream();
			InputStream in = client.getInputStream();

			//6. 보조스트림으로 성능개선

			dos = new DataOutputStream(out);
			dis = new DataInputStream(in);
			//7. 스트림을 통한 입력 및 출력
			String clientMsg = dis.readUTF();
			System.out.println(clientMsg);
			System.out.print("클라이언트에 전송 할 메세지 : ");
			String sendToClientMsg = sc.nextLine();
			dos.writeUTF(sendToClientMsg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dis.close();
				dos.close();
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void serverTest1() {
		Scanner sc = new Scanner(System.in);

		int port = 9999;

		ServerSocket server = null;

		DataOutputStream dos = null;
		DataInputStream dis = null;

		try {
			server = new ServerSocket(port);
			System.out.println("[서버 준비 완료]");
			System.out.println("클라이언트 접속 요청을 기다립니다.....");

			Socket client = server.accept();
			System.out.println("클라이언트 접속 완료");

			OutputStream out = client.getOutputStream();
			InputStream in = client.getInputStream();

			dos = new DataOutputStream(out);
			dis = new DataInputStream(in);

			while (true) {
				System.out.print("나 : ");
				String sendToClient = sc.nextLine();
				dos.writeUTF(sendToClient);
				if (sendToClient.equals("exit")) {
					break;
				}
				String clientMsg = dis.readUTF();
				if (clientMsg.equals("exit")) {
					break;
				}
				System.out.println("[client] : " + clientMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
				dos.close();
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void DNSServerTest1() {

		HashMap<String, String> DNS = new HashMap<String, String>();
		DNS.put("www.naver.com", "125.209.222.142");
		DNS.put("www.google.com", "172.217.175.4");
		DNS.put("www.iei.or.kr", "211.43.14.187");

		Scanner sc = new Scanner(System.in);

		int port = 8888;

		ServerSocket server = null;

		DataOutputStream dos = null;
		DataInputStream dis = null;
		try {

			server = new ServerSocket(port);
			System.out.println("DNS 서버 준비완료");
			int count = 1;
			while (true) {
				System.out.println("클라이언트 요청대기상태");

				Socket client = server.accept();

				OutputStream out = client.getOutputStream();
				InputStream in = client.getInputStream();

				dos = new DataOutputStream(out);
				dis = new DataInputStream(in);

				String clientMsg = dis.readUTF();

				if (DNS.containsKey(clientMsg)) {
					dos.writeUTF("[" + clientMsg + "] 의 주소는 " + DNS.get(clientMsg) + "입니다.");
				} else {
					dos.writeUTF("주소가 없습니다.");
				}
				System.out.println("요청" + (count++) + "건 처리 완료");
				System.out.print("서버를 종료 하시겠습니까[y/n]?");
				String exitMsg = sc.nextLine();
				if (exitMsg.equals("y")) {
					break;
				} else if (exitMsg.equals("n")) {
					continue;
				} else {
					System.out.println("잘못 입력하셨습니다. 서버를 종료합니다.");
					break;
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				dis.close();
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void baseballServer() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		ArrayList<Integer> serverList = new ArrayList<>(); // 랜덤숫자 세개 배열
		ArrayList<Integer> clientList = new ArrayList<>(); // 랜덤숫자 세개 배열
		int strike = 0;
		int ball = 0;
		int count = 1;

		int port = 8899;

		ServerSocket server = null;

		DataOutputStream dos = null;
		DataInputStream dis = null;

		try {
			server = new ServerSocket(port);
			System.out.println("<<<<<< Baseball Game >>>>>>");
			while (count <= 10) {

				System.out.println("클라이언트의 접속을 기다립니다.");

				Socket client = server.accept();
				OutputStream out = client.getOutputStream();
				InputStream in = client.getInputStream();

				dos = new DataOutputStream(out);
				dis = new DataInputStream(in);
				System.out.println("클라이언트가 접속 했습니다.");

				while (serverList.size() < 3) {
					int num = r.nextInt(10);
					if (!serverList.contains(num)) {
						serverList.add(num);
					}
				}

				System.out.println("서버숫자 : " + serverList.get(0) + " " + serverList.get(1) + " " + serverList.get(2));
				System.out.println("<<<<<< Game Start >>>>>>");

				for (int i = 0; i < serverList.size(); i++) {
					int clientNum = dis.readInt();
					clientList.add(clientNum);
				}

				System.out.println(
						"클라이언트가 입력한 수 -> " + clientList.get(0) + " " + clientList.get(1) + " " + clientList.get(2));

				for (int i = 0; i < clientList.size(); i++) {
					if (serverList.contains(clientList.get(i))) {
						if (serverList.get(i) == clientList.get(i)) {
							strike++;
						} else {
							ball++;
						}
					}
				}
				if(strike == 3) {
					dos.writeUTF(count + "회 -----> " + strike + "스트라이크");
					dos.writeUTF("축하합니다.");
					dos.writeUTF("프로그램을 종료합니다.");
					break;
				} else {
					dos.writeUTF(count + "회 -----> " + strike + "스트라이크" + ball + "볼");
					System.out.println(strike + "스트라이크" + ball + "볼");
				}
				clientList.clear();
				count++;
				strike = 0;
				ball = 0;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				dis.close();
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	
	
	
	
	
	
	
	public void
}