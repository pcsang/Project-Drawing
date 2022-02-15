package Message;

public enum ManageMessages {
    Messages_Check_Command("Please check your command!!!"),
    Messages_Check_Argument("Please check the argument of command!!!"),
    Messages_Check_Key("This drawing type is unsupported."),
    Messages_ArgumentNo("The argument dose not match!!!"),
    Messages_Create_Canvas("Please input your command to create a canvas. Example, C width height."),
    Messages_Command_Drawing("Please input command drawing. Example, L 1 2 6 2, R 14 1 18 3 and B 10 3 c. Input Q to quit."),
    Messages_NotTypeChar("Color is not type character."),
    ;

    private String message;

    ManageMessages(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

}

