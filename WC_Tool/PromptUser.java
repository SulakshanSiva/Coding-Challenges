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
        String cmd = inputScanner.nextLine();
        System.out.println("Command is: " + cmd);
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
