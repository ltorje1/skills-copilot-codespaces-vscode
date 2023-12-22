import java.util.Scanner;

public class Main {
    private ConsoleArgumentsReader consoleReader = new ConsoleArgumentsReader();
    
    public class ConsoleArgumentsReader {
        public void readAndPush(ConsoleArgumentsWriter writer) {
            Scanner scanner = new Scanner(System.in);
            String input = "";
            while (!input.equals("exit")) {
                input = scanner.nextLine();
                writer.write(input);
            }
            scanner.close();
        }
    }
    
    public interface ConsoleArgumentsWriter {
        void write(String output);
    }
    
    void run() {
        consoleReader.readAndPush(new ConsoleArgumentsWriter() {
            @Override
            public void write(String output) {
                System.out.println(output);
            }
        });
    }
    
    public static void main(String[] args) {
        new Main().run();        
    }
}
        public void readAndPush(ConsoleArgumentsWriter writer) {
            Scanner scanner = new Scanner(System.in);
            String input = "";
            while (!input.equals("exit")) {
                input = scanner.nextLine();
                writer.write(input);
            }
            scanner.close();
        }
    }
    
    public class ConsoleArgumentsWriter {
        public void write(String output) {
            System.out.println(output);
        }
    }
    
    void run() {
        consoleReader.readAndPush(consoleWriter);
    }
    
    public static void main(String[] args) {
        new Main().run();        
    }
}
