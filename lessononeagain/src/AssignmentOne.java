public class AssignmentOne {
    //solves linear equation ax + b = c
    public static double linearProblem(double a, double b, double c){

        return (c-b)/a;
    }
    //Requires 4 numbers of quadratic equation form ax2 + bx + c = constant
    /*
    effects: returns the solution of quadratic formula
    if 0 answers the index position 0 == 0
    if 1 answer the index position 0 == 1 solution in index 1
    if 2 answers the index position 0 == 2 solution in index 1 and 2
     */
    public static double[] quadraticProblem(double a, double b, double c, double constant){
        double[] answer = new double[3];
        c = c - constant;
        //check discriminant
        if((b*b - 4*a*c) < 0 ){
            return answer;
        }
        else if((b*b - 4*a*c) == 0){
            answer[0] = 1;
            answer[1] = Math.round((((b * -1) + Math.sqrt(b*b - 4*a*c))/2*a)*100)/100;
            return answer;
        }
        else{
            answer[0] = 2;
            answer[1] = Math.round((((b * -1) + Math.sqrt(b*b - 4*a*c))/2*a)*100)/100;
            answer[2] = Math.round((((b * -1) - Math.sqrt(b*b - 4*a*c))/2*a)*100)/100;
            return answer;
        }


    }
    public static double cubeRoot(double num){
        double epsilon = .01;
        boolean isNegataive = false;
        if(num < 0){
            isNegataive = true;
            num = num * -1;
        }
        double small = 0;
        double big = num;
        double mid = (small + big)/2;
        while((Math.abs(mid*mid*mid - num)) > epsilon ){
            if(mid*mid*mid > num){
                big = mid;
                mid = (small + big)/2;
            }
            else{
                small = mid;
                mid = (small + big)/2;
            }
        }
        if(isNegataive){
            return (Math.round(mid * 100)/100)*-1;
        }
        return Math.round(mid * 100)/100;
    }

}
