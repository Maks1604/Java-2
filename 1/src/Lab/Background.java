package Lab;

import java.awt.*;

public class Background {
    private GameCanvas gameCanvas;

    public Background (Color color, GameCanvas gameCanvas){
        this.gameCanvas = gameCanvas;
        gameCanvas.setBackground(color);
    }

    public void ubdate(float time){
        time*=1000000;

        if (time%10==0){
            gameCanvas.setBackground(Color.ORANGE);

        } else if (time%7==0){
            gameCanvas.setBackground(Color.MAGENTA);
        }else if (time%6 == 0){
            gameCanvas.setBackground(Color.CYAN);
        }else if (time%3 ==0) {
            gameCanvas.setBackground(Color.GRAY);
        }else if (time%2==0){
            gameCanvas.setBackground(Color.GREEN);
        }

    }

}
