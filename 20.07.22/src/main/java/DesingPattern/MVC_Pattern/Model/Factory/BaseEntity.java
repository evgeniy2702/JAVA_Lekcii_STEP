package DesingPattern.MVC_Pattern.Model.Factory;

public class BaseEntity {
    private Long id;

    public BaseEntity() {
    }

    public BaseEntity(Long id) {
        this.id = id;
    }

    public Long getId() {
        try{
            return id;
        } catch (Exception e){
            System.out.println("This id is not found");
        }
        return null;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public  boolean isNew(){
        return (this.id == null);

    }
}
