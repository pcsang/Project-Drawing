public class CommandSquares extends CommandChecker{
    public CommandSquares(){
        super();
    }

    @Override
    public boolean checking(Command command) {
        boolean checker = false;
        String[] arrCommand = super.format(command);
        if (arrCommand.length == 5 && arrCommand[0].equals("R")) {
            if (super.isNumber(arrCommand[1]) && super.isNumber(arrCommand[2])
                    && super.isNumber((arrCommand[3])) && super.isNumber(arrCommand[4])) {
                checker = true;
            } else
                System.out.println("The argument dose not match!!");
        }
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
                System.out.println("The argument dose not match!!!");
        }else
            System.out.println("Please check argument!!!");
        return checker;
    }
}
