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
                System.out.println("The argument dose not match!!!");
        }
        return checker;
    }

    public boolean isChar(String subString){
        boolean checker = false;
        int lengthSubString = subString.length();
        if(lengthSubString == 1){
            char color = subString.charAt(0);
            if(Character.isLetter(color)) {
                checker = true;
            }
        }else
            System.out.println("Color must a type Character");
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
        }
        return checker;
    }
}
