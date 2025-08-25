package th.mfu;

import java.util.Date;

public class Concert {
    
    //TODO: add attributes
    private  int id;
    private String title;
    private String performer;
    private Date date;
    private String describtion;
    public Concert() {
    }
    public Concert(String title, String description) {
        //TODO: set attributes
        this.title = title;
        this.describtion = description;

    }
 
    //TODO: add getters and setters for all attributes
    // You can use Source action/generate getter setter function
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public String getPerformer(){
        return performer;
    }
    public void setPerfermer(String performer){
        this.performer = performer;
    }
    public String getDescription(){
        return describtion;
    }
    public void setDescribtion(String describtion){
        this.describtion = describtion;
    }

}
