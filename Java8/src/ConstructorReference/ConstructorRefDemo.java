package ConstructorReference;


class Sample{

    public Sample(){
        System.out.println("Default constructor called");
    }

    public Sample(String str){
        System.out.println("parametrized constructor called with value::: "+str);
    }
}


interface SampleIntf{

    public Sample get();
    //public Sample get(String s);

}

public class ConstructorRefDemo {

    public static void main(String[] args) {

        SampleIntf i1 = Sample::new;
        //i1.get("abc");
        i1.get();
    }
}
