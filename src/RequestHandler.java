public abstract class RequestHandler {
    String name;
    RequestHandler nextHandler;
    private RequestHandler(){

    }
    public RequestHandler(String name){
        this.name=name;
    }
    abstract void setNext(RequestHandler nextHandler);

    void approve (int id)
    {
        if(this.nextHandler != null)
            this.nextHandler.approve(id);
        else
            System.out.println("request cannot be approved");
    }
}
