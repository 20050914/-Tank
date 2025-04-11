package TankGames.Tankgame4;

import java.io.*;
import java.util.Stack;
import java.util.Vector;

@SuppressWarnings({"all"})
public class Recorder {
    private static int allEnemyTankNum=0;
    private static BufferedWriter  bw = null;
    private static String recorder = "src\\myRecore.txt";
    private static Vector<Enemytank> enemytanks = new Vector<>();
    public static Vector<Node> nodes = new Vector<>();
    private static BufferedReader br = null;
    private static int all;

    public static void setEnemytanks(Vector<Enemytank> enemytanks) {
        Recorder.enemytanks = enemytanks;
    }

    public static String getRecorder() {
        return recorder;
    }

    public static Vector<Node> getNodesAndEnemyTank(){
        try {
            br = new BufferedReader(new FileReader(recorder));
            allEnemyTankNum = Integer.parseInt(br.readLine());

            String line="";
            while ((line = br.readLine())!= null){
                String[] split = line.split(" ");
                Node node = new Node(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
                nodes.add(node);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(br!=null){
                    br.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return nodes;
    }

    public static void keepRecorder(){
        try {
            bw = new BufferedWriter(new FileWriter(recorder));
            bw.write(allEnemyTankNum+"\r\n");
            for (int i = 0; i < enemytanks.size(); i++) {
                Enemytank enemytank = enemytanks.get(i);
                if(enemytank.isLive){
                    String recorder = enemytank.getX()+" "+enemytank.getY()+" "+ enemytank.getDirect();
                    bw.write(recorder+"\r\n");
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }


    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }
    public static void addallEnemyTankNum(){
        Recorder.allEnemyTankNum++;
    }
}
