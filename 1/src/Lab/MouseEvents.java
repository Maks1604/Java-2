package Lab;

import java.applet.Applet;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEvents extends Applet implements MouseListener, MouseMotionListener {




    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        int button = e.getButton();
        Sprite[] sprites = MainCircles.sprites;
        if (button == 1) {
            Sprite[] newsprits = new Sprite[sprites.length+1];
            for (int i = 0; i <sprites.length; i++) {
                newsprits[i]= sprites[i];
            }
            newsprits[sprites.length] = new Ball();
            MainCircles.sprites = newsprits;
        } else if (button == 3) {
            Sprite[] newsprits = new Sprite[sprites.length-1];
            for (int i = 0; i < newsprits.length; i++) {
                newsprits[i]= sprites[i];
            }
            MainCircles.sprites = newsprits;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
