package com.starion.loki.algorithmization.n_dimensional_arrays;

public class Task_16 {
    public static void main(String[] args) {
        int[][] nums;
        int[][] numsTemp;
        int n = 8;
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
        System.out.println();
        if ((n % 2 == 0) && (n % 4 != 0)) {
            int lastIndex = n / 2 / 2 - 1;
            numsTemp = new int[n][n];
            notFourMatrix(numsTemp, n);
            notFourPacking(numsTemp, n);
            print(numsTemp);
        } else if (n % 2 != 0) {
            numsTemp = new int[n + n + 1][n + n + 1];
            oddMatrix(numsTemp, n, 1);
            oddPacking(numsTemp, n);
            oddToN(nums, numsTemp);
            print(nums);
        } else if (n % 2 == 0) {
            numsTemp = new int[n + n - 2][n];
            fourMatrix(numsTemp, n);
            fourPacking(numsTemp, n);
            fourToN(nums, numsTemp);
            print(nums);
        }

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

    private static void print(int[][] nums) {
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums[0].length - 1; j++) {
                System.out.printf("%5.3s", nums[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void fourMatrix(int[][] nums, int n) {
        int iPos = n / 2 - 1;
        int jPos;
        int numG = 0;
        for (int cycle = 1; cycle <= n / 2; cycle++) {
            if (cycle % 2 != 0) {
                jPos = 0;
            } else {
                jPos = n - 1;
            }
            for (int num = numG + 1; num <= n * 2 * cycle; num++) {
                if (cycle % 2 != 0) {
                    if (num <= n / 2 + numG) {
                        nums[iPos][jPos] = num;
                        iPos--;
                        jPos++;
                    }
                    if (num > n / 2 + numG && num <= n + numG) {
                        iPos++;
                        nums[iPos][jPos] = num;
                        jPos++;
                    }
                    if (num > n + numG && num <= n / 2 + n + numG) {
                        iPos++;
                        jPos--;
                        nums[iPos][jPos] = num;
                    }
                    if (num > n / 2 + n + numG && num <= n * 2 + numG) {
                        jPos--;
                        nums[iPos][jPos] = num;
                        iPos--;
                    }

                }
                if (cycle % 2 == 0) {
                    if (num <= n / 2 + numG) {
                        nums[iPos][jPos] = num;
                        iPos--;
                        jPos--;
                    }
                    if (num > n / 2 + numG && num <= n + numG) {
                        iPos++;
                        nums[iPos][jPos] = num;
                        jPos--;
                    }
                    if (num > n + numG && num <= n / 2 + n + numG) {
                        iPos++;
                        jPos++;
                        nums[iPos][jPos] = num;
                    }
                    if (num > n / 2 + n + numG && num <= n * 2 + numG) {
                        jPos++;
                        nums[iPos][jPos] = num;
                        iPos--;
                    }

                }
            }
            numG = n * 2 * cycle;
            iPos = iPos + 2;
        }
    }

    private static void oddMatrix(int[][] nums, int n, int kIndex) {
        int iPos = n;
        int jPos = 1;
        int numG = 0;
        int k = kIndex - 1;
        for (int cycle = 1; cycle <= n; cycle++) {
            int cy = n * cycle;
            for (int num = numG + 1 + k; num <= cy + k; num++) {
                // System.out.println(num);
                nums[iPos][jPos] = num;
                iPos--;
                jPos++;
                // System.out.println(iPos);
                // System.out.println(jPos);
            }
            numG = n * cycle;
            //System.out.println(cycle);
            iPos = iPos + n + 1;
            jPos = jPos - n + 1;
        }
    }

    private static void fourPacking(int[][] nums, int n) {
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums[0].length - 1; j++) {
                if (nums[i][j] != 0 && i < n / 2 - 1) {
                    nums[i + n][j] = nums[i][j];
                }
                if (nums[i][j] != 0 && i > (n + n / 2 - 2)) {
                    nums[i - n][j] = nums[i][j];
                }
            }
        }
    }

    private static void oddPacking(int[][] numsTemp, int n) {
        for (int i = 0; i <= numsTemp.length - 1; i++) {
            for (int j = 0; j <= numsTemp[0].length - 1; j++) {
                if (numsTemp[i][j] != 0 && i < n / 2 + 1) {
                    numsTemp[i + n][j] = numsTemp[i][j];
                }
                if (numsTemp[i][j] != 0 && i > (n + n / 2)) {
                    numsTemp[i - n][j] = numsTemp[i][j];
                }
                if (numsTemp[i][j] != 0 && j < n / 2 + 1) {
                    numsTemp[i][j + n] = numsTemp[i][j];
                }
                if (numsTemp[i][j] != 0 && j > (n + n / 2)) {
                    numsTemp[i][j - n] = numsTemp[i][j];
                }
            }
        }
    }

    private static void fourToN(int[][] nums, int[][] numsTemp) {
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 1; j++) {
                nums[i][j] = numsTemp[i + nums.length / 2 - 1][j];
            }
        }
    }

