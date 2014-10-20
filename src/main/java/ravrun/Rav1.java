package ravrun;

import javafx.concurrent.Task;
import javax.swing.JOptionPane;

public class Rav1 {

    private String fname;

    public Rav1(String fname) {
        this.fname = fname;

    }

    public void execute() {
        Task task = new Task<Void>() {
            @Override
            public Void call() {
                System.out.println("File name is "+fname);
                String cmd1 = "rundll32 url.dll,FileProtocolHandler " + fname;
                try {
                     System.out.println("cmd1 "+cmd1);
                    Runtime.getRuntime().exec(cmd1);
                } catch (Exception ex) {
                    ex.printStackTrace();
                    if (ex.toString().contains("java.io.IOException: Cannot run program \"rundll32\"")) {
                        try {
                            Runtime rt = Runtime.getRuntime();
                            rt.exec("open " + fname);
                        } catch (Exception as) {
                            JOptionPane.showMessageDialog(null, "Open the Link:" + fname, "", 1);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Open the Link:" + fname, "", 1);
                    }
                }
                return null;
            }
        };
        new Thread(task).start();
    }
}
