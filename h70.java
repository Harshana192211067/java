
    interface SubjectScores {
        void setScores(int[] scores);
    }

    interface Calculations {
        void calculateTotal();
        void calculateAggregate();
        void determineGrade();
    }

    class h70 implements SubjectScores, Calculations {
        private int[] scores = new int[6];
        private int total;
        private double aggregate;
        private String grade;

        @Override
        public void setScores(int[] scores) {
            if (scores.length == 6) {
                this.scores = scores;
            } else {
                System.out.println("Please enter exactly 6 scores.");
            }
        }

        @Override
        public void calculateTotal() {
            total = 0;
            for (int score : scores) {
                total += score;
            }
        }

        @Override
        public void calculateAggregate() {
            aggregate = (double) total / 6;
        }

        @Override
        public void determineGrade() {
            if (aggregate > 75) {
                grade = "Distinction";
            } else if (aggregate > 60) {
                grade = "First Division";
            } else if (aggregate > 50) {
                grade = "Second Division";
            } else if (aggregate > 40) {
                grade = "Third Division";
            } else {
                grade = "FAIL";
            }
        }

        public void displayResult() {
            System.out.println("Total Marks: " + total);
            System.out.println("Aggregate: " + aggregate + "%");
            System.out.println("Grade: " + grade);
        }

        public static void main(String[] args) {
            h70 student = new h70();
            int[] scores = {85, 74, 63, 55, 90, 78}; // Example scores
            student.setScores(scores);
            student.calculateTotal();
            student.calculateAggregate();
            student.determineGrade();
            student.displayResult();
        }
    }


