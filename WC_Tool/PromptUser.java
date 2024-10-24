import java.util.Scanner;  // Import the Scanner class

public class PromptUser {
    private String option;
    private String fileName;
    Scanner inputScanner;

    // Constructor 
    public PromptUser(String option, String fileName){
        this.option = null;
        this.fileName = null;
        inputScanner = new Scanner(System.in);
    }

    public void promptForUserInput(){
        System.out.println("Enter the command: ");
        String cmd = inputScanner.nextLine();
        parseInput(cmd);
    }

    public void parseInput(String command){
        String regex = " ";

        String arr[] = command.split(regex);

        setOption(arr[0]);
        setFileName(arr[1]);
    }

    public void closeScanner(){
        inputScanner.close();
    }

    // Getters
    public String getOption() {
        return option;
    }

    public String getFileName() {
        return fileName;
    }

    // Setters
    public void setOption(String opt) {
        this.option = opt;
    }

    public void setFileName(String fName) {
        this.fileName = fName;
    }

}
