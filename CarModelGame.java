import java.util.*;

public class CarModelGame {

    public static void main(String[] args) {

        String input="Audi A2,Audi A3,AUDI A4,BMW S3,BMW HH,Tata Nano,Tata Indica";
        Map<String,Object> map = getCarModels(input);
        System.out.println("Input String : "+input);
        System.out.println("Map of Car and Model : "+map);

    }

    public static Map<String,Object> getCarModels(String s){
        String[] cars = s.split (",");

        int counter =0;
        Map<String,Object> carModelMap = new HashMap<>();

        while(counter<cars.length){
            String currentCar = cars[counter].split(" ")[0];
            List<String> modelList = new ArrayList<>();

            if(!carModelMap.containsKey(currentCar)){
                for(int i=0;i<cars.length;i++){
                    String car = cars[i].split(" ")[0];
                    String model = cars[i].split(" ")[1];
                    if(car.equals(currentCar)){
                        modelList.add(model);
                    }
                }
                carModelMap.put(currentCar,modelList);
            }
            counter=counter+1;
        }
        return carModelMap;
    }
}
