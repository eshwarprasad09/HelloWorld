package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        int age = 70;
//        System.out.println(age);
//        long myAge = 123_456_456_456_456L;
//        System.out.println(myAge);
//        float ff = 1000000000000000.9999999999999999f;
//        System.out.println(ff);
//        double dd = 1233.333444444444444555555555566666666666666666;
//        char cc = 'A';
//        boolean isEligible = true;
//        System.out.println(cc);
//        System.out.println(isEligible);
//        Date now = new Date();
//        System.out.println(now.toString());
//        System.out.println(now);
//        Point point1 = new Point(1,1);
//        Point point2 = point1;
//        point1.x = 2;
//        point1.y = 2;
//        System.out.println(point2);
//        System.out.println(point1);
//        String message = new String("              Hello world" + "!!            ");
//        String message1 = "Hey World          ";
//        System.out.println(message);
//        boolean a = message1.endsWith("d");
//        int b = message1.length();
//        System.out.println(b);
//        System.out.println(a);
//        System.out.println(message.indexOf("w"));
//        System.out.println(message.indexOf("!"));
//        System.out.println(message.replace("!!","**"));
//        System.out.println(message.toLowerCase());
//        System.out.println(message.toUpperCase());
        //trim
//        System.out.println(message.trim());
//        System.out.println(message);
//        //7.string escape character
//        String sentence = "Hi I am working with \"java\"";
//        System.out.println(sentence);
//        String sentence1 = "Hi I am working with \\java\\";
//        System.out.println(sentence1);
//        String sentence2 = "Hi I am working with \"\\java\\\"";
//        System.out.println(sentence2);
        //output format
//           int a = 10;
//        int b = 20;
//        System.out.format(" This is value a %d this is value b %d",a,b);
//        //8.Arrays
//        int arr[] = new int[5];
//        arr[0] = 1;
//        arr[1] = 2;
//        System.out.println(arr);
//        System.out.println(Arrays.toString(arr));
//        char arr1[] = new char[5];
//        arr1[0] = 'e';
//        arr1[1] = 'p';
//        arr1[2] = 'd';
//        System.out.println(Arrays.toString(arr1));
//        int c[] = {0,1,2,3,4,5,6,7,8,9};
//        System.out.println(Arrays.toString(c));
//        int len = arr.length;
//        System.out.println(len);
//        int len1 = arr1.length;
//        System.out.println(len1);
//        int len2 = c.length;
//        System.out.println(len2);
        //9.multidimensional arrays
//        int c[][] = {{0,1,2,3,4,5,6,7,8,9},{9,8,7,6,5,4,3,2,1,0}};
//        System.out.println(Arrays.deepToString(c));
//        int len3 = c.length;
//        System.out.println(len3);
//        int arr3[][]= new int[5][5];
//        arr3[0][0] = 1;
//        arr3[1][0] = 2;
//        System.out.println(Arrays.deepToString(arr3));
//        int len4 = arr3.length;
//        System.out.println(len4);
        //10.constants
//        final int one = 1;
//        final String one1 = "one";
//        final char two2 = '2';
//        final int[] digits = {0,1,2,3,4,5,6,7,8,9};
//        digits[8]=1;
//        final int digit = digits[8];
//        System.out.println(digit);
//        int len = digits.length;
//        System.out.println(len);
//        System.out.println(Arrays.toString(digits));
//        final int[] a = new int[10];
//        a[1] = 1;
//        System.out.println(Arrays.toString(a));
//        final String name = "Eshwarprasad";
//        System.out.println(name);
//        final String[] names = {"eshwar","prasad"};
//        System.out.println(Arrays.toString(names));
        //11.Arithmetic Expressions
