// Coding Challenge: Build Your Own wc Tool
class WCTool {
    public static void main(String[] args) {
        System.out.println("Running Program..."); 

        // Prompt user for command
        PromptUser promptUser = new PromptUser(null, null);
        promptUser.promptForUserInput();
        promptUser.closeScanner();

        FileIO fileIO = new FileIO(promptUser.getFileName(), promptUser.getOption());
        // fileIO.printOutput();
        // fileIO.readFile();

        System.out.println(fileIO.getNumberOfBytes());

    }
}