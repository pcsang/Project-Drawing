public class CanvasCreat extends ShapeDrawing {
    public CanvasCreat(){
        super();
    }
    CommandChecker create = new CommandCreate();

    @Override
    public void draw(Canvas canvas, Command command) {
        if(create.checking(command)){
            String[] commandArr = create.format(command);
            int height = Integer.parseInt(commandArr[2]);
            int width  = Integer.parseInt(commandArr[1]);
            if (create.checkingArgument(canvas, command)) {
                canvas.setWidth(width);
                canvas.setHeight(height);
                canvas.create();
                super.show(canvas);
            }
        } else {
            System.out.println(" Please check command !!!");
        }
    }
}
