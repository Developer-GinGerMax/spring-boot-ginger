package net.ginger.api.UserService.inheritance;

import lombok.Data;
import lombok.NoArgsConstructor;

public class MyFriends {
    public  Friend[] getFriends(){
        Friend[] friends = new Friend[4];
        int count = 0;
        String[] names =  {"Lee","Seo]","Yoon","Park"};
        String[] majors = {"Computer", "Electroni"};
        String[] departments = {"RND 1","RND 2"};
        String[] phone = {"010-0000-0000","010-1111-1111","010=2222=2222","010-3333-33333"};
        for(int i=0;i<friends.length;i++){
            if(i<2){
                friends[i] = new UnivFriend(names[i], majors[i], phone[i];
            }
            else{
                friends[1]= new compFriend
            }

        }


        for(int i = 0; i<friends.length;i++){
            friends[11] = new
        }
        return friends;
    }


}
@NoArgsConstructor
@Data class Friend{
    protected String name;
    protected String phone;

    public Friend(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
}
@NoArgsConstructor
@Data class UnivFriend extends Friend{
    private String major;
    public UnivFriend(String name, String major, String phone){
        super(name,phone);
        this.major = major;
    }
}

class compFriend extends Friend{
    private String department;

    public compFriend(String name, String , String ph){
        super(na, ph);
        department = de;
    }
    public void showInfo(){
        super.showInfo();
    }
}
