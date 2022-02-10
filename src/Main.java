public class Main{
    public static void main(String[] args){
        UniqueValue instance1 = new UniqueValue();
        System.out.println("Instance " + instance1.getUniqueValue());
        UniqueValue instance2 = new UniqueValue();
        System.out.println("Instance " + instance2.getUniqueValue());
        UniqueValue instance3 = new UniqueValue();
        System.out.println("Instance " + instance3.getUniqueValue());
    }
}

class UniqueValue {
    private static int instances = 0;
    private final int id;

    public UniqueValue(){
        UniqueValue.instances++;
        this.id = UniqueValue.instances;
    }

    public int getUniqueValue(){
        return this.id;
    }
}