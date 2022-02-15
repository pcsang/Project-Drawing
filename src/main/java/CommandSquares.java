import Message.ManageMessages;

public class CommandSquares extends CommandChecker{
    public CommandSquares(){
        super();
    }

    @Override
    public boolean checking(Command command) {
        boolean checker = false;
        String[] commandArr = super.format(command);
        if (commandArr.length == 5 && commandArr[0].equals("R")) {
            if (super.isNumber(commandArr[1]) && super.isNumber(commandArr[2])
                    && super.isNumber((commandArr[3])) && super.isNumber(commandArr[4])) {
                checker = true;
            } else
                System.out.println(ManageMessages.Messages_ArgumentNo.getMessage());
        }else
            System.out.println(ManageMessages.Messages_Check_Command.getMessage());
        return checker;
    }

    @Override
    public boolean checkingArgument(Canvas canvas, Command command) {
        boolean checker = false;
        String[] commandArr = super.format(command);
        int row1 = Integer.parseInt(commandArr[2]);
        int row2 = Integer.parseInt(commandArr[4]);
        int column1 = Integer.parseInt(commandArr[1]);
        int column2 = Integer.parseInt(commandArr[3]);
        if (row1 > 0 && row2 <= canvas.getHeight() && column1 > 0 && column2 <= canvas.getWidth()){
            if(row1 < row2 && column1 < column2){
                checker = true;
            }else
                System.out.println(ManageMessages.Messages_ArgumentNo.getMessage());
        }else
            System.out.println(ManageMessages.Messages_Check_Argument.getMessage());
        return checker;
    }
}
