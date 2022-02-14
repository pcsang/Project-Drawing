public class Line extends ShapeDrawing {
    public Line(){
        super();
    }

    CommandChecker line = new CommandLine();

    @Override
    public void draw(Canvas canvas, Command command){
        if(line.checking(command)){
            String[] commandArr = line.format(command);
            int row1 = Integer.parseInt(commandArr[2]);
            int row2 = Integer.parseInt(commandArr[4]);
            int column1 = Integer.parseInt(commandArr[1]);
            int column2 = Integer.parseInt(commandArr[3]);

            if(line.checkingArgument(canvas, command)) {
                if (row1 == row2)
                    drawColum(canvas, row1, column1, column2);
                if (column1 == column2){
                    drawRow(canvas, column1, row1, row2);
                }
            }else
                System.out.println("Please check argument of command");
        }else
            System.out.println(" Please check command !!!");
    }

    public void drawColum(Canvas canvas, int row, int colum_1, int colum_2){
        char[][] can = canvas.getCanvas();
        can[row][colum_1]='x';
        if(colum_1>=colum_2)
            return;
        drawColum(canvas, row, colum_1+1,colum_2);
    }

    public void drawRow(Canvas canvas, int colum, int row_1, int row_2){
        char[][] can = canvas.getCanvas();
        can[row_1][colum]='x';
        if(row_1 >= row_2)
            return;
        drawRow(canvas, colum, row_1+1, row_2);
    }
}
