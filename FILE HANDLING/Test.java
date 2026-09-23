import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Test {

    File fh = new File("C:\\Users\\om sai\\OneDrive\\Desktop\\java workspace\\FILE HANDLING\\TRYFILE\\A.xlsx");

    public void createFile() {

        boolean exists = fh.exists();

        if (exists) {
            System.out.println("File already exists and its name is - " + fh.getName());
        } else {
            try {
                boolean created = fh.createNewFile();

                if (created) {
                    System.out.println("File created with name - " + fh.getName());
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void AdditionalFn() {

        boolean canRead = fh.canRead();
        System.out.println(canRead);

        boolean canWrite = fh.canWrite();
        System.out.println(canWrite);

        String path = fh.getAbsolutePath();
        System.out.println(path);

        System.out.println(fh.getName());

        long len = fh.length();
        System.out.println(len);
    }

    public void deleteFile() {

        File fh = new File("C:\\Users\\om sai\\OneDrive\\Desktop\\java workspace\\FILE HANDLING\\TRYFILE\\A.csv");

        if (fh.exists()) {
            boolean res = fh.delete();

            if (res) {
                System.out.println("File deleted successfully");
            } else {
                System.out.println("File could not be deleted");
            }
        } else {
            System.out.println("File does not exist");
        }
    }

    public void writeData() {

        try {
            FileWriter fw = new FileWriter("C:\\Users\\om sai\\OneDrive\\Desktop\\java workspace\\FILE HANDLING\\TRYFILE\\A.txt", true);

            fw.write("This is 1st line\n");
            fw.write("This is 2nd line\n");
            fw.write("This is 3rd line\n");
            fw.write("This is 4th line\n");
            fw.write("This is fifth line\n");

            fw.write("New line appended with help of true in path\n");

            fw.close();

            System.out.println("Data written in file successfully");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void readData() {

        try {
            File fh = new File("C:\\Users\\om sai\\OneDrive\\Desktop\\java workspace\\FILE HANDLING\\TRYFILE\\A.txt");

            Scanner sc = new Scanner(fh);

            while (sc.hasNext()) {
                String line = sc.nextLine();
                System.out.println(line);
            }

            sc.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        Test t = new Test();

        // t.createFile();
        // t.AdditionalFn();
        // t.deleteFile();
        // t.writeData();
        t.readData();
    }
}