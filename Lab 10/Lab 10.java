Задание 1
import java.applet.Applet;
import java.awt.*;

public class Task1 extends Applet {
    public void paint(Graphics g) {
        g.drawRect(50, 50, 100, 80);
        g.drawString("Прямоугольник", 50, 45);

        g.drawOval(200, 50, 80, 80);
        g.drawString("Круг", 200, 45);

        g.drawLine(50, 200, 200, 200);
        g.drawString("Линия", 100, 195);
    }
}

Задание 2
        import java.applet.Applet;
import java.awt.*;

public class Task2 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 80);

        g.setColor(Color.GREEN);
        g.fillOval(200, 50, 80, 80);

        g.setColor(Color.BLUE);
        g.fillRect(100, 150, 120, 80);
    }
}

Задание 3
        import java.applet.Applet;
import java.awt.*;

public class Task3 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.MAGENTA);
        g.drawString("Hello Java Applet", 100, 100);
    }
}

Задание 4
        import java.applet.Applet;
import java.awt.*;
        import java.awt.event.*;

public class Task4 extends Applet implements ActionListener {
    Button btn;
    String msg = "";

    public void init() {
        btn = new Button("Нажми");
        add(btn);
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        msg = "Кнопка нажата!";
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 100);
    }
}

Задание 5
        import java.applet.Applet;
import java.awt.*;
        import java.awt.event.*;

public class Task5 extends Applet implements ActionListener {
    Button btn;
    int count = 0;

    public void init() {
        btn = new Button("Click");
        add(btn);
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Нажатий: " + count, 50, 100);
    }
}

Задание 6
        import java.applet.Applet;
import java.awt.*;
        import java.awt.event.*;

public class Task6 extends Applet implements ActionListener {
    TextField tf;
    Button btn;
    String name = "";

    public void init() {
        tf = new TextField(20);
        btn = new Button("OK");

        add(tf);
        add(btn);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        name = tf.getText();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Привет, " + name, 50, 100);
    }
}

Задание 7
        import java.applet.Applet;
import java.awt.*;
        import java.awt.event.*;

public class Task7 extends Applet implements ActionListener {
    Button r, g, b;
    Color color = Color.BLACK;

    public void init() {
        r = new Button("Red");
        g = new Button("Green");
        b = new Button("Blue");

        add(r);
        add(g);
        add(b);

        r.addActionListener(this);
        g.addActionListener(this);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Red")) color = Color.RED;
        if (e.getActionCommand().equals("Green")) color = Color.GREEN;
        if (e.getActionCommand().equals("Blue")) color = Color.BLUE;
        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(100, 100, 100, 100);
    }
}

Задание 8
        import java.applet.Applet;
import java.awt.*;

public class Task8 extends Applet implements Runnable {
    int x = 0;

    public void init() {
        new Thread(this).start();
    }

    public void run() {
        while (true) {
            x += 5;
            if (x > getWidth()) x = 0;

            repaint();

            try {
                Thread.sleep(100);
            } catch (Exception e) {}
        }
    }

    public void paint(Graphics g) {
        g.fillOval(x, 100, 50, 50);
    }
}

Задание 9
        import java.applet.Applet;
import java.awt.*;
        import java.awt.event.*;

public class Task9 extends Applet implements MouseListener {
    int x = 0, y = 0;

    public void init() {
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    public void paint(Graphics g) {
        g.fillOval(x, y, 10, 10);
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}

Задание 10
        import java.applet.Applet;
import java.awt.*;
        import java.awt.event.*;

public class Task10 extends Applet implements ActionListener {
    TextField tf;
    Button btn;
    String text = "";
    Color color = Color.RED;

    public void init() {
        tf = new TextField(20);
        btn = new Button("Показать");

        add(tf);
        add(btn);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        text = tf.getText();

        color = new Color(
                (int)(Math.random()*255),
                (int)(Math.random()*255),
                (int)(Math.random()*255)
        );

        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(text, 50, 100);

        g.setColor(color);
        g.fillOval(50, 120, 100, 100);
    }
}