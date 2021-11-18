package com.testtt;

import java.util.Scanner;

public class Solution {

        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            String medicinename;
            String batch;
            String disease;
            int price;
            medicine medicines[]=new medicine[4];
            for(int i=0;i<4;i++)
            {
                medicinename=sc.nextLine();
                batch=sc.nextLine();
                disease=sc.nextLine();
                price=sc.nextInt();
                sc.nextLine();
                medicines[i]=new medicine(medicinename,batch,disease,price);
            }
            String medicinetype=sc.nextLine();
            medicine answer[]=medicinenumber(medicinetype,medicines);
            for(int i=0;i<4;i++)
            {
                if(answer[i]!=null)
                {
                    System.out.println(answer[i].price);
                }
            }
        }

        public static medicine[] medicinenumber(String medicinetype,medicine medicines[])
        {
            int j=0;
            medicine temp[]=new medicine[4];
            for(int i=0;i<4;i++)
            {
                if(medicines[i].disease.equals(medicinetype))
                {
                    temp[j++]=medicines[i];
                }
            }
            for(int i=0;i<j;i++)
            {
                for(int k=0;k<j-1;k++)
                {
                    if(temp[k].price>temp[k+1].price)
                    {
                        medicine med;
                        med=temp[k];
                        temp[k]=temp[k+1];
                        temp[k+1]=med;
                    }
                }
            }
            return temp;
        }
    }
    class medicine
    {
        String medicinename;
        String batch;
        String disease;
        int price;
        medicine(String medicinename,String batch,String disease,int price)
        {
            this.medicinename=medicinename;
            this.batch=batch;
            this.disease=disease;
            this.price=price;
        }
    }

