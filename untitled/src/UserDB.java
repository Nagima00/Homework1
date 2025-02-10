public class UserDB {
    private User[] users = new User[100];
    int size = 0;

    public UserDB() {

    }
    public void addUser(User user){
        users[size] = user;
        size = size + 1;
    }
    public void printUsers(){
        for(int i = 0; i < users.length; i++){
            try{
                System.out.println(users[i].getFullName() + " " + users[i].getPassword());
            }
            catch(NullPointerException e){
                System.out.println("вы вызываете на нуле методы так нельзя");
            }
        }
    }
}
