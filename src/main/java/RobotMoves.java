//import java.util.ArrayList;
//
//public class RobotMoves {
//    public static String[] solution(String[] commands) {
//        ArrayList<String> outputValues = new ArrayList<String>();
//        for (int i = 0; i < commands.length; i++){
//        if (inCircle(commands)){
//            outputValues.add("YES");
//        }else{
//            outputValues.add("NO");
//        }
//    }
//    return outputValues.toArray(new String[0]);
//
//    }
//
//    private static boolean inCircle(String[] commands) {
//        int[] current={0,0};
//        int pre=0;
//        walk(commands, pre, current);
//        if (current[0]==0 && current[1]==0){
//            return true;
//        }else{
//            return false;
//    }
//
//}
//
//    private static void walk(String commands, int pre, int[] current) {
//                if (commands.substr(i,1)=="R"){
//                    pre+=90;
//                    if (pre==360) pre=0;
//                }else if (command.substr(i,1)=="L"){
//                    pre-=90
//                }else{
//                    switch(pre){
//                        case 0:
//                            current[1]++;
//                            break;
//                        case 90:
//                            current[0]++;
//                            break;
//                        case 180:
//                            current[1]--;
//                            break;
//                        case 270:
//                            current[0]--;
//                            break;
//                    }
//
//                }
//            }
//        }
//    }
//}
