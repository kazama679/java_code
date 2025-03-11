package ss7;

public class B6 {
    public static void main(String[] args) {
        String a = "Hello";
        long startTime = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            a+= "World";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String: " + (endTime - startTime));

        StringBuffer sb2 = new StringBuffer("Hello");
        startTime = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            sb2.append("World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (endTime - startTime));

        StringBuilder sb3 = new StringBuilder("Hello");
        startTime = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            sb3.append("World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (endTime - startTime));
//        String siêu siêu chậm, vì mỗi lần nối chuỗi nó tạo 1 đối tượng ms.
//        StringBuilder nhanh nhất vì nó sử dụng bộ nhớ động k cần tạo đối tượng ms.
//        StringBuffer có tốc độ gần bằng StringBuilder nhưng hỗ trợ đồng bộ hóa, thích hợp cho môi trường đa luồng.
    }
}
