import Message.ManageMessages;

public class CommandColor extends CommandChecker{
    public CommandColor(){
        super();
    }

    @Override
    public boolean checking(Command command) {
        boolean checker = false;
        String[] commandArr = super.format(command);
        if(commandArr.length == 4 && commandArr[0].equals("B")){
            if(super.isNumber(commandArr[1]) && super.isNumber(commandArr[2]) && isChar(commandArr[3])){
                checker = true;
            }else
                System.out.println(ManageMessages.Messages_ArgumentNo.getMessage());
        }else
            System.out.println(ManageMessages.Messages_Check_Command.getMessage());
        return checker;
    }

    public boolean isChar(String subString){
        boolean checker = false;
        int lengthSubString = subString.length();
        if(lengthSubString == 1){
            checker = true;
        }else
            System.out.println(ManageMessages.Messages_NotTypeChar.getMessage());
        return checker;
    }

    @Override
    public boolean checkingArgument(Canvas canvas, Command command) {
        boolean checker = false;
        String[] commandArr = super.format(command);
        int row = Integer.parseInt(commandArr[2]);
        int column = Integer.parseInt(commandArr[1]);
        if(row > 0 && column > 0 && row <= canvas.getHeight() && column <= canvas.getWidth()){
            checker = true;
        }else
            System.out.println(ManageMessages.Messages_Check_Argument.getMessage());
        return checker;
    }
}
