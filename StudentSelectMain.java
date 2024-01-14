import java.util.*;

interface DisplayChar {
    void disoption();
}

public class StudentSelectMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("+==================================================+");
        System.out.println("Welcome to the STI Character Creation!!");
        System.out.println("+==================================================+");

        StudentSelect player = new StudentSelect();
        player.createCharacter(sc);

        System.out.println("+==================================================+");
        System.out.println("Character Creation Successful!");
        System.out.println("+==================================================+");
        player.disoption();

        sc.close();
    }
}

abstract class Character implements DisplayChar {
    protected String playerName;
    protected String gender;
    protected double height;
    protected double weight;
    protected String hairType;
    protected String hairColor;
    protected String eyebrow;
    protected String eyeshape;
    protected String noseShape;
    protected String faceShape;
    protected String lipsShape;
    protected String earsShape;
    protected String makeup;
    protected String faceAccessories;
    protected String skinTone;
    protected String underwear;
    protected String topClothes;
    protected String bottomWear;
    protected String shoes;
    protected String bodyAccessories;
    protected boolean isHardMode;

    public Character(String playerName, String gender, double height, double weight,
                     String hairType, String hairColor, String eyebrow, String eyeshape,
                     String noseShape, String faceShape, String lipsShape, String earsShape,
                     String makeup, String faceAccessories, String skinTone, String underwear,
                     String topClothes, String bottomWear, String shoes, String bodyAccessories,
                     boolean isHardMode) {
        this.playerName = playerName;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.hairType = hairType;
        this.hairColor = hairColor;
        this.eyebrow = eyebrow;
        this.eyeshape = eyeshape;
        this.noseShape = noseShape;
        this.faceShape = faceShape;
        this.lipsShape = lipsShape;
        this.earsShape = earsShape;
        this.makeup = makeup;
        this.faceAccessories = faceAccessories;
        this.skinTone = skinTone;
        this.underwear = underwear;
        this.topClothes = topClothes;
        this.bottomWear = bottomWear;
        this.shoes = shoes;
        this.bodyAccessories = bodyAccessories;
        this.isHardMode = isHardMode;
    }
    
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setHairType(String hairType) {
        this.hairType = hairType;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setEyebrow(String eyebrow) {
        this.eyebrow = eyebrow;
    }

    public void setEyeshape(String eyeshape) {
        this.eyeshape = eyeshape;
    }

    public void setNoseShape(String noseShape) {
        this.noseShape = noseShape;
    }

    public void setFaceShape(String faceShape) {
        this.faceShape = faceShape;
    }

    public void setLipsShape(String lipsShape) {
        this.lipsShape = lipsShape;
    }

    public void setEarsShape(String earsShape) {
        this.earsShape = earsShape;
    }

    public void setMakeup(String makeup) {
        this.makeup = makeup;
    }

    public void setFaceAccessories(String faceAccessories) {
        this.faceAccessories = faceAccessories;
    }

    public void setSkinTone(String skinTone) {
        this.skinTone = skinTone;
    }

    public void setUnderwear(String underwear) {
        this.underwear = underwear;
    }

    public void setTopClothes(String topClothes) {
        this.topClothes = topClothes;
    }

    public void setBottomWear(String bottomWear) {
        this.bottomWear = bottomWear;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    public void setBodyAccessories(String bodyAccessories) {
        this.bodyAccessories = bodyAccessories;
    }

    public void setIsHardMode(boolean isHardMode) {
        this.isHardMode = isHardMode;
    }
    
    
    public String getPlayerName() {
        return playerName;
    }

    public String getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
    public String getHairType() {
        return hairType;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getEyebrow() {
        return eyebrow;
    }

    public String getEyeshape() {
        return eyeshape;
    }

    public String getNoseShape() {
        return noseShape;
    }

    public String getFaceShape() {
        return faceShape;
    }

    public String getLipsShape() {
        return lipsShape;
    }

    public String getEarsShape() {
        return earsShape;
    }

    public String getMakeup() {
        return makeup;
    }

    public String getFaceAccessories() {
        return faceAccessories;
    }

    public String getSkinTone() {
        return skinTone;
    }

    public String getUnderwear() {
        return underwear;
    }

    public String getTopClothes() {
        return topClothes;
    }

    public String getBottomWear() {
        return bottomWear;
    }

    public String getShoes() {
        return shoes;
    }

    public String getBodyAccessories() {
        return bodyAccessories;
    }

    public boolean getIsHardMode() {
        return isHardMode;
    }

    public abstract void createCharacter(Scanner sc);

    public abstract void disoption();
}


class StudentSelect extends Character {

    public StudentSelect() {
        super("", "", 0, 0, "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", false);
    }

    @Override
    public void createCharacter(Scanner sc) {
        System.out.print("Enter your In-Game Name (IGN) or name: ");
        playerName = sc.nextLine();


        System.out.println("\nGender Options:");
        System.out.println("1. Male");
        System.out.println("2. Female");

        int genderChoice = getIntEnter(sc, "Enter the number you want as gender (1 for Male, 2 for Female): ");
        gender = (genderChoice == 1) ? "Male" : "Female";
        System.out.println("+==================================================+");
       
        while (true){
        height = getDoubleEnter(sc, "\nEnter your height (in cm): ");
        if (height >= 55 && height <=270){
            break;
        } else{
        System.out.println("Invalid Height, Please enter between 55 to 270");
            }
        }
        System.out.println("+==================================================+");
        
        while (true){
        weight = getDoubleEnter(sc, "Enter your weight (in kilograms): ");
        if (weight >= 3 && weight <=635){
            break;
            } else{
                 System.out.println("Invalid Weight, Please enter between 3 to 635");
            }
        }
        System.out.println("+==================================================+");

        hairType = getCharOpt(sc,
                "Enter the number you want as Hair Type: ",
                5, new String[] { "Mullet", "Faded", "Long Hair", "Short Hair", "Buzz hair" });
        System.out.println("Hair Type: " + hairType);
        System.out.println("+==================================================+");

        hairColor = getCharOpt(sc,
                "Enter the number you want as Hair Color: ",
                5, new String[] { "Red", "Black", "Grey", "Yellow", "White" });
        System.out.println("Hair Color: " + hairColor);
        System.out.println("+==================================================+");

        eyebrow = getCharOpt(sc,
                "Enter the number you want as Eyebrow type: ",
                5, new String[] { "Straight", "Arched", "S Rounded", "S-Shape", "Upward" });
        System.out.println("Eyebrow: " + eyebrow);
        System.out.println("+==================================================+");
        
        eyeshape = getCharOpt(sc,
                "Enter the number you want as Eye Shape type: ",
                5, new String[] { "Round", "Thin Almond Eyes", "Almond Eyes", "Asian Eyes", "Hooded Eyes" });
        System.out.println("Eyebrow: " + eyeshape);
        System.out.println("+==================================================+");

        noseShape = getCharOpt(sc,
                "Enter the number you want as Nose Shape: ",
                5, new String[] { "Concave", "Wavy", "Big", "Straight", "Convex" });
        System.out.println("Nose Shape: " + noseShape);
        System.out.println("+==================================================+");

        faceShape = getCharOpt(sc,
                "Enter the number you want as Face Shape: ",
                5, new String[] { "Round", "Heart", "Square", "Diamond", "Oval" });
        System.out.println("Face Shape: " + faceShape);
        System.out.println("+==================================================+");

        lipsShape = getCharOpt(sc,
                "Enter the number you want as Lips Shape: ",
                5, new String[] { "Heavy upper Lips", "Wide Lips", "Thin lips", "Full lips", "Round Lips" });
        System.out.println("Lips Shape: " + lipsShape);
        System.out.println("+==================================================+");

        earsShape = getCharOpt(sc,
                "Enter the number you want as Ears Shape: ",
                5, new String[] { "Small ears", "Rounded", "Big Ears", "Square Ears", "Attached Lobe" });
        System.out.println("Ears Shape: " + earsShape);
        System.out.println("+==================================================+");

        makeup = getCharOpt(sc,
                "Enter the number you want as Makeup: ",
                5, new String[] {  "Lipstick", "Eye Shadow", "Blush On", "Curler", "Liptint" });
        System.out.println("Makeup: " + makeup);
        System.out.println("+==================================================+");

        faceAccessories = getCharOpt(sc,
                "Enter the number you want as Face Accessories: ",
                4, new String[] { "Piercing", "Shades", "Reading Glasses", "Mask" });
        System.out.println("Face Accessories: " + faceAccessories);
        System.out.println("+==================================================+");

        skinTone = getCharOpt(sc,
                "Enter the number you want as Skin Tone: ",
                5, new String[] { "Brown", "White", "Light Brown", "Black", "Dark" });
        System.out.println("Skin Tone: " + skinTone);
        System.out.println("+==================================================+");

        underwear = getCharOpt(sc,
                "Enter the number you want to wear as Underwear: ",
                5, new String[] { "Brief", "Boxer Short", "Thong", "Panty", "Trunks" });
        System.out.println("Underwear: " + underwear);
        System.out.println("+==================================================+");

        topClothes = getCharOpt(sc,
                "Enter the number you want to wear as Top Clothes: ",
                5, new String[] { "Polo", "P.E", "Long Sleeve", "Blouse", "Sando" });
        System.out.println("Top Clothes: " + topClothes);
        System.out.println("+==================================================+");

        bottomWear = getCharOpt(sc,
                "Enter the number you want to wear as Bottom Clothes: ",
                4, new String[] { "Skirt", "Slacks", "Short", "Jogging Pants" });
        System.out.println("Bottom Wear: " + bottomWear);
        System.out.println("+==================================================+");

        shoes = getCharOpt(sc,
                "Enter the number you want to wear as Shoes: ",
                4, new String[] { "Slides", "Black Shoes", "Heels", "Rubber Shoes" });
        System.out.println("Shoes: " + shoes);
        System.out.println("+==================================================+");

        bodyAccessories = getCharOpt(sc,
                "Enter the number you want as Body Accessories: ",
                5, new String[] { "Bracelet", "Necklace", "I.D.", "Rings", "Earrings" });
        System.out.println("Body Accessories: " + bodyAccessories);
        System.out.println("+==================================================+");
        
        boolean validInput = false;

    while (!validInput) {
    System.out.print("\nDo you want to play in hard mode? (true/false): ");
    String input = sc.nextLine().toLowerCase();

    if (input.equals("true")) {
        isHardMode = true;
        validInput = true;
    } else if (input.equals("false")) {
        isHardMode = false;
        validInput = true;
    } else {
        System.out.println("Invalid input. Please enter 'true' or 'false'.");
    }
}
    }

    @Override
    public void disoption() {
        if (isHardMode) {
            System.out.println("\nWelcome to the hard mode!");
            System.out.println("Your character, " + playerName +  " stand at " + height + " cm tall and weigh " + weight + " kilograms." );
            System.out.println("You chose the following options:");
            System.out.println("Hair Type: " + hairType);
            System.out.println("Hair Color: " + hairColor);
            System.out.println("Eyebrow: " + eyebrow);
            System.out.println("Eyes Shape: " + eyeshape);
            System.out.println("Nose Shape: " + noseShape);
            System.out.println("Face Shape: " + faceShape);
            System.out.println("Lips Shape: " + lipsShape);
            System.out.println("Ears Shape: " + earsShape);
            System.out.println("Makeup: " + makeup);
            System.out.println("Face Accessories: " + faceAccessories);
            System.out.println("Skin Tone: " + skinTone);
            System.out.println("Underwear: " + underwear);
            System.out.println("Top Clothes: " + topClothes);
            System.out.println("Bottom Wear: " + bottomWear);
            System.out.println("Shoes: " + shoes);
            System.out.println("Body Accessories: " + bodyAccessories);
            System.out.println("One day while searching for a college, I stumbled upon STI College, which seemed like the perfect place to study.\n" +
            "Naturally, as with any school, there's a dress code for all students. For female students, this consists of the uniform skirt or slacks, with no visible midriffs or cleavage.\n"+
            "Male students are similarly required to wear the uniform and slacks. Wednesdays are designated as 'wash day,' with specific attire allowed.\n"+
            "Students can wear either the yearly anniversary T-shirt or a white shirt with pants (free of holes and rips), avoiding shorts, sandals, and sleeveless shirts.\n"+
             "Closed shoes are mandatory for everyone. Compliance with the dress code is crucial to prevent ID violations and ensure access to the school building.");
        } else {
            System.out.println("\nWelcome to the standard mode!");
            System.out.println("Your character, " + playerName +  " stand at " + height + " cm tall and weigh " + weight + " kilograms." );
            System.out.println("You chose the following options:");
            System.out.println("Hair Type: " + hairType);
            System.out.println("Hair Color: " + hairColor);
            System.out.println("Eyebrow: " + eyebrow);
            System.out.println("Eyes Shape: " + eyeshape);
            System.out.println("Nose Shape: " + noseShape);
            System.out.println("Face Shape: " + faceShape);
            System.out.println("Lips Shape: " + lipsShape);
            System.out.println("Ears Shape: " + earsShape);
            System.out.println("Makeup: " + makeup);
            System.out.println("Face Accessories: " + faceAccessories);
            System.out.println("Skin Tone: " + skinTone);
            System.out.println("Underwear: " + underwear);
            System.out.println("Top Clothes: " + topClothes);
            System.out.println("Bottom Wear: " + bottomWear);
            System.out.println("Shoes: " + shoes);
            System.out.println("Body Accessories: " + bodyAccessories);
            System.out.println("In the early '80s, four visionaries - Augusto, Herman, Benjamin, and Edgar - founded the Systems Technology Institute (STI) to address the \nscarcity of computer programming professionals.\n" +
            "Their unique Guaranteed Hire Program (GHP) set STI apart, ensuring job placements for qualified graduates in the booming computer industry.\n" +
            "As STI expanded from its first two campuses in 1983 to 63 campuses nationwide, it evolved to offer diverse programs beyond IT.\n" +
            "Over the years, STI continued to innovate, introducing initiatives like the Career Orientation Seminar and the Enrollment to Employment (E2E) System, emphasizing its commitment to producing job-ready graduates in various fields.\n" +
            "Today, STI's impact extends beyond education, addressing the global demand for skilled and socially responsible professionals.");
    }
}

    private static int getIntEnter(Scanner sc, String prompt) {
        int choice = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print(prompt);
                choice = sc.nextInt();
                validInput = (choice >= 1 && choice <= 2); 
                if (!validInput) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); 
            } finally {
                sc.nextLine(); 
            }
        }

        return choice;
    }

    private static double getDoubleEnter(Scanner sc, String prompt) {
        double input = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print(prompt);
                input = sc.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); 
            }
        }

        return input;
    }

    private static String getCharOpt(Scanner sc, String prompt, int numOptions, String[] optionLabels) {
        int choice = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println(prompt);
                for (int i = 0; i < numOptions; i++) {
                    System.out.println((i + 1) + ". " + optionLabels[i]);
                }
                System.out.print("Enter the number you want: ");
                choice = sc.nextInt();
                validInput = (choice >= 1 && choice <= numOptions);
                if (!validInput) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                System.out.println("Press enter to continue");
                sc.nextLine(); 
            } finally {
                
                sc.nextLine(); 
            }
        }
        return optionLabels[choice - 1];
    }
}
