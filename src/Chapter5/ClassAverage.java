package Chapter5;

public class ClassAverage {
        public static void main(String[] args) {
            String[] grades = {"A", "C", "B", "A", "D", "B", "C", "F", "B+", "A-"};

            int total = 0;
            int highest = Integer.MIN_VALUE;
            int lowest = Integer.MAX_VALUE;

            for (String grade : grades) {
                int value = convertGradeToScore(grade);
                total += value;
                if (value > highest) highest = value;
                if (value < lowest) lowest = value;
            }

            double average = total / (double) grades.length;

            System.out.printf("Average Grade: %.2f%n", average);
            System.out.printf("Highest Grade: %s%n", convertScoreToGrade(highest));
            System.out.printf("Lowest Grade: %s%n", convertScoreToGrade(lowest));
        }

        public static int convertGradeToScore(String grade) {
            return switch (grade) {
                case "A" -> 90;
                case "A-" -> 85;
                case "B+" -> 80;
                case "B" -> 75;
                case "C" -> 65;
                case "D" -> 55;
                case "F" -> 40;
                default -> 0;
            };
        }

        public static String convertScoreToGrade(int score) {
            if (score >= 90) return "A";
            else if (score >= 85) return "A-";
            else if (score >= 80) return "B+";
            else if (score >= 75) return "B";
            else if (score >= 65) return "C";
            else if (score >= 55) return "D";
            else return "F";
        }
    }

