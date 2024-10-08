public class Main {
    public static void main(String[] args) {


        Person[] Arr= new Person[5];
        Arr[0]=new Person("Andrew Max", "CEO", "likus@gmail.com", "+375338961418", 95000, 53);
        Arr[1]=new Person("Elizabeth Gold", "teacher", "elza@gmail.com", "+375257771122", 50000, 38);
        Arr[2]=new Person("Andy Mails", "driver", "andy@gmail.com", "+375175563456", 43500, 42);
        Arr[3]=new Person("Jessica Alba", "singer", "jess@gmail.com", "+375295522157", 280000, 45);
        Arr[4]=new Person("Jhon Sina", "worker", "jojo@gmail.com", "+375251649915", 30000, 23);

        for(int i=0; i<Arr.length; i++)
            Arr[i].toScreen();

        Park park= new Park();
        Park.Attractions attractions1 = new Park().new Attractions("Surprise", "10.00-13.00", 150);
        Park.Attractions attractions2 = new Park().new Attractions("WhiteLotus", "18.00-21.00", 350);
        System.out.println(attractions1.getName());
        System.out.println(attractions2.getCost());
        attractions1.setName("BlackMoon");
        System.out.println(attractions1.getName());
    }
}