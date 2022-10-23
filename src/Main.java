import java.time.LocalDate;

public class Main {
    public static void changeYears(int year) {
        if (year % 400 == 0) {
            System.out.println(year + " - год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " - год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println(year + " - год является високосным");
        } else {
            System.out.println(year + " - год не яляется високосным");
        }

    }

    public static void chekingOS(int oS, int yearsOS) {
        int currentYear = LocalDate.now().getYear();
        if (oS == 0 && yearsOS <= currentYear) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (oS == 0 && yearsOS > currentYear) {
            System.out.println("Установите 'lite' версию для IOS по ссылке");
        } else if (oS == 1 && yearsOS <= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (oS == 1 && yearsOS > currentYear) {
            System.out.println("Установите 'lite' версию для Android по ссылке");
        }

    }

    public static void deliveryDistance(int printDistance) {
        if (printDistance >= 0 && printDistance <= 20) {
            System.out.println("Потребуется дней: 1 ");
        } else if (printDistance > 20 && printDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (printDistance > 60 && printDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставка карты больше 3 дней");
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        changeYears(2005);
        System.out.println("Задание 2");
        chekingOS(0, 2000);
        System.out.println("Задание 3");
        deliveryDistance(95);

    }


}
