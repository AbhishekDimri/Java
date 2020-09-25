package switchTute;

class X

{

    static

    {

        Y.methodOfY();

    }

}

 

class Y extends X

{

    static void methodOfY()

    {

        System.out.println("Hi....");

    }

}

 

public class test_class

{

    public static void main(String[] args)

    {

        Y.methodOfY();

    }

}