public class Season {
    public static final String INCORRECT_NUMBER = "Inccorrect number!";
    public static final String WINTER = "Winter";
    public static final String SPRING = "Spring";
    public static final String SUMMER = "Summer";
    public static final String AUTUMN = "Autumn";

    public static String getSeasonOfTheYear(int value) {
        if (value == 12 || value == 1 || value == 2) {
            return WINTER;
        } else if (value >= 3 && value < 6) {
            return SPRING;
        } else if (value >= 6 && value < 9) {
            return SUMMER;
        } else if (value >= 9 && value < 12) {
            return AUTUMN;
        } else return INCORRECT_NUMBER;
    }
}
