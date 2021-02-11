public class Main {

    public static void main(String[] args) {
        Person persons1 = new Person("Andrey", "Andreev", "Andreevich", 1981, "swimming", 'M');
        Person persons2 = new Person("Sergey", "Sergeev", "Sergeevich", 1980, "playing chess", 'M');
        Person persons3 = new Person("Petr", "Petrov", "Petrovich", 1983, "reading", 'M');
        Person persons4 = new Person("Anna", "Morozova", "Petrovna", 1978, "playing piano", 'F');
        Person persons5 = new Person("Roza", "Tsvtkova", "Tsvetkovna", 1980, "dancing", 'F');
        Person persons6 = new Person("Tolik", "Sartbaev", "Esenkeldievich", 1978, "reading articles", 'M');
        Person persons7 = new Person("Alla", "Pugachyova", "Borisovna", 1870, "singing", 'F');
        Person persons8 = new Person("Eduard", "Topol", "Topolevich", 1890, "writing", 'M');
        Person persons9 = new Person("Tom", "Borovski", "Sergeevich", 1987, "hockey", 'M');
        Person persons10 = new Person("Karyn", "Morril", "Danny", 1975, "drawing", 'F');

        Person[] persons = new Person[10];
        persons[0] = persons1;
        persons[1] = persons2;
        persons[2] = persons3;
        persons[3] = persons4;
        persons[4] = persons5;
        persons[5] = persons6;
        persons[6] = persons7;
        persons[7] = persons8;
        persons[8] = persons9;
        persons[9] = persons10;

        for (int i = 0; i < persons.length; i++){
            System.out.println(persons);
        }
//
//        System.out.println(persons);


//        Person[] persons = new Person[10];
//	persons[0] = new Person("Andrey", "Andreev", "Andreevich", 1981, "swimming", 'M');
//	persons[1] = new Person("Sergey", "Sergeev", "Sergeevich", 1980, "playing chess", 'M');
//	persons[2] = new Person("Petr", "Petrov", "Petrovich", 1983, "reading", 'M');
//    persons[3] = new Person("Anna", "Morozova", "Petrovna", 1978, "playing piano", 'F');
//    persons[4] = new Person("Roza", "Tsvtkova", "Tsvetkovna", 1980, "dancing", 'F');
//    persons[5] = new Person("Tolik", "Sartbaev", "Esenkeldievich", 1978, "reading articles", 'M');
//    persons[6] = new Person("Alla", "Pugachyova", "Borisovna", 1870, "singing", 'F');
//    persons[1] = new Person("Eduard", "Topol", "Topolevich", 1890, "writing", 'M');
//    persons[1] = new Person("Tom", "Borovski", "Sergeevich", 1987, "hockey", 'M');
//    persons[1] = new Person("Karyn", "Morril", "Danny", 1975, "drawing", 'F');
//
//    for (int i = 0; i < persons.length; i++){
//
//        System.out.println(persons);
//
//    }



    }
}
