public class MainTwo {
    public static void main(String[] args) {
        Pet pet = new Pet("Fritz", 15, "Texas", "Mixed");

        Pet petTwo = new Pet("Lily Belle", 7, "Texas", "GreatDane");

        Pet petThree = new Pet("Trixie", 3, "Texas", "DomesticBlack");

        Pet petFour = new Pet("Rosemary", 7, "Texas", "DomesticLongHair");

        Paintings painting = new Paintings("Red Moon", "Acrylic", "20x20", 2020);

        Paintings paintingTwo = new Paintings("Green Plate", "Acrylic", "16x18", 2020);

        Paintings paintingThree = new Paintings("Cacti", "Acrylic", "12x12", 2020);

        Paintings paintingFour = new Paintings("Sitters", "Acrylic", "12x12", 2020);


        System.out.println(pet.getName());
        System.out.println(petTwo.getName());
        System.out.println(petThree.getName());
        System.out.println(petFour.getName());
        System.out.println(painting.getName());
        System.out.println(paintingTwo.getName());
        System.out.println(paintingThree.getName());
        System.out.println(paintingFour.getName());
        
        
        

    }


}
