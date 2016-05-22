import groovy.swing.SwingBuilder
import javax.swing.*

class Skater {
    static void main(String[] args) {
      def swingBuilder = new SwingBuilder()
      swingBuilder.frame(title: 'Skater',
                         defaultCloseOperation: JFrame.EXIT_ON_CLOSE,
                         size: [400, 500],
                         show: true) {
      }
    }
}
