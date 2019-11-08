
import java.io.Serializable;


public class Message implements Serializable {
    public Integer getId() {
        return id;
    }

    public Message setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Message setMessage(String message) {
        this.message = message;
        return this;
    }

    public Message() {
    }

    private Integer id;
private String message;

}
