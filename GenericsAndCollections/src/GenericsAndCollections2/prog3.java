package GenericsAndCollections2;

import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car> {
    private int modalNo;
    private String name;
    private int stock;

    Car(int modalNo, String name, int stock) {
        this.modalNo = modalNo;
        this.name = name;
        this.stock = stock;
    }
    public int getModalNo() {
        return modalNo;
    }
    public String getName() {
        return name;
    }
    public int getStock() {
        return stock;
    }
    @Override
    public int compareTo(Car car) {
        return Integer.compare(this.stock, car.stock);
    }
    public String toString() {
        return modalNo + " " + name + " " + stock;
    }
}
public class prog3 {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(2019, "BMW", 18));
        cars.add(new Car(1999, "Audi", 10));
        cars.add(new Car(2004, "Honda", 30));
        cars.add(new Car(2016, "Supra", 15));
        cars.add(new Car(2009, "PAKs", 24));
        Collections.sort(cars);
        System.out.println("List of sorted Car Objects --> ");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}

/**
 * OUTPUT :
 *
 * List of sorted Car Objects -->
 * 2019 BWM 18
 * 1999 Audi 10
 * 2004 HOnda 30
 * 2016 Supra 15
 * 2009 PAKs 24
 */