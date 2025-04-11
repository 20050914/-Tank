package TankGames.Tankgame4;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

@SuppressWarnings({"all"})
public class TankGame04 extends JFrame {
    MyPanel mp= null;
    public static void main(String[] args) {
        new TankGame04();


    }
    public TankGame04(){
        System.out.println("请输入选择 1：新游戏 2：继续上局");
        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();

        mp = new MyPanel(key);
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);

        this.setSize(1300,800);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Recorder.keepRecorder();
                System.exit(0);
            }
        });
    }
}
