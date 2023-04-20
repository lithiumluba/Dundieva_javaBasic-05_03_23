package gettersAndSetters;
import gettersAndSetters.Account;
public class GettersAndSettersMain {
    public static void main(String[] args) {
        Account user1 = new Account("Vitaliy","Dundev",4,2,1988,"75","120/80",100,"best@gmail.com","+380935588711");
        Account user2 = new Account("Anna","Tutova",5,10,1994,"55","120/80",10000,"anecha@gmail.com","+380638524569");
        Account user3 = new Account("Svetlana","Chapskaya", 6,9,1988,"60","120/80",1000,"svetik_semicvetik@gmai.com","+380738524598");
        Account user4 = new Account("Victoria", "Prihochenko", 13,10,1989,"57","120/80",10000, "princess@gmail.com","+380569874561");
        Account user5 = new Account("Artyom", "Volkanov", 12,10,1992,"65","120/80", 1000,"dreamOf@gmail.com","+380657894562");
        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
        user4.printAccountInfo();
        user5.printAccountInfo();
        user3.setPressure("125/80");
        user5.setStepsPerDay(998);
        user5.setWeight("70");
        user3.printAccountInfo();
        user5.printAccountInfo();
    }
}
