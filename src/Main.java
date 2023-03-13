import java.util.stream.IntStream;




public abstract class Main {


    public static void main(String[] args) {
        hogwarts[] students = {
                new hogwarts("Harry Potter", 16, 64),
                new hogwarts("Hermione Granger", 22, 38),
                new hogwarts("Ron Weasley", 55, 71),
                new hogwarts("Draco Malfoy", 5, 41),
                new hogwarts("Graham Montague", 29, 62),
                new hogwarts("Gregory Goyle", 54, 24),
                new hogwarts("Zachariah Smith", 8, 19),
                new hogwarts("Cedric Diggory", 77, 1),
                new hogwarts("Justin Finch-Fletchley", 33, 6),
                new hogwarts("Zhou Chang", 46, 28),
                new hogwarts("Padma Patil", 17, 81),
                new hogwarts("Marcus Belby", 99, 1),
        };
        System.out.println("Список студентов " + students.length);
        for (int i = 0; i < students.length; i++) {
            hogwarts hogwarts = students[i];
            System.out.println("Имя " + hogwarts.getName()
                    + "; Сила Магии " + hogwarts.getMagicPower()
                    + "; Расстояние трансгресии " + hogwarts.getTransgressionDistance());
        }

        Gryffindor[] gryffindors = {
                new Gryffindor("Harry Potter", 16, 64, 1, 2, 3),
                new Gryffindor("Hermione Granger", 22, 38, 3, 2, 1),
                new Gryffindor("Ron Weasley", 55, 71, 4, 2, 1),

        };

        System.out.println("Список Гриффиндорцев " + gryffindors.length);
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Имя " + gryffindor.getName()
                    + "; Сила Магии " + gryffindor.getMagicPower()
                    + "; Расстояние трансгресии " + gryffindor.getTransgressionDistance()
                    + "; Благородство " + gryffindor.getNobility()
                    + "; Честь " + gryffindor.getHonor()
                    + "; Храбрость " + gryffindor.getBravery());

        }


        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Draco Malfoy", 5, 41, 2, 5, 8),
                new Hufflepuff("Graham Montague", 29, 62, 8, 5, 2),
                new Hufflepuff("Gregory Goyle", 54, 24, 4, 3, 1),
        };
        System.out.println("Список Пуффендуйцев  " + hufflepuffs.length);
        for (int j = 0; j < hufflepuffs.length; j++) {
            Hufflepuff hufflepuff = hufflepuffs[j];
            System.out.println("Имя " + hufflepuff.getName()
                    + "; Сила Магии " + hufflepuff.getMagicPower()
                    + "; Расстояние трансгресии " + hufflepuff.getTransgressionDistance()
                    + "; Трудолюбие " + hufflepuff.getHardworking()
                    + "; Верность " + hufflepuff.getLoyal()
                    + "; Честность " + hufflepuff.getHonest());

        }

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Zachariah Smith", 8, 19, 7, 5, 3, 1),
                new Ravenclaw("Cedric Diggory", 77, 1, 9, 5, 1, 2),
                new Ravenclaw("Justin Finch-Fletchley", 33, 6, 2, 5, 8, 6),
        };
        System.out.println("Список Когтевранцев " + ravenclaws.length);
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Имя " + ravenclaw.getName()
                    + "; Сила Магии " + ravenclaw.getMagicPower()
                    + "; Расстояние трансгресии " + ravenclaw.getTransgressionDistance()
                    + "; Ум " + ravenclaw.getSmart()
                    + "; Мудрость " + ravenclaw.getWise()
                    + "; Остроумиуе " + ravenclaw.getWitty()
                    + "; Креативность " + ravenclaw.getCreativity());

        }
        Slytherin[] slytherins = {
                new Slytherin("Zhou Chang", 46, 28, 1, 4, 7, 2, 3),
                new Slytherin("Padma Patil", 17, 81, 2, 5, 8, 3, 6),
                new Slytherin("Marcus Belby", 99, 1, 7, 5, 2, 8, 6),
        };
        System.out.println("Список Слизеринцев " + slytherins.length);
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Имя " + slytherin.getName()
                    + "; Сила Магии " + slytherin.getMagicPower()
                    + "; Расстояние трансгресии " + slytherin.getTransgressionDistance()
                    + "; Хитрость " + slytherin.getCunning()
                    + "; Решительность " + slytherin.getDetermination()
                    + "; Амбициозность " + slytherin.getAmbition()
                    + "; Находчивость " + slytherin.getResourcefulness()
                    + "; Жажда власти " + slytherin.getThirstForPower());

        }


        Slytherin ZhouChang = new Slytherin("Zhou Chang", 46, 28, 1, 4, 7, 2, 3);
        Slytherin PadmaPatil = new Slytherin("Padma Patil", 17, 81, 2, 5, 8, 3, 6);
        Slytherin MarcusBelby = new Slytherin("Marcus Belby", 99, 1, 7, 5, 2, 8, 6);

        testSlytherin(ZhouChang,PadmaPatil,MarcusBelby);




        Ravenclaw ZachariahSmith = new Ravenclaw("Zachariah Smith", 8, 19, 7, 5, 3, 1);
        Ravenclaw CedricDiggory = new Ravenclaw("Cedric Diggory", 77, 1, 9, 5, 1, 2);
        Ravenclaw JustinFinchFletchley = new Ravenclaw("Justin Finch-Fletchley", 33, 6, 2, 5, 8, 6);

        testRavenclaw(ZachariahSmith,CedricDiggory,JustinFinchFletchley);



        Hufflepuff DracoMalfoy = new Hufflepuff("Draco Malfoy", 5, 41, 2, 5, 8);
        Hufflepuff GrahamMontague = new Hufflepuff("Graham Montague", 29, 62, 8, 5, 2);
        Hufflepuff GregoryGoyle = new Hufflepuff("Gregory Goyle", 54, 24, 4, 3, 1);
        testHufflepuff(DracoMalfoy,GrahamMontague,GregoryGoyle);



    Gryffindor HarryPotter = new Gryffindor("Harry Potter", 16, 64, 1, 2, 3);
    Gryffindor HermioneGranger = new Gryffindor("Hermione Granger", 22, 38, 3, 2, 1);
    Gryffindor RonWeasley = new Gryffindor("Ron Weasley", 55, 71, 4, 2, 1);

        testGryffindor(HarryPotter,HermioneGranger,RonWeasley);

        HarryPotter.compare(HermioneGranger);

        RonWeasley.compareHogwarts(GregoryGoyle);



}



    public static void testGryffindor(Gryffindor student1, Gryffindor student2, Gryffindor student3) {
        var s1 = student1.ability();
        var s2 = student2.ability();
        var s3 = student3.ability();
        if (s1 > s2) {
            System.out.println(student1.getName() + " лучше " + student2.getName());
        } else {
            if (s2 > s3) {
                System.out.println(student2.getName() + " лучше " + student3.getName());
            } else {
                if (s3 > s1) {
                    System.out.println(student3.getName() + " лучше " + student1.getName());
                }
            }
        }



    }
    public static void testHufflepuff(Hufflepuff student1, Hufflepuff student2, Hufflepuff student3) {
        var s1 = student1.ability();
        var s2 = student2.ability();
        var s3 = student3.ability();
        if (s1 > s2) {
            System.out.println(student1.getName() + " лучше " + student2.getName());
        } else {
            if (s2 > s3) {
                System.out.println(student2.getName() + " лучше " + student3.getName());
            } else {
                if (s3 > s1) {
                    System.out.println(student3.getName() + " лучше " + student1.getName());
                }
            }
        }



    }
    public static void testRavenclaw(Ravenclaw student1, Ravenclaw student2, Ravenclaw student3) {
        var s1 = student1.ability();
        var s2 = student2.ability();
        var s3 = student3.ability();
        if (s1 > s2) {
            System.out.println(student1.getName() + " лучше " + student2.getName());
        } else {
            if (s2 > s3) {
                System.out.println(student2.getName() + " лучше " + student3.getName());
            } else {
                if (s3 > s1) {
                    System.out.println(student3.getName() + " лучше " + student1.getName());
                }
            }
        }



    }
    public static void testSlytherin(Slytherin student1, Slytherin student2, Slytherin student3) {
        var s1 = student1.ability();
        var s2 = student2.ability();
        var s3 = student3.ability();
        if (s1 > s2) {
            System.out.println(student1.getName() + " лучше " + student2.getName());
        } else {
            if (s2 > s3) {
                System.out.println(student2.getName() + " лучше " + student3.getName());
            } else {
                if (s3 > s1) {
                    System.out.println(student3.getName() + " лучше " + student1.getName());
                }
            }
        }



    }

}



















            






