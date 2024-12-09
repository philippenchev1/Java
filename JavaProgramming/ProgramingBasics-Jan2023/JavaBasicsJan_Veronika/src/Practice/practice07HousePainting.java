package Practice;

import java.util.Scanner;

public class practice07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която да пресмята колко литра боя е нужна за боядисването на къщa.
        // Като за стените се използва зелена боя, а за покрива – червена.
        // Разхода на зелената боя е 1 литър за 3.4 м2, а на червената – 1 литър за 4.3 м2.
        //Стените имат следните размери:
        //•	Предната и задната стена са квадрати със страна „x“
        //o	на предната стена има правоъгълна врата с широчина 1.2м и височина 2м
        //*Cтраничните стени са правоъгълници със страни „x“ и „y“
        //o	и на двете странични стени има по един квадратен прозорец със страна 1.5м

        //Покривът има следните размери:
        //•	Два правоъгълника със страни „x“ и „y“
        //•	Два равностранни триъгълника със страна „x“ и височина „h“
        //Трябва да пресметнете площта на всички страни и площта на покрива, за да
        //намерите колко литра от всяка боя ще са нужни.
        //Вход
        //От конзолата се четат 3 реда:
        //1.	x – височината на къщата – реално число в интервала [2...100]
        //2.	y – дължината на страничната стена – реално число в интервала [2...100]
        //3.	h – височината на триъгълната стена на прокрива – реално число в интервала [2...100]
        //Изход
        //Да се отпечатат на конзолата две числа всяко на нов ред:
        //•	Литрите зелена боя
        //•	Литритe червена боя
        //Форматирани до вторият знак след десетичната запетая.


        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double sideWall = x * y ;
        double window = 2.25;
        double sidewalls = (2 * sideWall) - (2 * window);
        double frontwall = (x * x) - 2.4;
        double backWall = x * x;
        double frontAndBackWalls = frontwall + backWall;
        double totalWallsArea = sidewalls + frontAndBackWalls ;
        double greenPaint = totalWallsArea / 3.4;

        double roofsides = 2 * ( x * y);
        double roofTriangle = 0.5 * x * h;
        double roofTriangles = 2 * roofTriangle;
        double TotalRoofArea = roofsides +  roofTriangles ;
        double redPaint = TotalRoofArea / 4.3;

        System.out.printf("%.2f"+ "%n" + "%.2f" , greenPaint,redPaint);







    }
}
