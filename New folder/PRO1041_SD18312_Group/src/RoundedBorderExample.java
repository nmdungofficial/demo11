import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import javax.swing.border.CompoundBorder;

public class RoundedBorderExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Rounded Border Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setUndecorated(true);

        JPanel panel = new JPanel();

        // Tạo đường viền với góc bo và màu sắc được chỉ định
        Border lineBorder = BorderFactory.createLineBorder(Color.BLACK, 2);
        Border roundedBorder = new RoundedCornerBorder(20); // 10 là bán kính của góc bo

        // Kết hợp cả đường viền thẳng và đường viền bo
        Border compoundBorder = new CompoundBorder(lineBorder, roundedBorder);

        // Đặt đường viền cho JPanel
        panel.setBorder(compoundBorder);

        frame.getContentPane().add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class RoundedCornerBorder implements Border {
    private int radius;

    public RoundedCornerBorder(int radius) {
        this.radius = radius;
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(radius, radius, radius, radius);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g.create();

        // Vẽ góc bo
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.BLUE);
        g2.drawRoundRect(x, y, width - 1, height - 1, radius, radius);

        g2.dispose();
    }
}
