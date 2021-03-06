package grade.management.table;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import grade.management.vo.Score;

// 스태틱이든 인스턴스든 어떤것으로 변경해도 괜찮다.
public class ScoreTable {
  static ArrayList<Score> scores = new ArrayList<>();

  //static 블록으로 변경한다.
  static {
    try (BufferedReader in = new BufferedReader(new FileReader("./score.csv"));) {
      String line;

      while((line = in.readLine()) != null) { 
        scores.add(Score.fromCSV(line)); //csv형식으로 만들어서 ArrayList에 저장한다.
      }

    } catch(Exception e) {
      System.out.println("데이터 로딩 중 오류 발생!");
    }
  }

  private static void save() {
    try (PrintWriter out = new PrintWriter(new FileWriter("./score.csv"));){
      for (Score score : scores) {
        out.println(score.toCSV());
      }
    } catch (Exception e) {
      System.out.println("데이터 저장 중 오류 발생!");
    }
  }

  public static int insert(Score score) {
    scores.add(score);
    save();
    return 1;
  }

  public static Score[] selectList() {
    return scores.toArray(new Score[0]);
  }

  public static Score selectOne(int no) {
    return scores.get(no);
  }

  public static int update(int no, Score score) {
    scores.set(no, score);
    save();
    return 1;
  }

  public static int delete(int no) {
    scores.remove(no);
    save();
    return 1;
  }
}
