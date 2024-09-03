// Coding Challenge: Build Your Own wc Tool
class WCTool {
    public static void main(String[] args) {
        System.out.println("Running Program..."); 
        
        // Prompt user for command
        PromptUser promptUser = new PromptUser(null, null);
        promptUser.promptForUserInput();
    }
}