//      int x = 10 + 10;
//      System.out.println(x);
//      x += 1;
//      System.out.println(x);
//      int y = 10 - 10;
//      System.out.println(y);
//      y -= 1;
//      System.out.println(y);
//      int z = 10 * 10;
//      System.out.println(z);
//      z *= 10;
//      System.out.println(z);
//      int x1 = 10 / 3;
//      System.out.println(x1);
//      x1 /= 2;
//      System.out.println(x1);
//      double x2 = (double) 10 / (double) 3;
//      System.out.println(x2);
//      x2 /= (double) 2;
//      System.out.println(x2);
//      float x4 = (float) 10 / (float) 3;
//      System.out.println(x4);
//      x4 /= (float) 3;
//      System.out.println(x4);
//      int x3 = 10 % 2;
//      System.out.println(x3);
//      x3 %= 2;
//      System.out.println(x3);
//      float x5 = (float) 10 % (float) 3;
//      System.out.println(x5);
//      double x6 = (double) 10 % (double) 3;
//      System.out.println(x6);
//      int x7 = 10;
//      int y1 = x7++;
//      System.out.println(x7);
//      System.out.println(y1);
//      int x8 = 10;
//      int y2 = x8++;
//      System.out.println(x8);
//      System.out.println(y2);
//      int x9 = 10;
//      int y3 = ++x9;
//      System.out.println(x9);
//      System.out.println(y3);
//      int x10 = 10;
//      int y4 = ++x10;
//      System.out.println(x10);
//      System.out.println(y4);
//      int x9 = 10;
//      int y3 = --x9;
//      System.out.println(x9);
//      System.out.println(y3);
//      int x10 = 10;
//      int y4 = --x10;
//      System.out.println(x10);
//      System.out.println(y4);
//      int x9 = 10;
//      int y3 = x9--;
//      System.out.println(x9);
//      System.out.println(y3);
//      int x10 = 10;
//      int y4 = x10--;
//      System.out.println(x10);
//      System.out.println(y4);
        //12.order operations
//        int x = 10 + 2 * 3;
//        System.out.println(x);
//        int y = (10 + 2) * 3;
//        System.out.println(y);
        //13.casting
        //byte>short>int>long>float>double
        //Implicit casting
//        short x = 3;
//        int y = x + 2;
//        System.out.println(y);
//        int x3 = 1;
//        float x4 = x3 + 1;
//        System.out.println(x4);
//        //Explicit casting
//        String x1 = "1.1";
//        float y1 = Float.parseFloat(x1) + 3;
//        System.out.println(y1);
//        String x2 = "9985383032";
//        long numbers = Long.parseLong(x2);
//        System.out.println(numbers);
        //14.The math class
//        int a = Math.round(1.1F);
//        System.out.println(a);
//        int b = Math.round(1.4F);
//        System.out.println(b);
//        int c = Math.round(1.5F);
//        System.out.println(c);
//        int d = (int) Math.ceil(1.1F);
//        System.out.println(d);
//        int d1 = (int) Math.floor(1.8F);
//        System.out.println(d1);
//        int d4 = Math.max(1,2);
//        System.out.println(d4);
//        int d5 = Math.min(1,2);
//        System.out.println(d5);
//        double d2 = Math.floor(1.5);
//        System.out.println(d2);
//        double d3 = (double) Math.random() * 100;
//        System.out.println(d3);
//        double d3 = Math.round(Math.random() * 100);
//        System.out.println(d3);
//        int d6 = (int) Math.round(Math.random() * 100);
//        System.out.println(d6);
//        int d7 = (int) (Math.random() * 100);
//        System.out.println(d7);
        //15.Formatting Number
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(123456789);
//        System.out.println(result);
//        NumberFormat percentage = NumberFormat.getPercentInstance();
//        String result = percentage.format(1.0);
//       System.out.println(result);
//        String result = NumberFormat.getPercentInstance().format(0.1);
//       System.out.println(result);
//        16.Reading input
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Name :");
//        String name = scanner.next();
//        System.out.println("you are " + name);
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name :");
//        String name = scanner.next();
//        System.out.println("you are " + name);
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name :");
//        String name = scanner.nextLine();
//        System.out.println("you are " + name);
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name :");
//        String name = scanner.nextLine();
//        System.out.println("you are " + name.trim());
        //17.mortage calculator project
