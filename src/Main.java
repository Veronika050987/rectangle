public static void main(String[] args) {
    // Создание двух объектов с разными размерами
    Rectangle rect1 = new Rectangle(5.0, 4.0);
    Rectangle rect2 = new Rectangle(3.5, 6.0);

    // Вывод площади и периметра для первого прямоугольника
    System.out.println("Прямоугольник 1 (размеры: " + rect1.width + "x" + rect1.height + "):");
    System.out.println("Площадь: " + rect1.getArea());
    System.out.println("Периметр: " + rect1.getPerimeter());
    System.out.println();

    // Вывод площади и периметра для второго прямоугольника
    System.out.println("Прямоугольник 2 (размеры: " + rect2.width + "x" + rect2.height + "):");
    System.out.println("Площадь: " + rect2.getArea());
    System.out.println("Периметр: " + rect2.getPerimeter());
    System.out.println();

    // Сравнение площадей через if-else
    if (rect1.getArea() > rect2.getArea()) {
        System.out.println("Площадь первого прямоугольника больше.");
    } else if (rect2.getArea() > rect1.getArea()) {
        System.out.println("Площадь второго прямоугольника больше.");
    } else {
        System.out.println("Площади прямоугольников равны.");
    }
}