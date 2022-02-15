import java.util.LinkedList;
import java.util.Queue;

public class ColorFill extends ShapeDrawing{
    public ColorFill(){
        super();
    }
    CommandChecker color = new CommandColor();

    @Override
    public void draw(Canvas canvas, Command command) {
        if(color.checking(command)){
            if(color.checkingArgument(canvas, command)){
                String [] commandArr = color.format(command);
                int row = Integer.parseInt(commandArr[2]);
                int column = Integer.parseInt(commandArr[1]);
                char colorChar = commandArr[3].charAt(0);

                Queue<Point> pointQueue = new LinkedList<>();
                Point point = new Point(row,column);
                pointQueue.add(point);
                while(!pointQueue.isEmpty()){
                     Point p = pointQueue.peek();
                     int pointX = p.getCoordinateX();
                     int pointY = p.getCoordinateY();
                     canvas.setCanvas(pointX, pointY, colorChar);

                     pointQueue.remove();

                     if(checkValidityPoint(pointX+1, pointY, canvas) && canvas.getCanvas()[pointX+1][pointY] == ' '){
                         Point pointAbove = new Point(pointX+1, pointY);
                         pointQueue.add(pointAbove);
                     }

                     if(checkValidityPoint(pointX-1, pointY, canvas) && canvas.getCanvas()[pointX-1][pointY] == ' '){
                         Point pointUnder = new Point(pointX-1, pointY);
                         pointQueue.add(pointUnder);
                     }

                     if(checkValidityPoint(pointX, pointY+1, canvas) && canvas.getCanvas()[pointX][pointY+1] == ' '){
                         Point pointRight = new Point(pointX, pointY+1);
                         pointQueue.add(pointRight);
                     }

                     if(checkValidityPoint(pointX, pointY-1,canvas) && canvas.getCanvas()[pointX][pointY-1] == ' '){
                         Point pointLeft = new Point(pointX, pointY-1);
                         pointQueue.add(pointLeft);
                     }
                }
                super.show(canvas);
            }
        }
    }


    public boolean checkValidityPoint(int x, int y, Canvas canvas){
        boolean fag = true;
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        int pointX = x;
        int pointY = y;

        if(pointX <= 0 || pointY <= 0 ){
            fag = false;
        }
        if(pointX > height || pointY > width){
            fag = false;
        }
        return fag;
    }

    class Point {
        private int coordinateX;
        private int coordinateY;
        public Point(int x, int y){
            this.coordinateX = x;
            this.coordinateY = y;
        }

        public int getCoordinateX(){
            return coordinateX;
        }

        public int getCoordinateY(){
            return coordinateY;
        }
    }
}
