package Composition;

public class Engine {
    String engineName ;


    Engine(String engineName){
        this.engineName = engineName ;

    }
    void EngineInfo(){

        System.out.println("the engine used is "+this.engineName );

    }
}
