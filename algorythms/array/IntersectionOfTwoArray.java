package algorythms.array;

import java.util.ArrayList;
import java.util.List;

class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] input2 = new int[] { 1, 1 };
        int[] input1 = new int[] { 3, 1, 5 };
        int[] output;
        List<Integer> input11 = new ArrayList<Integer>();
        List<Integer> input21 = new ArrayList<Integer>();
        List<Integer> temp = new ArrayList<Integer>();

        for (int i = 0; i < input1.length; i++) {
            input11.add(input1[i]);
        }

        for (int i = 0; i < input2.length; i++) {
            input21.add(input2[i]);
        }

        if (input1.length <= input2.length) {
            for (int i = 0; i < input11.size(); i++) {
                for (int j = 0; j < input21.size(); j++) {
                    if (input11.get(i).equals(input21.get(j))) {
                        input21.remove(j);
                        temp.add(input11.get(i));
                        break;
                    }
                }
            }
            output = new int[temp.size()];
            for (int index = 0; index < temp.size(); index++) {
                output[index] = temp.get(index);
            }
            // return output;
        } else {
            for (int i = 0; i < input21.size(); i++) {
                for (int j = 0; j < input11.size(); j++) {
                    if (input21.get(i).equals(input11.get(j))) {
                        input11.remove(j);
                        temp.add(input21.get(i));
                        break;
                    }
                }
            }
            output = new int[temp.size()];
            for (int index = 0; index < temp.size(); index++) {
                output[index] = temp.get(index);
            }
            // return output;
        }

    }
}