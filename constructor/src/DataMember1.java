 class DataMember1 {
    void type1() {
        System.out.println("Premitive and non premitive data types!!");
    }

 class DataMember2 extends DataMember1 {
     void type1() {
         System.out.println("Both are same!!");
     }

 }
    public static void main(String[] args){
        DataMember1 dm = new DataMember1();
        dm.type1();
    }

}
