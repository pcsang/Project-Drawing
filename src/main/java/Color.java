public class Color extends ShapeDrawing{
    public Color(){
        super();
    }
    CommandChecker color = new CommandColor();

    @Override
    public void draw(Canvas canvas, Command command) {
        if(color.checking(command)){
            if(color.checkingArgument(canvas, command)){
                drawColor(canvas, command);
                super.show(canvas);
            }
        }
    }

    public void drawColor(Canvas canvas, Command command){
        String [] commandArr = color.format(command);
        int row = Integer.parseInt(commandArr[2]);
        int column = Integer.parseInt(commandArr[1]);
        char colorChar = commandArr[3].charAt(0);
        char[][] can = canvas.getCanvas();
        if(row > 0 && column > 0 && row <= canvas.getHeight() && column <= canvas.getWidth()){
            char cell = can[row][column];
            if(cell == 'x' || cell == colorChar){
                return;
            }else{
                can[row][column]=colorChar;
                command.setCommand("B " + (column - 1) + " " + row + " " + colorChar);
                drawColor(canvas, command);

                command.setCommand("B " + (column + 1) + " " + row + " " + colorChar);
                drawColor(canvas, command);

                command.setCommand("B " + column + " " + (row - 1) + " " + colorChar);
                drawColor(canvas, command);

                command.setCommand("B " + column + " " + (row + 1) + " " + colorChar);
                drawColor(canvas, command);
            }
        }else
            return;
    }
}
