package dance.ballroom

import groovy.swing.SwingBuilder
import javax.swing.*
import java.awt.BorderLayout

class Skater {
    static void main(String[] args) {
      def skater = new Skater()
    }

    private JFrame mainFrame

    Skater() {
      def swingBuilder = new SwingBuilder()
      mainFrame = swingBuilder.frame(title: 'Skater',
                         defaultCloseOperation: JFrame.EXIT_ON_CLOSE,
                         size: [400, 500],
                         locationRelativeTo: null,
                         show: true) {
        borderLayout()

        panel(constraints: BorderLayout.NORTH) {
          button('OK', icon: imageIcon(url: getClass().getResource('../../red.jpg')))
        }
        panel(constraints: BorderLayout.SOUTH) {
          button('NG')
        }
      }
    }
}
