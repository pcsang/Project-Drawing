public class Squares extends ShapeDrawing {
    public Squares(){
        super();
    }

    CommandChecker squares = new CommandSquares();
    //ShapeDrawing line = new Line();
    @Override
    public void draw(Canvas canvas, Command command) {
        if(squares.checking(command)){
            if(squares.checkingArgument(canvas, command)){
                drawingLine(canvas, command);
                super.show(canvas);
            }
        }
    }

    public void drawingLine(Canvas canvas, Command command){
        String[] commandArr = squares.format(command);
        int row1 = Integer.parseInt(commandArr[2]);
        int row2 = Integer.parseInt(commandArr[4]);
        int column1 = Integer.parseInt(commandArr[1]);
        int column2 = Integer.parseInt(commandArr[3]);
        ShapeDrawing line = new Line();
        String command1 = "L "+column1+" "+ row1+" "+column2+" "+row1;
        Command line1 = new Command(command1);
        line.draw(canvas, line1);

        String command2 = "L "+column1+" "+row2+" "+column2+" "+row2;
        Command line2 = new Command(command2);
        line.draw(canvas, line2);

        String command3 = "L "+column1+" "+row1+" "+column1+" "+row2;
        Command line3 = new Command(command3);
        line.draw(canvas, line3);

        String command4 = "L "+column2+" "+row1+" "+column2+" "+row2;
        Command line4 = new Command(command4);
        line.draw(canvas, line4);
    }
}
