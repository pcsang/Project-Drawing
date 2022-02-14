public class Canvas {
    private int height;
    private int width;
    private char[][] canvas;

    public Canvas(){}

    public Canvas(int h, int w){
        height = h;
        width = w;
    }

    public char[][] create(){
        int row = height+2;
        int colunm = width+2;
        canvas = new char[row][colunm];

        for(int i=0; i<row; i++){
            for(int j=0; j<colunm; j++){
                if(i == 0 || i == row-1){
                    canvas[i][j] = '-';
                }else if(j == 0 || j == colunm-1){
                    canvas[i][j]='|';
                }else{
                    canvas[i][j]=' ';
                }
            }
        }
        return canvas;
    }

    public void setHeight(int h){
        height = h;
    }

    public int getHeight(){
        return height;
    }

    public void setWidth(int w){
        width = w;
    }

    public int getWidth(){
        return width;
    }

    public char[][] getCanvas() {
        return canvas;
    }
}
