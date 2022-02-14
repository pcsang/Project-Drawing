import java.util.Scanner;

public class Command {
    private String command;
    public Command(){

    }

    public Command(String com){
        command = com;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getCommand(){
        return command;
    }

}
