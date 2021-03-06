package grade.management;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import grade.management.table.ScoreTable;
import grade.management.vo.Score;

public class ServerApp {

  public static void main(String[] args) {
    new ServerApp().service();
  }

  // c/s프로그램으로 변환함으로 클라이언트로부터 명령을 받아야 한다.
  // 사용자에게 입력받는 코드를 모두 삭제한다.
  public void service() {

    try (ServerSocket serverSocket = new ServerSocket(3336);) {
      System.out.println("서버 실행 중...");

      while(true) {
        new RequestHandler(serverSocket.accept()).start(); //스레드를 가동시킬 때는 start()
        //serverSocket.accept()서버가 클라이언트를 accept해야 RequestHandler의 생성자가 객체를 생성한다.
      } //while (true)

    } catch (Exception e) {
      System.out.println("서버 실행 오류!");
    } 
    System.out.println("종료");
  }

  private static class RequestHandler extends Thread {

    Socket socket;

    public RequestHandler(Socket socket) {
      this.socket = socket;
    }

    @Override
    public void run() {
      try (
          Socket socket2 = socket;// -> 작성하지 않아도 try문을 나갈 때 close()가 되도록 작성하였다. 작성하지 않으면 따로 close()를 해줘야 한다.
          ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
          ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());) {

        System.out.println("클라이언트가 접속했습니다.");

        while (true) {
          String command = in.readUTF();
          if (command.equals("quit")) {
            break;
          }

          try {
            switch (command) {
              case "insert":
                Score score = (Score) in.readObject();
                int count = ScoreTable.insert(score);
                out.writeUTF("success");
                out.writeInt(count);
                break;
              case "selectList":
                Score[] scores = ScoreTable.selectList();
                out.writeUTF("success");
                out.writeObject(scores);
                break;
              case "selectOne":
                int no = in.readInt();
                score = ScoreTable.selectOne(no);
                out.writeUTF("success");
                out.writeObject(score);
                break;
              case "update":
                no = in.readInt();
                score = (Score) in.readObject();
                count = ScoreTable.update(no, score);
                out.writeUTF("success");
                out.writeInt(count);
                break;
              case "delete":
                no = in.readInt();
                count = ScoreTable.delete(no);
                out.writeUTF("success");
                out.writeInt(count);
                break;
              default:
                out.writeUTF("fail");
                out.writeUTF("해당 명령을 지원하지 않습니다.");
            }
            out.flush();
          } catch (Exception e) {
            out.writeUTF("fail");
            out.writeUTF("실행오류: " + e.getMessage());
            out.flush();
          }
        } //while (true)
        System.out.println("클라이언트와 연결을 끊었습니다.");

      } catch (Exception e) {
        System.out.println("클라이언트와 통신 중 오류 발생!");
      }
    }
  }
}