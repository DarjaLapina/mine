package testimine_harjutus5;

public class Testimine_Harjutus5 {

public static int countMultiplesOfThree(int A, int B) {
if (A > B) {
return 0;
}
int count = 0;
for (int i = A; i <= B; i++) {
if (i % 3 == 0) {
count++;
}
}
return count;
}
}
