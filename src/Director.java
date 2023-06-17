public class Director extends RequestHandler{
    public Director(){
        super("Director");
    }
    @Override
    void setNext(RequestHandler nextHandler){
        this.nextHandler=nextHandler;
    }
    @Override
    void approve(int id){
        if(id>=41 && id<=80)
        {
            System.out.println("Request Approved");
        }
        else{
            super.approve(id);
        }
    }
}
