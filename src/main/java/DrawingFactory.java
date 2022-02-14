public class DrawingFactory {
    private DrawingFactory(){

    }

     public static final ShapeDrawing getType(TypeDraw type){
        switch (type){
            case CREATE:
                return new CanvasCreat();
            case LINE:
                return new Line();
            case SQUARE:
                return new Squares();
            case BACKGROUND:
                return new Color();
            default:
                throw new IllegalArgumentException("This drawing type is unsupported");
        }
     }
}
