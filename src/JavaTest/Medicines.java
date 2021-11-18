package JavaTest;

import java.util.*;

public class Medicines {
    private String medicine;
    private String batch;
    private String disease;
    private int price;

    public Medicines(String medicine, String batch, String disease, int price){
        this.medicine = medicine;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getMedicine() {
        return medicine;
    }

    public String getBatch() {
        return batch;
    }

    public String getDisease() {
        return disease;
    }

    public int getPrice() {
        return price;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String givenDisease = "";
        List<Medicines> medicinesList = new ArrayList<>();
        List<Integer> priceList = new ArrayList<>();

        for(var i = 1; i<=4; i++){
            System.out.println("Enter Medicine Name");
            String medicine = scanner.next();
            System.out.println("Enter batch Name");
            String batch= scanner.next();
            System.out.println("Enter disease name");
            String disease = scanner.next();
            System.out.println("Enter price");
            int price = scanner.nextInt();

            Medicines medicines = new Medicines(medicine, batch, disease, price);

            medicinesList.add(medicines);
        }

        System.out.println("Enter disease name to sort");
        givenDisease = scanner.next();

        for(var medicines : medicinesList){
            if(Objects.equals(medicines.getDisease(), givenDisease)){
                int price = medicines.getPrice();
                priceList.add(price);
            }
        }

        Collections.sort(priceList);
        for(var price : priceList){
            System.out.println(price);
        }
    }
}
