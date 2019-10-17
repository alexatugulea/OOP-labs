 public class Main {

    public static void main(String[] args){
        Student Alexa = new Student( "Alexa","19", 10.0);
        Student Ana = new Student("Ana","20",9.9);
        Student Adriana = new Student( "Adriana",  "19",   9.8);
        Student Adela = new Student( "Adela", "20", 9.7);
        Student Alice = new Student("Alice","19", 9.6);
        Student Amanda = new Student( "Amanda","20", 9.5);

        Student[] International = {Ana, Adela, Adriana};
        Student[] Technical     = {Alexa};
        Student[] State         = {Alice, Amanda};
        University ULIM = new University("ULIM","1992", International);
        University TUM  = new University("TUM", "1964", Technical);
        University USM =  new University("USM", "1946", State);

        System.out.println("Media notelor la UNIVERSITATEA LIBERA INTERNATIONALA: "+ULIM.average());
        System.out.println("Media notelor la UNIVERSITATEA TEHNICA A MOLDOVEI: "+TUM.average());
        System.out.println("Media notelor la UNIVERSITATEA DE STAT A MOLDOVEI: "+USM.average());

        System.out.println("Media notelor tuturor universitatilor: "+(ULIM.average()+TUM.average()+USM.average())/3);
    }
}
