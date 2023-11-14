public class LocalVars {

    String instanceVar;

    LocalVars(){
        System.out.println("Instance variable abc's default value: " + instanceVar);

        System.out.println("COmmited for the GIT Testing");


        System.out.println("COmmited in develop branch");
        System.out.println("COmmited in Prajakta branch");
    }

    void sampleMethod1(){
        int localVar;
        System.out.println("for debug");
        //System.out.println("Local variable abc's default value: " + localVar);
        //Java does not initialize local variables with any default value. So
        //these variables will be just null by default.
    }

    public static void main(String[] args) {
        LocalVars localVars = new LocalVars();
        localVars.sampleMethod1();
    }
}