//        System.out.println("Enter principal amount : ");
//        System.out.println("Enter rate of interest : ");
//        System.out.println("Enter years : ");
//     byte months = 12;
//     int percentage = 100;
//     Scanner input = new Scanner(System.in);
//     int principal = input.nextInt();
//     float interestRate = input.nextFloat();
//     short years = input.nextShort();
//     float percantageMonthly = interestRate/percentage/months;
//     int totalYears = years * months;
//     double mortage = principal * percantageMonthly * (Math.pow((1+percantageMonthly),(totalYears))) / ((Math.pow((1+percantageMonthly),(totalYears)))-1);
//     String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
//        System.out.println("Mortage : "+mortageFormatted);

        //17.1.simple interest calculator
//        Scanner input = new Scanner(System.in);
//        int principal = Integer.parseInt(input.nextLine());
//       float r = Float.parseFloat(input.nextLine());
//       int t = Integer.parseInt(input.nextLine());
//       int amount = (int) (principal*r*t)/100;
//       System.out.println(amount);
//       NumberFormat am = NumberFormat.getCurrencyInstance();
//       String amo = am.format(amount);
//        System.out.println(amo);
        //2.comparision operators
//        int x = 1;
//        int y = 1;
//        System.out.println(x == y);
//        int x1 = 1;
//        int x2 = 2;
//        System.out.println(x1 == x2);
//        System.out.println(x1 <= x2);
//        System.out.println(x1 != x2);
//        System.out.println(x1 >= x2);
//        System.out.println(x2 >= x1);
        //3.logical operators
//        boolean hasGoodIncome = true;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalCase = false;
//        boolean isEligibe = (hasGoodIncome || hasGoodCredit) && !hasCriminalCase;
//        System.out.println(isEligibe);
        //4.if statement
//        int temperature = 36;
//        if (temperature > 35)
//            System.out.println("it is a hot day");
//        else if (temperature >= 25 && temperature <=35)
//            System.out.println("it is a beautiful day");
//        else
//            System.out.println("it is a cold day");
//        int temperature = 24;
//        if (temperature > 35) {
//            System.out.println("it is a hot day");
//            System.out.println("drink water");
//        }
//        else if (temperature >= 25 && temperature <=35) {
//            System.out.println("it is a beautiful day");
//            System.out.println("enjoy the day");
//        }
//        else {
//            System.out.println("it is a cold day");
//            System.out.println("do camp fire");
//        }
        //5.simpling if statements
//        int income = 1200000;
//        boolean hasHighIncome = (income > 200000);
//        System.out.println(hasHighIncome);
        //6.The Ternary operator
//        String className = (income > 200000) ? "First" : "Economy";
//        System.out.println(className);
        //7.Switch statements
//        String role = "admin";
//        switch (role){
//            case "admin":
//                System.out.println("You are admin");
//                System.out.println("Hey admin welcome to the server");
//                break;
//            case "moderator":
//                System.out.println("You are a moderator");
//                System.out.println("Hey moderator welcome to the server");
//                break;
//            default:
//                System.out.println("You are a guest");
//        }
        //8.Exercise Fizzbuzz
//        int a = 12;
//        if (a % 5 == 0 && a % 3 == 0){
//            System.out.printf("This is a Fizzbuzz %d",a);
//        }
//        else if (a % 5 == 0){
//            System.out.printf("This is a Fizz %d",a);
//        }
//        else if (a % 3 == 0){
//            System.out.printf("This is a buzz %d",a);
//        }
//        else{
//            System.out.printf("This number is just %d",a);
//        }
        //9.For loop
//        for (int i = 1; i <=5 ; i++){
//            System.out.println("Hello World " + i);
//        }
//        for (int i = 5; i > 1 ; i--){
//            System.out.println("Hello World " + i);
//        }
        //10.while loop
