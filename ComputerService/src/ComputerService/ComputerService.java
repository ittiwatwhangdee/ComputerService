package ComputerService;
import java.util.Scanner;
public class ComputerService {
    public static void main(String[] args) {
        
        int loginr = 0;

        char exit;

        //ค่าซ่อม
        int sumfix = 0;
        int fix1 = 700;
        int fix2 = 600;
        int fix3 = 400;
        int fix4 = 200;
        int fix5 = 1500;
        int fix6 = 1500;
        int fix7 = 1500;

        // ค่าอาหาร
        int sumfood = 0;
        int food1 = 60;
        int food2 = 50;
        int food3 = 50;
        int food4 = 35;
        int food5 = 40;
        int food6 = 30;

        //จ่ายเงิน
        int sum = sumfix + sumfood;
        int pay;

        do {
            System.out.println("ศูนย์บริการ Computer Services ยินดีต้อนรับ ");
            System.out.println("โปรดล็อกอิน");
            System.out.println("------------------------------------");
            System.out.println("- Username");
            Scanner username1 = new Scanner(System.in);
            String username = username1.nextLine();
            System.out.println("- Password");
            Scanner password1 = new Scanner(System.in);
            String password = password1.nextLine();
            String user = "ittiwat";
            String pass = "12345";
            System.out.println("------------------------------------");

            if (user.equals(username) && pass.equals(password)) {

                do {
                    System.out.println("สวัสดีคุณ  "+user);

                    System.out.println("กรุณาเลือกรายการ");

                    String[] arlistfix = {"1 - ลง Windows ใหม่         700 บาท", "2 - เปลี่ยนแบตเตอร์รี่โน๊ตบุ๊ต     600 บาท", "3 - เช็คสภาพเครื่อง           400 บาท",
                        "4 - ทำความสะอาด            200 บาท", "5 - เพิ่มระบบ Cooler        1500 บาท",
                        "6 - เปลี่ยนการ์ดจอ AMD       1500 บาท ", "7 - เปลี่ยนการ์ดจอ NVIDIA    1500 บาท"};
                    int listfix = 0;
                    while (listfix < 7) { //วน loop array
                        System.out.println(arlistfix[listfix]);
                        listfix++;
                    }
                    System.out.println("ใส่หมายเลข");
                    Scanner a1 = new Scanner(System.in);
                    String a = a1.nextLine();

                    switch (a) {
                        case "1":
                            System.out.println("ลง Windows ใหม่");
                            sumfix = sumfix + fix1;
                            break;
                        case "2":
                            System.out.println("เปลี่ยนแบตเตอร์รี่โน๊ตบุ๊ต");
                            sumfix = sumfix + fix2;
                            break;
                        case "3":
                            System.out.println("เช็คสภาพเครื่อง");
                            sumfix = sumfix + fix3;
                            break;
                        case "4":
                            System.out.println("ทำความสะอาดภาย");
                            sumfix = sumfix + fix4;
                            break;
                        case "5":
                            System.out.println("เพิ่มระบบ Cooler");
                            sumfix = sumfix + fix5;
                            break;
                        case "6":
                            System.out.println("เปลี่ยนการ์ดจอ AMD");
                            sumfix = sumfix + fix6;
                            break;
                        case "7":
                            System.out.println("เปลี่ยนการ์ดจอ NVIDIA");
                            sumfix = sumfix + fix7;
                            break;

                    }
                    sum = sumfix + sumfood;

                    Scanner exit2 = new Scanner(System.in);
                    System.out.println("ทำรายการเสร็จแล้วให้กด y ถ้าไม่กด n");
                    String exit1 = exit2.nextLine();
                    exit = exit1.toLowerCase().charAt(0);

                } while (exit != 'y');

                System.out.println("รวมราคาค่าซ่อม    " + sumfix + " บาท");
                System.out.println("------------------------------------");

                System.out.println("หากต้องการให้ขับรถไปส่งกด y หากไม่กด n");
                System.out.println("------------------------------------");

                Scanner cargo1 = new Scanner(System.in);
                String cargo = cargo1.nextLine();
                if (cargo.equals("y")) {
                    System.out.println("ตารางเวลารถออกเดินทางจากศูนย์บริการ");

                    String[] arcar = {"09.30 น.", "10.30 น.", "11.30 น.", "12.30 น.", "13.30 น.",
                        "14.30 น.", "15.30 น."};

                    int drink;
                    for (drink = 0; drink < 7; drink++) {
                        System.out.println(arcar[drink]);
                    }
                    System.out.println("------------------------------------");

                } else {
                    System.out.println("เมนูอาหาร - เครื่องดื่ม");

                    String[] food = {"1 - เค้ก             60 บาท", "2 - แซนวิช          50 บาท",
                        "3 - สลัด            50 บาท", "4 - กาแฟเย็น         35 บาท",
                        "5 - ช็อคโกแลตเย็น     40 บาท", "6 - ชาเย็น           30 บาท", "7 - ไม่ต้องการ"};

                    int foodlist = 0;
                    while (foodlist <= 6) {
                        System.out.println(food[foodlist]);
                        foodlist++;
                    }

                    do {
                        System.out.println("ใส่หมายเลข");
                        Scanner b1 = new Scanner(System.in);
                        String b = b1.nextLine();

                        switch (b) {
                            case "1":
                                System.out.println("เค้ก");
                                sumfood = sumfood + food1;
                                break;
                            case "2":
                                System.out.println("แซนวิช");
                                sumfood = sumfood + food2;
                                break;
                            case "3":
                                System.out.println("สลัด");
                                sumfood = sumfood + food3;
                                break;
                            case "4":
                                System.out.println("กาแฟเย็น");
                                sumfood = sumfood + food4;
                                break;
                            case "5":
                                System.out.println("ช็อคโกแลตเย็น");
                                sumfood = sumfood + food5;
                                break;
                            case "6":
                                System.out.println("ชาเย็น");
                                sumfood = sumfood + food6;
                                break;
                            case "7":
                                System.out.println("ไม่ต้องการ");
                                break;
                        }
                        sum = sumfix + sumfood;
                        Scanner exit2 = new Scanner(System.in);
                        System.out.println("ทำรายการเสร็จแล้วให้กด y ถ้าไม่กด n");
                        String exit1 = exit2.nextLine();
                        exit = exit1.toLowerCase().charAt(0);

                    } while (exit != 'y');

                    System.out.println("รวมราคาค่าอาหาร    " + sumfood + " บาท");
                    System.out.println("------------------------------------");

                }

                if (sum >= 1000) {
                    int dissum = sum - ((sum * 10) / 100);
                    total(sumfood, sumfix); // void static เก็บค่าทั้งสองไว้ใน total method
                    System.out.println("***โปรโมชั้น***  เมื่อค่าบริการเกิน 1000 บาท รับส่วนลด 10%");
                    System.out.println("ค่าบริการทั้งหมด     " + dissum + " บาท");

                    Scanner pay1 = new Scanner(System.in);
                    System.out.println("จ่ายเงิน");
                    pay = pay1.nextInt();

                    int x = 0;
                    while (x <= 1) {
                        if (pay < dissum) {
                            System.out.println("เงินไม่พอ");

                            System.out.println("----------------------------");
                            System.out.println("จ่ายเงิน");
                            pay = pay1.nextInt();
                        } else {
                            x++;
                        }
                    }
                    System.out.println("เงินทอน  " + (pay - dissum) + " บาท");

                } else {
                    System.out.println("ค่าบริการทั้งหมด     " + (sum) + " บาท");
                    Scanner pay1 = new Scanner(System.in);
                    System.out.println("จ่ายเงิน");
                    pay = pay1.nextInt();
                    int x = 0;
                    while (x <= 1) {
                        if (pay < sum) {
                            System.out.println("เงินไม่พอ");

                            System.out.println("----------------------------");
                            System.out.println("จ่ายเงิน");
                            pay = pay1.nextInt();
                        } else {
                            x++;
                        }
                    }
                    System.out.println("เงินทอน  " + (pay - sum) + " บาท");
                }

                System.out.println("****ขอบคุณที่ใช้บริการครับ****");
                System.out.println("------------------------------------");

                loginr = loginr + 1;
            } else {
                System.out.println("Wrong Username or Password");
                System.out.println("------------------------------------");

                loginr = loginr + 0;
            }

        } while (loginr != 1);
    }

    public  static void total(int a, int b) { 
        System.out.println("ค่าบริการทั้งหมด     "+(a+b)+"  บาท");
    
    }}
        
        
       