    private static void oddToN(int[][] nums, int[][] numsTemp) {
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 1; j++) {
                nums[i][j] = numsTemp[i + nums.length / 2 + 1][j + nums.length / 2 + 1];
            }
        }
    }

    private static void notFourMatrix(int[][] numsTemp, int n) {
        n = n / 2;
        int[][] numsTemp1 = new int[n][n];
        int[][] numsTemp2 = new int[n + n + 1][n + n + 1];

        int iPos = 0;
        int jPos = 0;
        int kInd = 1;
        for (int square = 1; square <= 4; square++) {
            switch (square) {
                case (1) -> {
                    iPos = 0;
                    jPos = 0;
                    // kInd = n * n * (square - 1) + 1;
                    // kInd = n * n * (square - 1) + 1;
                }
                case (2) -> {
                    iPos = n;
                    jPos = n;
                    //  kInd = n * n * (square - 1) + 1;
                }
                case (3) -> {
                    iPos = 0;
                    jPos = n;
                    //   kInd = n * n * (square - 1) + 1;
                }
                case (4) -> {
                    iPos = n;
                    jPos = 0;
                    // kInd = n * n * (square - 1) + 1;
                }
            }
            oddMatrix(numsTemp2, n, n * n * (square - 1) + 1);
            oddPacking(numsTemp2, n);
            oddToN(numsTemp1, numsTemp2);
            for (int i = 0; i <= numsTemp1.length - 1; i++) {
                for (int j = 0; j <= numsTemp1.length - 1; j++) {
                    numsTemp[i + iPos][j + jPos] = numsTemp1[i][j];
                }
            }
        }
    }

    private static void notFourPacking(int[][] numsTemp, int n) {
        int temp = 0;
        int lastIndex = n / 2 / 2 - 1;
        for (int i = 0; i <= numsTemp.length - 1; i++) {
            for (int j = 0; j <= numsTemp.length - 1; j++) {
                if (i <= n / 2 / 2 - 1 && j <= n / 2 / 2 - 1) {
                    temp = numsTemp[i][j];
                    numsTemp[i][j] = numsTemp[i + n / 2][j];
                    numsTemp[i + n / 2][j] = temp;
                }
                if (i == n / 2 / 2 && j > 0 && j <= n / 2 / 2 + 1) {
                    temp = numsTemp[i][j];
                    numsTemp[i][j] = numsTemp[i + n / 2][j];
                    numsTemp[i + n / 2][j] = temp;

                }
                if (i > n / 2 / 2 && i < n / 2 && j <= n / 2 / 2 - 1) {
                    temp = numsTemp[i][j];
                    numsTemp[i][j] = numsTemp[i + n / 2][j];
                    numsTemp[i + n / 2][j] = temp;
                }
                if (j > numsTemp.length - 1 - lastIndex && i < n / 2) {
                    temp = numsTemp[i][j];
                    numsTemp[i][j] = numsTemp[i + n / 2][j];
                    numsTemp[i + n / 2][j] = temp;
                }

            }
        }
    }
}