//        String input= "";
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input : ");
//        System.out.print(input);
//        while (!input.equals("quit")){
//            input = scanner.next().toLowerCase(Locale.ROOT);
//            System.out.println(input);
//        }
        //11.Do while loop
//        int i = 0;
//        do {
//            System.out.println("Hello world " + i);
//            i++;
//        }while (i < 5);
//        int j = 0;
//        do {
//            System.out.println("Hello world Hi " + j);
//            j++;
//        }while (j > 5);
        //12.Break and continue statements
//        String input= "";
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input : ");
//        System.out.print(input);
//        while (true) {
//            input = scanner.next().toLowerCase(Locale.ROOT);
//            if (input.equals("quit"))
//                break;
//            if (input.equals("pass"))
//                continue;
//            System.out.println(input);
//        }
        //for each loop
//        String[] fruits = {"Apple","Mango","Orange"};
//       for (int i = fruits.length-1; i >= 0; i--)
//            System.out.println(fruits[i]);
//       for (String fruit : fruits)
//           System.out.println(fruit);
        //13.mortage calculator
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter principal amount : ");
//        int principal = input.nextInt();
//        System.out.print("Enter rate of interest : ");
//        float interestRate = input.nextFloat();
//     System.out.print("Enter years : ");
//        short years = input.nextShort();
//     byte months = 12;
//     int percentage = 100;
//     if (principal < 1000 || principal > 1000000)
//         System.out.println("Enter a number between 1000 and 1000000");
//     if (interestRate <= 0 || interestRate > 30)
//         System.out.println("Enter number greaterthan 0 and lessthan or equal to 30");
//     if (years <=0 || years > 30)
//         System.out.println("Enter a value between 1 and 30");
//     if (principal >= 1000 && principal <= 1000000){
//         if (interestRate > 0 && interestRate <= 30){
//             if (years > 0 && years <= 30){
//                 float percentageMonthly = interestRate/percentage/months;
//                 int totalYears = years * months;
//                 double mortage = principal * percentageMonthly * (Math.pow((1+percentageMonthly),(totalYears))) / ((Math.pow((1+percentageMonthly),(totalYears)))-1);
//                 String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
//                 System.out.println("Mortage : "+mortageFormatted);
//             }
//         }
//     }
//part 2 object-oriented programming
//        TextBox textBox1 = new TextBox();
//        textBox1.setText("Box 1");
//        System.out.println(textBox1.text.toUpperCase());
//        var textbox2 = new TextBox();
//        textbox2.setText("Box 2");
//        String t = textbox2.text;
//        System.out.println(t);
//        System.out.println(textbox2.text);
//        var textbox3 = textbox2;
//        System.out.println(textbox3.text);
        //6.procedural programming
//        int baseSalary = 50_000;
//        int extraHours = 10;
//        int hourlyRate = 200;
//        int wage = calculateWage(baseSalary, extraHours, hourlyRate);
//        System.out.println(wage);
        //object-oriented programming with Encapsulation and method overloading, constuctor overloading, static fields and static methods
//        Employee wage = new Employee(100000);
//        int totalPayment = wage.calculateWage();
//        System.out.println(totalPayment);
//        System.out.println( Employee.numbersOfEmployee);
//        Employee.totalEmployees();
//        //11.Reducing coupling
//        var browser = new Browser();
//        browser.navigate("1234567890");
        //Refactoring mortage calculator project
//        final int PRINCIPAL_MIN = 1000;
//        final int PRINCIPAL_MAX = 1_000_000;
//
//        int principal = (int) Console.readNumber("Principal: ", PRINCIPAL_MIN, PRINCIPAL_MAX);
//
//        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
//
//        int years = (int) Console.readNumber("Period (Years): ", 1, 30);
//
//        var calculator = new MortageCalculator(principal, annualInterest, years);
//        var report = new MortageReport(calculator);
//
//        report.printMortgage();
//
//        report.printPaymentSchedule();
        //ipl project
        //problem 1
