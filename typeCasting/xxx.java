public class xxx{
    public static void main(String[] args)
    {

        System.out.println(PairImpair(-7));
        System.out.println(maxNumber(-90,-60,10));
        checkAge(12);
        System.out.println(getResult(105));
        System.out.println(remise(300));

    }
// Exo 1
public static String PairImpair(int nombre)
 {
  return  (nombre%2==0) ? "Ce nombre est pair " +nombre: "Ce nombre est impair";
 }

//Exo 2
public static double maxNumber(double n1, double n2, double n3)  {
    double max=0.0d;
    if(n1<n2 && n2>n3)
    {
        max=n2;
    }if(n2<n3 && n3>n1)
    {
        max=n3;
    }if(n1>n2 && n2<n3){
        max=n1;
    }if(n1<n3 && n2<n1){
        max=n3;
    }
    return max;
}
//Exo 3
public static void checkAge(int age){

    if (age>=0 && age<12){
        System.out.println("Ton age est compris entre 0 et 12 ans, tu es enfant");
    }else if(age<=12 && age<=19)
    {
        System.out.println("Ton age est compris entre  13 et 19 ans; tu es donc un adolescent");
    }else if(age>=20 && age<=64){
            System.out.println("Ton age est compris entre 20 et 64 ans ; tu es donc adulte");
    }else if(age>=65){
        System.out.println("Tu es senior");
    }else{
        System.out.println("Age invalide");
    }
}
// Exo 4
public static String getResult(double note){
   return  note<100 ? note >=50 ? "Tu es admi ! " : "Tu as échoué": "Note invalide";
}
// Exo 5
public static double remise(double montant){
    double rem=0.0;
    if(montant>=0 && montant<100){
        rem=0;
    }else if(montant>100 && montant<500){
        rem= montant*0.1;
    }else {
        rem=montant * 0.2;
        
    }
    return montant-rem;
}




 // Exo 3
//     int a= 3;
//     int b=a+2;
//     double c=a*2 ;
    
//     if(a>b && b<c)
//     {
//         System.out.println("La condition est vraie");

//     }else{
//        System.out.println("La condition est fausse");

//     }

// // Exo 4 

// int intVar =5;
// double doubleVar= intVar;
// System.out.println("Int "+ intVar);
// System.out.println("conversion Double "+ doubleVar);
// short shortVar= (short) doubleVar;
// System.out.println("shortVar "+ shortVar);


// // Exo 5 
// int x =5;
// float y=10.5f;
// float z=(float) x;
// if(z>y){
//     System.out.println("true");
// }else{
//     System.out.println("false");
// }   

// EXERCICE 

}


   
 

















    

 