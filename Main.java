class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts"); 
    int total = 55*11;
    double blue = total * .24;
    System.out.println("blue: " + blue);
    double brown  = total * .13;
    System.out.println("brown: " + brown);
    double green= total * .16;
    System.out.println("green: " + green);
    double orange = total * .20;
    System.out.println("orange: " + orange);
    double red = total * .13;
    System.out.println("red: " + red);
    double yellow = total * .14;
    System.out.println("yellow: " + yellow);
    double sum = blue + brown + green + orange + red + yellow; 
    System.out.println("sum: " + sum);
    if (blue > brown && red > orange)
    System.out.println("Blue over Brown and Red over Orange");
    if (brown <= green)
    System.out.println("Brown is less than or equal to Green");
    if (sum == total);
    System.out.println("Numbers match");

    }
}
