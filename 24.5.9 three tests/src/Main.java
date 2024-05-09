public class Main{
    public static void main(String[] args){
//寻找水仙花数
        for (int a = 1; a < 10 ;a++) {
            for (int b = 0; b < 10; b++) {
                for (int c = 0, d; c < 10; c++) {
                    d = 100 * a + 10 * b + c;
                    if (a * a * a + b * b * b + c * c * c == d){
                        System.out.println(d);
                    }
                }
            }
        }
        System.out.println("嘟嘟噜");
        for (int i = 100 ,a,b,c;i < 1000 ; i++){
            c = i % 10;
            b = i / 10 % 10;
            a = i / 100 % 10;
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println(i);
            }
        }
        System.out.println("嘟嘟噜");
//打印九九乘法表
        for(int i = 1; i < 10; i++){
            int j = 1;
            while(j <= i){
                System.out.print(j + "✖" + i + "=" + j*i + "   ");
                j++;
            }
            System.out.print('\n');
            //System.out.println(); 可代替上一句
        }
        System.out.println("嘟嘟噜");
        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                if(j > i) break;
                System.out.print(j + "✖" + i + "=" + j*i + "   ");
            }
            System.out.print("\n");
        }
        System.out.println("嘟嘟噜");
//斐波那契数列
        int target = 7, result;  //target是要获取的数，result是结果
        int a1 = 1,b1 = 1, tmp;
        for(int i = 1;i < target;i++){
            tmp = a1 + b1;
            a1 = b1;
            b1 = tmp;
        }
        result = a1;
        System.out.println(result);

    }
}

