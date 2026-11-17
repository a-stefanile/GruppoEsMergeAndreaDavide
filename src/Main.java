public class Main {
    public static void main(String[] args) {
        NormalPayment normalPayment = new NormalPayment();
        ElderlyDiscount elderlyDiscount = new ElderlyDiscount();
        StudentDiscount studentDiscount = new StudentDiscount();
        
        System.out.println(normalPayment.calculateDiscountPrice(12));
        System.out.println(studentDiscount.calculateDiscountPrice(12));
        System.out.println(elderlyDiscount.calculateDiscountPrice(12));
    }
}

/*
* Mini Progetto Merge:
1) creare una nuova repo (nomerepo: GruppoEsMergeNome1Nome2Nome3)
2) inizializzate un progetto java come primo commit.
3) scegliete uno dei seguenti temi: Biblioteca, Supermercato, Garage(Meccanico), Cinema o tema libero.
NB!) Ognuno deve avere il proprio ramo.
NB!) Dovete raggiungere almeno 4 merge prima di finire (anche di più servono ovviamente)
NB!) suddividete il carico di lavoro in modo da non lasciare fermo nessuno.
* */