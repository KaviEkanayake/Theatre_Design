public class Ticket {
    private int row;
    private int seat;
    private int price;
    private Person person;

    public Ticket(int row, int seat, int price, Person person){
        this.row = row;
        this.seat = seat;
        this.price = price;
        this.person = person;
    }
    public void print(){

        System.out.println("name: " +person.getName());
        System.out.println("surname: " +person.getName());
        System.out.println("email: " +person.getEmail());
        System.out.println("row" + row);
        System.out.println("seat"+seat);
        System.out.println("price"+price);
    }
    public int getRow(){
        return row;
    }
    public int getSeat(){
        return seat;
    }
    public Person getPerson(){
        return person;
    }
}
