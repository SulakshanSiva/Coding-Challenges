import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {

    String fileName;
    String flag;
    int numBytes;
    int numLines;
    int numWords;
    
    public FileIO(String fName, String command){
        this.numBytes = 0;
        this.numLines = 0;
        this.numWords = 0;
    }

    public void readFile(){
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

    public void numOfBytesInFile(){
        File myFile = new File(fileName);
        String path = myFile.getAbsolutePath();

        setNumberOfBytes((int)myFile.length());
        // (int)(new File(path)).length()
    }

    public void printOutput(){
        System.out.println(this.flag);
    }

    public void setNumberOfBytes(int numOfBytes){
        this.numBytes = numOfBytes;
    }

    public int getNumberOfBytes(){
        return this.numBytes;
    }

}
