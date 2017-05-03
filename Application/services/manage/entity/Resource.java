package manage.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "Resources")
public class Resource implements Serializable {
    
    private static final long serialVersionUID = -7988799579036225137L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column
    private String name;
    
    @Column
    private int timeAllocation;
    
    @Column
    private int roomMember;
    
    @Column
    private int capacity;
    
    @Column
    private boolean  availability;
    

    public Resource() {
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTimeAllocation() {
        return timeAllocation;
    }
    public void setTimeAllocation(int timeAllocation) {
        this.age = timeAllocation;
    }
    public int getRoomMember() {
        return  roomMember;
    }
    public void setRoomMember(int  roomMember) {
        this. roomMember =  roomMember;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    
    
    @Override
    public String toString() {
        return "Resource{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", timeAllocation=" + timeAllocation +
                ", capacity=" +capacity+
                ", roomMember=" +  roomMember +
                '}';
    }
}