//        String file = "src\\matches.csv";
//        BufferedReader reader = null;
//        String line = "";
//        HashMap<java.lang.String, Integer> year = new HashMap<java.lang.String, Integer>();
//        try{
//            reader = new BufferedReader(new FileReader(file));
//            while((line=reader.readLine()) != null){
//                String[] row = line.split(",");
//                if(year.containsKey(row[1])){
//                    year.put(row[1],(year.get(row[1]))+1);
//                }
//                else
//                {
//                    year.put(row[1],1);
//                }
//            }
//            year.remove("season");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.print(year);
        //problem2
//        String file = "src\\matches.csv";
//        BufferedReader reader = null;
//        String line = "";
//        HashMap<java.lang.String, Integer> won = new HashMap<java.lang.String, Integer>();
//        try{
//            reader = new BufferedReader(new FileReader(file));
//            while((line=reader.readLine()) != null){
//                String[] row = line.toLowerCase(Locale.ROOT).split(",");
//                if(won.containsKey(row[4])){
//                    if(Objects.equals(row[4], row[10])){
//                        won.put(row[4],(won.get(row[4]))+1);
//                    }
//                }
//                else {
//                    if (Objects.equals(row[4], row[10])){
//                        won.put(row[4],1);
//                    }
//                    else {
//                        won.put(row[4],0);
//                    }
//                }
//
//            }
//            won.remove("team1");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.print(won);
//        //problem 3
//        int k = 0;
//        int v = 0;
//        String file = "src\\deliveries.csv";
//        BufferedReader reader = null;
//        String line = "";
//        HashMap<String, Integer> extra = new HashMap<String, Integer>();
//        try{
//            reader = new BufferedReader(new FileReader(file));
//            while((line=reader.readLine()) != null){
//                String[] row = line.toLowerCase(Locale.ROOT).split(",");
//                if (!Objects.equals(row[0], "match_id")){
//                    k = Integer.parseInt(row[0]);
//                }
//                if(k >= 577){
//                    v = Integer.parseInt(row[16]);
//                    if(extra.containsKey(row[2]))
//                    {
//                        extra.put(row[2], (extra.get(row[2])) + v);
//                    }
//                    else
//                    {
//                        extra.put(row[2],v);
//                    }
//                }
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.print(extra);
        //inheritance
//       var UI = new UIControl(true);
//        System.out.println((UI.isEnabled));
//        UI.enable();
//        System.out.println(UI.isEnabled);
//        UI.diable();
//        System.out.println(UI.isEnabled);
//        var textbox = new TextBox();
//        System.out.println(textbox.isEnabled);
//        System.out.println(textbox.getClass());
//        System.out.println(textbox.equals(UI));
//        System.out.println(textbox.hashCode());
//        System.out.println(textbox.toString());
//        System.out.println(UI.hashCode());
//        System.out.println(UI.toString());
//            System.out.println(textbox);
//            textbox.setText("HelloWorld");
//            textbox.toString();
//        System.out.println(textbox);
        //comparing objects
//        var point = new Point(1,2);
//        var point2 = new Point(1,2);
//        System.out.println( point.equals(point2));
//        System.out.println( point.equals(textbox));
//        System.out.println(point.hashCode());
//        System.out.println(point2.hashCode());
        //Polymorphism
//        UIControl[] controls = {new TextBox(), new CheckBox()};
//        for (var control : controls) {
//            control.render();
//            control.clear();
//        }
//        UIControl cn = new TextBox();
//        cn.clear();
//    }
//    //6.procedural programming function
////    public static int calculateWage(int baseSalary, int extraHours,int hourlyRate){
////        return  (baseSalary + (extraHours * hourlyRate));
//         }
//        Lambdas
//         public static void show(){
//            greet(System.out::println);
//        greet(System.out::println);
//         }
//
//    private static void greet(Printer message) {
//        message.print("Hello World");
    }

}