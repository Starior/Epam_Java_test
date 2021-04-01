package com.starion.loki.algorithmization.n_dimensional_arrays;

public class Task_16 {
    public static void main(String[] args) {
        int[][] nums;
        int[][] numsTemp;
        int n = 12;
        nums = new int[n][n];
        final int i1 = (nums.length) * ((nums.length) * (nums.length) + 1) / 2;
        System.out.println(i1);
        int k = 1;
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 1; j++) {
                nums[i][j] = k;
                k++;
                System.out.printf("%5.3s", nums[i][j]);
            }
            System.out.println();
        }

        numsTemp = new int[n + n - 2][n];

        int iPos = nums.length / 2 - 1;
        int jPos = 0;
        int numG = 0;
        for (int cycle = 1; cycle <= nums.length / 2; cycle++) {

            if (cycle % 2 != 0) {
                jPos = 0;
            } else {
                jPos = nums.length - 1;
            }
            for (int num = numG + 1; num <= nums.length * 2 * cycle; num++) {
                if (cycle % 2 != 0) {
                    if (num <= nums.length / 2 + numG) {
                        numsTemp[iPos][jPos] = num;
                        iPos--;
                        jPos++;
                    }
                    if (num > nums.length / 2 + numG && num <= nums.length + numG) {
                        iPos++;
                        numsTemp[iPos][jPos] = num;
                        jPos++;
                    }
                    if (num > nums.length + numG && num <= nums.length / 2 + nums.length + numG) {
                        iPos++;
                        jPos--;
                        numsTemp[iPos][jPos] = num;
                    }
                    if (num > nums.length / 2 + nums.length + numG && num <= nums.length * 2 + numG) {
                        jPos--;
                        numsTemp[iPos][jPos] = num;
                        iPos--;
                    }

                }
                if (cycle % 2 == 0) {
                    if (num <= nums.length / 2 + numG) {
                        numsTemp[iPos][jPos] = num;
                        iPos--;
                        jPos--;
                    }
                    if (num > nums.length / 2 + numG && num <= nums.length + numG) {
                        iPos++;
                        numsTemp[iPos][jPos] = num;
                        jPos--;
                    }
                    if (num > nums.length + numG && num <= nums.length / 2 + nums.length + numG) {
                        iPos++;
                        jPos++;
                        numsTemp[iPos][jPos] = num;
                    }
                    if (num > nums.length / 2 + nums.length + numG && num <= nums.length * 2 + numG) {
                        jPos++;
                        numsTemp[iPos][jPos] = num;
                        iPos--;
                    }

                }
            }
            numG = nums.length * 2 * cycle;
            iPos = iPos + 2;
        }

        System.out.println();

        for (int i = 0; i <= numsTemp.length - 1; i++) {
            for (int j = 0; j <= numsTemp[0].length - 1; j++) {
                System.out.printf("%5.3s", numsTemp[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i <= numsTemp.length - 1; i++) {
            for (int j = 0; j <= numsTemp[0].length - 1; j++) {
                if (numsTemp[i][j] != 0 && i < nums.length / 2 - 1) {
                    numsTemp[i + nums.length][j] = numsTemp[i][j];
                }
                if (numsTemp[i][j] != 0 && i > (nums.length + nums.length / 2 - 2)) {
                    numsTemp[i - nums.length][j] = numsTemp[i][j];
                }
            }

        }
        System.out.println();

        for (int i = 0; i <= numsTemp.length - 1; i++) {
            for (int j = 0; j <= numsTemp[0].length - 1; j++) {
                System.out.printf("%5.3s", numsTemp[i][j]);
            }
            System.out.println();
        }
        System.out.println();


        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 1; j++) {
                nums[i][j] = numsTemp[i + nums.length / 2 - 1][j];
            }
        }
        System.out.println();
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 1; j++) {
                System.out.printf("%5.3s", nums[i][j]);
            }
            System.out.println();
        }
        System.out.println(check(nums));
    }
    private static boolean check(int[][] nums) {
        final int i1 = (nums.length) * ((nums.length) * (nums.length) + 1) / 2;
        int sumDM = 0;
        int sumDO = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            int sum = 0;
            int sumCol = 0;
            for (int j = 0; j <= nums.length - 1; j++) {
                if (i == j)
                    sumDM = sumDM + nums[j][i];
                if (j == nums.length - 1 - i)
                    sumDO = sumDO + nums[j][i];
                sum = sum + nums[i][j];
                sumCol = sumCol + nums[j][i];
            }
            if (sum != i1 || sumCol != i1) {
                // System.out.println(sum);
                return false;
            }
        }
        if (sumDM != i1 || sumDO != i1) {
            // System.out.println(sum);
            return false;
        }
        return true;
    }
}
