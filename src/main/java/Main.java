import Message.ManageMessages;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        Command command = new Command();
        Scanner sc = new Scanner(System.in);
        CommandChecker create = new CommandCreate();
        boolean flag = true;
        do{
            System.out.println(ManageMessages.Messages_Create_Canvas.getMessage());
            String commandCreate = sc.nextLine();
            command.setCommand(commandCreate);

            String[] commandArr = create.format(command);
            if (commandArr.length == 1 && commandArr[0].equals("Q")) {
                System.out.println("---Bye---");
                break;
            }
            ShapeDrawing createCanvas = DrawingFactory.getType(TypeDraw.CREATE);
            createCanvas.draw(canvas, command);
            if(create.checking(command) && create.checkingArgument(canvas,command)){
                flag = false;
            }
        }while(flag);

        do{
            System.out.println(ManageMessages.Messages_Command_Drawing.getMessage());
            String commandDraw = sc.nextLine();
            command.setCommand(commandDraw);
            String[] commandArr = create.format(command);
            if(commandArr.length == 1 && commandArr[0].equals("Q")){
                System.out.println("---Bye---");
                break;
            }

            if(commandArr[0].equals("L") || commandArr[0].equals("R") || commandArr[0].equals("B")){
                if(commandArr[0].equals("L")){
                    ShapeDrawing line = DrawingFactory.getType(TypeDraw.LINE);
                    line.draw(canvas, command);
                    line.show(canvas);
                }

                if(commandArr[0].equals("R")){
                    ShapeDrawing square = DrawingFactory.getType(TypeDraw.SQUARE);
                    square.draw(canvas, command);
                }
                if(commandArr[0].equals("B")){
                    ShapeDrawing drawColor = DrawingFactory.getType(TypeDraw.BACKGROUND);
                    drawColor.draw(canvas, command);
                }
            }else
                System.out.println(ManageMessages.Messages_Check_Key.getMessage());
        }while(true);
    }
}
