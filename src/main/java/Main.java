public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();

        Car car1 = new Car("red", "BMW", 5);
                        
        Car car2 = new Car("green", "Audi", 3);
        Car car3 = new Car("pink", "VW", 3);
                
        Car car4 = new Car("black", "Renault", 4);

        // An dieser Stelle befindet sich nun ein Array
        // Dieses Array wird mit einem Sortieralgorithmus sortiert
        // Optimaler Code Yippie

        factory.buildCar(car1);
        factory.buildCar(car2);

    }
}
