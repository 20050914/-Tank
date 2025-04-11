package TankGames.Tankgame4;

import java.util.Vector;

@SuppressWarnings({"all"})
public class Enemytank extends Tank implements Runnable{
    public Enemytank(int x, int y) {
        super(x, y);
    }
    boolean isLive = true;
    Vector<Shot> shots = new Vector<>();
    Vector<Enemytank> enemytanks = new Vector<>();

    public void setEnemytanks(Vector<Enemytank> enemytanks) {
        this.enemytanks = enemytanks;
    }

    public boolean isTouchEnemytank(){
        switch (this.getDirect()){
            case 0://向上
                for (int i=0;i<enemytanks.size();i++){
                    Enemytank enemytank = enemytanks.get(i);
                    //不和自己比较
                    if(enemytank!=this){
                        //如果敌人坦克是上/下
                        //敌人坦克的X的范围[enemytank.getX(),enemytank.getX()+40]
                        //敌人坦克的Y的范围[enemytank.getY(),enemytank.getY()+60]
                        if(enemytank.getDirect()==0||enemytank.getDirect()==2){
                            //当前坦克的左上 X坐标[this.getX(),this.getY()]
                            if(this.getX()>=enemytank.getX()
                                    &&this.getX()<=enemytank.getX()+40
                                    &&this.getY()>=enemytank.getY()
                                    &&this.getY()<=enemytank.getY()+60){
                                return true;
                            }
                            //当前坦克的右上 X坐标[this.getX()+40,this.getY()]
                            if(this.getX() +40>=enemytank.getX()
                                    &&this.getX() +40<=enemytank.getX()+40
                                    &&this.getY()>=enemytank.getY()
                                    &&this.getY()<=enemytank.getY()+60){
                                return true;
                        }
                        //如果敌人坦克是右/左
                        //敌人坦克的X的范围[enemytank.getX(),enemytank.getX()+60]
                        //敌人坦克的Y的范围[enemytank.getY(),enemytank.getY()+40]
                        if(enemytank.getDirect()==1||enemytank.getDirect()==3){
                            //当前坦克的左上 X坐标[this.getX(),this.getY()]
                            if(this.getX()>=enemytank.getX()
                                    &&this.getX()<=enemytank.getX()+60
                                    &&this.getY()>=enemytank.getY()
                                    &&this.getY()<=enemytank.getY()+40){
                                return true;
                            }
                            //当前坦克的右上 X坐标[this.getX()+40,this.getY()]
                            if(this.getX() +40>=enemytank.getX()
                                    &&this.getX() +40<=enemytank.getX()+60
                                    &&this.getY()>=enemytank.getY()
                                    &&this.getY()<=enemytank.getY()+40){
                                return true;
                            }

                        }

                    }
                    }

                }
                break;
            case 1://向右
                for (int i=0;i<enemytanks.size();i++){
                    Enemytank enemytank = enemytanks.get(i);
                    //不和自己比较
                    if(enemytank!=this){
                        //如果敌人坦克是上/下
                        //敌人坦克的X的范围[enemytank.getX(),enemytank.getX()+40]
                        //敌人坦克的Y的范围[enemytank.getY(),enemytank.getY()+60]
                        if(enemytank.getDirect()==0||enemytank.getDirect()==2){
                            //当前坦克的右上 X坐标[this.getX()+60,this.getY()]
                            if(this.getX()+60>=enemytank.getX()
                                    &&this.getX()+60<=enemytank.getX()+40
                                    &&this.getY()>=enemytank.getY()
                                    &&this.getY()<=enemytank.getY()+60){
                                return true;
                            }
                            //当前坦克的右下 X坐标[this.getX()+60,this.getY()+40]
                            if(this.getX() +60>=enemytank.getX()
                                    &&this.getX() +60<=enemytank.getX()+40
                                    &&this.getY()+40>=enemytank.getY()
                                    &&this.getY()+40<=enemytank.getY()+60){
                                return true;
                            }
                            //如果敌人坦克是右/左
                            //敌人坦克的X的范围[enemytank.getX(),enemytank.getX()+60]
                            //敌人坦克的Y的范围[enemytank.getY(),enemytank.getY()+40]
                            if(enemytank.getDirect()==1||enemytank.getDirect()==3){
                                //当前坦克的右上 X坐标[this.getX()+60,this.getY()]
                                if(this.getX()+60>=enemytank.getX()
                                        &&this.getX() +60<=enemytank.getX()+60
                                        &&this.getY()>=enemytank.getY()
                                        &&this.getY()<=enemytank.getY()+40){
                                    return true;
                                }
                                //当前坦克的右下 X坐标[this.getX()+60,this.getY()+40]
                                if(this.getX() +60>=enemytank.getX()
                                        &&this.getX() +60<=enemytank.getX()+60
                                        &&this.getY()+40>=enemytank.getY()
                                        &&this.getY()+40<=enemytank.getY()+40){
                                    return true;
                                }

                            }

                        }
                    }

                }
                break;
            case 2://向下
                for (int i=0;i<enemytanks.size();i++){
                    Enemytank enemytank = enemytanks.get(i);
                    //不和自己比较
                    if(enemytank!=this){
                        //如果敌人坦克是上/下
                        //敌人坦克的X的范围[enemytank.getX(),enemytank.getX()+40]
                        //敌人坦克的Y的范围[enemytank.getY(),enemytank.getY()+60]
                        if(enemytank.getDirect()==0||enemytank.getDirect()==2){
                            //当前坦克的左下 X坐标[this.getX(),this.getY()+60]
                            if(this.getX()>=enemytank.getX()
                                    &&this.getX()<=enemytank.getX()+40
                                    &&this.getY()+60>=enemytank.getY()
                                    &&this.getY()+60<=enemytank.getY()+60){
                                return true;
                            }
                            //当前坦克的右下 X坐标[this.getX()+40,this.getY()+60]
                            if(this.getX() +40>=enemytank.getX()
                                    &&this.getX() +40<=enemytank.getX()+40
                                    &&this.getY()+60>=enemytank.getY()
                                    &&this.getY()+60<=enemytank.getY()+60){
                                return true;
                            }
                            //如果敌人坦克是右/左
                            //敌人坦克的X的范围[enemytank.getX(),enemytank.getX()+60]
                            //敌人坦克的Y的范围[enemytank.getY(),enemytank.getY()+40]
                            if(enemytank.getDirect()==1||enemytank.getDirect()==3){
                                //当前坦克的左下 X坐标[this.getX(),this.getY()+60]
                                if(this.getX()>=enemytank.getX()
                                        &&this.getX() <=enemytank.getX()+60
                                        &&this.getY()+60>=enemytank.getY()
                                        &&this.getY()+60<=enemytank.getY()+40){
                                    return true;
                                }
                                //当前坦克的右下 X坐标[this.getX()+40,this.getY()+60]
                                if(this.getX() +40>=enemytank.getX()
                                        &&this.getX() +40<=enemytank.getX()+60
                                        &&this.getY()+60>=enemytank.getY()
                                        &&this.getY()+60<=enemytank.getY()+40){
                                    return true;
                                }

                            }

                        }
                    }

                }
                break;
            case 3://向左
                for (int i=0;i<enemytanks.size();i++){
                    Enemytank enemytank = enemytanks.get(i);
                    //不和自己比较
                    if(enemytank!=this){
                        //如果敌人坦克是上/下
                        //敌人坦克的X的范围[enemytank.getX(),enemytank.getX()+40]
                        //敌人坦克的Y的范围[enemytank.getY(),enemytank.getY()+60]
                        if(enemytank.getDirect()==0||enemytank.getDirect()==2){
                            //当前坦克的左上 X坐标[this.getX(),this.getY()]
                            if(this.getX()>=enemytank.getX()
                                    &&this.getX()<=enemytank.getX()+40
                                    &&this.getY()>=enemytank.getY()
                                    &&this.getY()<=enemytank.getY()+60){
                                return true;
                            }
                            //当前坦克的左下 X坐标[this.getX(),this.getY()+40]
                            if(this.getX() >=enemytank.getX()
                                    &&this.getX() <=enemytank.getX()+40
                                    &&this.getY()+40>=enemytank.getY()
                                    &&this.getY()+40<=enemytank.getY()+60){
                                return true;
                            }
                            //如果敌人坦克是右/左
                            //敌人坦克的X的范围[enemytank.getX(),enemytank.getX()+60]
                            //敌人坦克的Y的范围[enemytank.getY(),enemytank.getY()+40]
                            if(enemytank.getDirect()==1||enemytank.getDirect()==3){
                                //当前坦克的左上 X坐标[this.getX(),this.getY()+40]
                                if(this.getX()>=enemytank.getX()
                                        &&this.getX() <=enemytank.getX()+60
                                        &&this.getY()>=enemytank.getY()
                                        &&this.getY()<=enemytank.getY()+40){
                                    return true;
                                }
                                //当前坦克的左下 X坐标[this.getX(),this.getY()+60]
                                if(this.getX()>=enemytank.getX()
                                        &&this.getX() <=enemytank.getX()+60
                                        &&this.getY()+40>=enemytank.getY()
                                        &&this.getY()+40<=enemytank.getY()+40){
                                    return true;
                                }

                            }

                        }
                    }

                }
                break;
        }
        return false;
    }





    @Override
    public void run() {
        while(true){
            if(isLive && shots.size() < 1){
                Shot s = null;
                switch (getDirect()){
                    case 0:
                        s = new Shot(getX()+20,getY(),0);
                        break;
                    case 1:
                        s = new Shot(getX()+60,getY()+20,1);
                        break;
                    case 2:
                        s = new Shot(getX()+20,getY()+60,2);
                        break;
                    case 3:
                        s = new Shot(getX(),getY()+20,3);
                        break;
                }
                shots.add(s);
                new Thread(s).start();
            }





            setDirect((int)(Math.random()*4));
            switch (getDirect()){
                case 0:
                    for (int i = 0; i < 30; i++) {
                        if(getY()>0&&!isTouchEnemytank()){
                        moveUp();
                    }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < 30; i++) {
                        if(getX()+60<1000&&!isTouchEnemytank()) {
                            moveRight();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < 30; i++) {
                        if(getY()+60<750&&!isTouchEnemytank()) {
                            moveDown();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < 30; i++) {
                        if(getX()>0&&!isTouchEnemytank()) {
                            moveLeft();
                        }
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
            }

            //setDirect(3);
            if(!isLive){
                break;
            }
        }
    }
}
