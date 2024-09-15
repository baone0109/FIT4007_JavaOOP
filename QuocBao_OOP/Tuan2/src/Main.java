public class Main{
    public static void main(String[] args) {

//    W02Ex10
//        int tong = 0;
//        int dem = 0;
//        int i = 2;
//        while (dem < 10){
//            tong += i;
//            i += 2;
//            dem++;
//
//        }
//        System.out.println("Tong 10 so chan dau tien la: "+ tong)
//    }
//}

//W02Ex11
//        int i = 1;
//        while (i < 100) {
//            System.out.println(+ i);
//            i += 2;
//        }
//    }}

//W02Ex12
        int i = 1;
        int BoiSo;
        while (true) {
            BoiSo = i * 7;
            if(BoiSo >= 100) {
                break;
            }
        }
        System.out.println(BoiSo);
        i++;
    }
}