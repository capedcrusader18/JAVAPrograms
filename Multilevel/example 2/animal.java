class dog{
    public void barking(){
        System.out.println("Barking!!!!!");
    }
}
class animal extends dog{
    public void meow(){
        System.out.println("meow!!!!");
    }
    public static void main(String a[]){
       animal c = new animal();
        c.meow();
        c.barking();
    }
}