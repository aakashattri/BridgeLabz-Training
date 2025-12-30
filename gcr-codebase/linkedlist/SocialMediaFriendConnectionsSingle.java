
import java.util.*;
class User{
    int userId;
    String name;
    int age;
    List<Integer> friendIds;
    User next;
    public User(int userId,String name,int age){
        this.userId=userId;
        this.name=name;
        this.age=age;
        this.friendIds=new ArrayList<>();
        this.next=null;
    }
}
class SocialMediaLinkedList{
    private User head;
    public void addUser(int userId,String name,int age){
        User newUser=new User(userId,name,age);
        newUser.next=head;
        head=newUser;
    }
    public User searchUser(int userId){
        User temp=head;
        while(temp!=null){
            if(temp.userId==userId){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public User searchUser(String name){
        User temp=head;
        while(temp!=null){
            if(temp.name.equalsIgnoreCase(name)){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public void addFriendConnection(int userId1,int userId2){
        User user1=searchUser(userId1);
        User user2=searchUser(userId2);
        if(user1!=null && user2!=null){
            if(!user1.friendIds.contains(userId2))user1.friendIds.add(userId2);
            if(!user2.friendIds.contains(userId1))user2.friendIds.add(userId1);
        }else{
            System.out.println("One or both users not found");
        }
    }
    public void removeFriendConnection(int userId1,int userId2){
        User user1=searchUser(userId1);
        User user2=searchUser(userId2);
        if(user1!=null && user2!=null){
            user1.friendIds.remove((Integer)userId2);
            user2.friendIds.remove((Integer)userId1);
        }else{
            System.out.println("One or both users not found");
        }
    }
    public List<Integer> findMutualFriends(int userId1,int userId2){
        User user1=searchUser(userId1);
        User user2=searchUser(userId2);
        List<Integer> mutualFriends=new ArrayList<>();
        if(user1!=null && user2!=null){
            for(int friendId:user1.friendIds){
                if(user2.friendIds.contains(friendId)){
                    mutualFriends.add(friendId);
                }
            }
        }
        return mutualFriends;
    }
    public void displayFriends(int userId){
        User user=searchUser(userId);
        if(user!=null){
            System.out.println("Friends of "+user.name+": "+user.friendIds);
        }else{
            System.out.println("User not found");
        }
    }
    public void countFriends(){
        User temp=head;
        while(temp!=null){
            System.out.println(temp.name+" has "+temp.friendIds.size()+" friends");
            temp=temp.next;
        }
    }
}
public class SocialMediaFriendConnectionsSingle{
    public static void main(String[] args){
        SocialMediaLinkedList network=new SocialMediaLinkedList();
        network.addUser(101,"Anurag",25);
        network.addUser(102,"Prashant",23);
        network.addUser(103,"aakash",27);
        network.addFriendConnection(101,102);
        network.addFriendConnection(101,103);
        network.addFriendConnection(102,103);
        System.out.println("All friends:");
        network.displayFriends(101);
        network.displayFriends(102);
        network.displayFriends(103);
        System.out.println("Mutual friends between 101 and 102: "+network.findMutualFriends(101,102));
        System.out.println("Removing friendship between 101 and 103");
        network.removeFriendConnection(101,103);
        network.displayFriends(101);
        network.displayFriends(103);
        System.out.println("\nFriend counts:");
        network.countFriends();
    }
}