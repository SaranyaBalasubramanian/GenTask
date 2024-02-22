package GenTask.Task4;
//2.Create a class Voter(VoterID,name,age)with parameterized constructor.
// The paramterized constructor should throw a checked exception if age is less than 18.
//the message of exception us "invaild age for voter".

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

class VoterList{
    private int voterId;
    private String name;
    private int age;

    public int getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public VoterList(int voterId, String name, int age)throws InvalidAgeException{
        this.voterId = voterId;
        if(age<18){
                throw new InvalidAgeException("Invalid Age for Voter");
        }
        this.age = age;
        this.name = name;


    }
}
public class Voter {
    public static void main(String[] args) {
        try{
            //Invalid age
            VoterList v1 = new VoterList(1,"Saranya",18);
            System.out.println("Voter created successfully");
            //valid age
            VoterList v2 = new VoterList(2,"Sudha",10);

        }catch (InvalidAgeException e){
            System.out.println("Error :" +e.getMessage());
        }
    }
}
