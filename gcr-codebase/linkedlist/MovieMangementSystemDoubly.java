
class Movie{
    String title,director;
    int year;
    double rating;
    Movie next,prev;
    public Movie(String title,String director,int year,double rating){
        this.title=title;
        this.director=director;
        this.year=year;
        this.rating=rating;
        this.next=null;
        this.prev=null;
    }
}
class MovieManagement{
    private Movie head,tail;
    public MovieManagement(){
        head=null;
        tail=null;
    }
    public void addMovie(String title,String director,int year,double rating){
        Movie newMovie=new Movie(title,director,year,rating);
        if(head==null){
            head=tail=newMovie;
        }else{
            tail.next=newMovie;
            newMovie.prev=tail;
            tail=newMovie;
        }
    }
    public void removeMovie(String title){
        Movie temp=head;

        while(temp!=null && !temp.title.equalsIgnoreCase(title)){
            temp=temp.next;
        }
        if(temp==null)return;

        if(temp.prev!=null){
            temp.prev.next=temp.next;
        }
        if(temp.next!=null){
            temp.next.prev=temp.prev;
        }
        if(temp==head){
            head=temp.next;
        }
        if(temp==tail){
            tail=temp.prev;
        }
    }
    public Movie searchMovie(String query){
        Movie temp=head;

        while(temp!=null){
            if(temp.director.equalsIgnoreCase(query) || String.valueOf(temp.rating).equals(query)){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public void updateRating(String title,double newRating){
        Movie temp=head;
        while(temp!=null){
            if(temp.title.equalsIgnoreCase(title)){
                temp.rating=newRating;
                return;
            }
            temp=temp.next;
        }
    }
    public void displayMoviesForward(){
        Movie temp=head;
        while(temp!=null){
            System.out.println(temp.title+" ("+temp.year+") - "+temp.director+" - Rating: "+temp.rating);
            temp=temp.next;
        }
    }
    public void displayMoviesReverse(){
        Movie temp=tail;
        while(temp!=null){
            System.out.println(temp.title+" ("+temp.year+") - "+temp.director+" - Rating: "+temp.rating);
            temp=temp.prev;
        }
    }
}
public class MovieMangementSystemDoubly{
    public static void main(String[] args){
        MovieManagement movies=new MovieManagement();
        movies.addMovie("Train to Busan","Yeon Sang-ho",2016,7.6);
        movies.addMovie("As the Gods Will","Takashi Miike",2014,7.1);
        movies.addMovie("Hope","Lee Joon-ik",2013,8.3);
        System.out.println("Movies in Forward Order:");
        movies.displayMoviesForward();
        System.out.println("Movies in Reverse Order:");
        movies.displayMoviesReverse();
        System.out.println("Updating rating of 'Train to Busan' to 7.8");
        movies.updateRating("Train to Busan",7.8);
        movies.displayMoviesForward();
        System.out.println("Removing 'Hope'");
        movies.removeMovie("Hope");
        movies.displayMoviesForward();
    }
}