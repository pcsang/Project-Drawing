public abstract  class ShapeDrawing {
    private Canvas canvas;
    private Command command;

    public abstract void draw(Canvas canvas, Command command);

    public void show(Canvas canvas) {
        System.out.println("|---------My Drawing----------|");
        int row = canvas.getHeight()+2;
        int colum = canvas.getWidth()+2;
        char[][] can = canvas.getCanvas();

        for(int i=0; i<row; i++){
            for(int j=0; j<colum; j++){
                System.out.print(can[i][j]);
            }
            System.out.println("");
        }
    }

    public String getCommand() {
        return String.valueOf(command.getCommand());
    }
}