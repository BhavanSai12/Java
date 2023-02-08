package Programs.exercises;

public class Tour {
    public static class HillStation{
        void location(){
            System.out.println("Location is : ");
        }
        void famousFor(){
            System.out.println("Famous for : ");
        }
    }
    public static class Manali extends HillStation{
        void location(){
            System.out.println("Manali is in Himachal Pradesh");
        }
        void famousFor(){
            System.out.println("It is Famous for Hadimba Temple and adventure sports");
        }
    }
    public static class Mussorie extends HillStation{
        void location(){
            System.out.println("Mussoorie is in Uttarakhand");
        }
        void famousFor(){
            System.out.println("It is Famous for education institutions");
        }
    }
    public static class Gulmarg extends HillStation{
        void location(){
            System.out.println("Gulmarg is in J&K");
        }
        void famousFor(){
            System.out.println("It is Famous for skiing");
        }
    }


    public static void main(String[]args){
        HillStation A=new HillStation();
        HillStation M=new Manali();
        HillStation Mu=new Mussorie();
        HillStation G=new Gulmarg();

        A.location();
        A.famousFor();

        M.location();
        M.famousFor();

        Mu.location();
        Mu.famousFor();

        G.location();
        G.famousFor();

    }
}
