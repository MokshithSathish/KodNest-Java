
public class Main {

    public static void main(String[] args) {

        String[] name = {"Meera", "Rahul"};
        double[] height = {1.65, 1.75};
        double[] weight = {60.0, 85.0};
        int[] age = {22, 30};
        double[] activityHours = {1.5, 0.5};
        double[] waterIntake = {2.5, 1.5};
        double[] sleepHours = {8.0, 6.0};

        int i = 0;

        while (i < 1) {

            double rawBmi = weight[i] / (height[i] * height[i]);

            double bmi = (double) Math.round(rawBmi * 100.0) / 100.0;

            String bmiCategory;
            if (bmi < 18.5) {
                bmiCategory = "Underweight";
            } else if (bmi < 25.0) {
                bmiCategory = "Normal";
            } else if (bmi < 30.0) {
                bmiCategory = "Overweight";
            } else {
                bmiCategory = "Obese";
            }

            String activityStatus = (activityHours[i] >= 1.0) ? "Good" : "Poor";
            String waterStatus = (waterIntake[i] >= 2.0) ? "Good" : "Poor";
            String sleepStatus = (sleepHours[i] >= 7.0 && sleepHours[i] <= 9.0) ? "Healthy" : "Unhealthy";

            String overallFitness;
            String message;

            if (bmiCategory.equals("Normal")
                    && activityHours[i] >= 1.0
                    && waterIntake[i] >= 2.0
                    && sleepHours[i] >= 7.0
                    && sleepHours[i] <= 9.0
                    && age[i] > 0) {

                overallFitness = "HEALTHY";
                message = "Continue maintaining the same routine.";
            } else {
                overallFitness = "NEEDS IMPROVEMENT";
                message = "Improve your diet, exercise, water intake and sleep.";
            }

            System.out.println("HEALTH AND FITNESS REPORT\n");

            System.out.println("Name: " + name[i]);
            System.out.println("BMI: " + bmi);
            System.out.println("BMI Category: " + bmiCategory);

            System.out.println("\nActivity Status: " + activityStatus);
            System.out.println("Water Intake Status: " + waterStatus);
            System.out.println("Sleep Status: " + sleepStatus);

            System.out.println("\nOverall Fitness Status: " + overallFitness);
            System.out.println("Message: " + message);

            i++;
        }
    }
}
